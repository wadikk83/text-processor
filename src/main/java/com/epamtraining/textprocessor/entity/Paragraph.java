package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;

public class Paragraph implements CompositeTextParts {

    private ArrayList<CompositeTextParts> listOfSentences = new ArrayList<>();

    @Override
    public String returnAsString() {
        StringBuilder paragraph = new StringBuilder();
        for (CompositeTextParts elements : listOfSentences) {
            paragraph.append(elements.returnAsString());
        }
        return String.valueOf(paragraph);
    }

    @Override
    public void addElementToList(CompositeTextParts sentence) {
        listOfSentences.add(sentence);
    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
        return listOfSentences;
    }
}
