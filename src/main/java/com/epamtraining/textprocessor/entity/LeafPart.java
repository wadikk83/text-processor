package com.epamtraining.textprocessor.entity;

import com.epamtraining.textprocessor.Main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeafPart implements IPart {

    String keywords;

    public LeafPart(String keywords) {
        super();
        this.keywords = keywords;
    }

    @Override
    public void addElement(IPart part) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void toPrint() {
        System.out.print(this.keywords);
    }

    @Override
    public String toPrintTested() {
        return this.keywords;
    }

    @Override
    public void toDelete() {
        char[] chars = "bcdfghjklmnpqrstvwxyzбвгджзклмнпрстхцчщ".toCharArray();
        Arrays.sort(chars);
        Matcher matcher = Pattern.compile("\\b[аеёиоуыэюяАЕЁИОУЭЮЯ]\\S+\\b").matcher(keywords);
        while (matcher.find()) {
            if (keywords.length() == Main.WORD_LENGTH) {
                this.keywords = "<deleted>";
            }
        }
    }
}
