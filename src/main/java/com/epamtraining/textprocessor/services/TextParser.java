package com.epamtraining.textprocessor.services;


import com.epamtraining.textprocessor.entity.CompositePart;
import com.epamtraining.textprocessor.entity.EnumRegularExp;
import com.epamtraining.textprocessor.entity.LeafPart;
import lombok.extern.slf4j.Slf4j;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class TextParser {

    public TextParser() {
    }

    public CompositePart parse(String originalText) {
        //start parse text
        CompositePart allTextComposite = new CompositePart();
        allTextComposite = parseToParagraph(allTextComposite, originalText);
        return allTextComposite;
    }

    private CompositePart parseToParagraph(CompositePart allTextComposite, String text) {

        // parse to paragraph
        Pattern patternParagraph = Pattern.compile(EnumRegularExp.PARAGRAPH.getRegularExp());
        LeafPart paragraphLeaf = null;
        String paragraph = "";

        Matcher matcher = patternParagraph.matcher(text);
        while (matcher.find()) {
            paragraph = matcher.group();

            if (Pattern.matches(EnumRegularExp.LISTING_CODE.getRegularExp(), paragraph)) {
                // if find StartCode - add to list without parsing
                paragraphLeaf = new LeafPart(paragraph);
                //paragraphList.addElement(paragraphLeaf);
                allTextComposite.addElement(paragraphLeaf);
            } else {
                //if not found StartCode - parse to Sentence
                CompositePart paragraphList = new CompositePart();
                allTextComposite.addElement(new LeafPart("\t"));
                paragraphList = parseToSentence(paragraphList, paragraph);
                allTextComposite.addElement(paragraphList);
                allTextComposite.addElement(new LeafPart("\n"));
            }
        }
        return allTextComposite;
    }


    private CompositePart parseToSentence(CompositePart paragraphList, String paragraph) {
        // parse to sentence

        Pattern patternSentence = Pattern.compile(EnumRegularExp.SENTENCE.getRegularExp());
        Matcher matcher = patternSentence.matcher(paragraph);
        String sentence = "";

        while (matcher.find()) {
            CompositePart sentenceList = new CompositePart();
            sentence = matcher.group();
            sentenceList = parseToWord(sentenceList, sentence);
            paragraphList.addElement(sentenceList);
        }
        return paragraphList;
    }

    private CompositePart parseToWord(CompositePart sentenceList, String sentence) {
        // parse to word
        Pattern patternWord = Pattern.compile(EnumRegularExp.WORD.getRegularExp());
        String word = "";
        Matcher matcher = patternWord.matcher(sentence);

        while (matcher.find()) {
            CompositePart wordList = new CompositePart();
            word = matcher.group();
            wordList = parseToSignAndWord(wordList, word);
            sentenceList.addElement(wordList);
        }
        return sentenceList;
    }

    private CompositePart parseToSignAndWord(CompositePart wordList, String word) {
        // parse to sign and word
        String[] text = word.split(EnumRegularExp.WORD_AND_SIGN.getRegularExp());
        for (String string : text) {
            wordList.addElement(new LeafPart(string));
        }
        return wordList;
    }

}