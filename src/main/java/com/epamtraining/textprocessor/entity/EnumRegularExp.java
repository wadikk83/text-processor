package com.epamtraining.textprocessor.entity;

public enum EnumRegularExp {


    LISTING_CODE("\\s*(Start code)([^\\t]+)(End code)"),

    PARAGRAPH("(?:[^\\n][\\n]?)+"), //"(\\w+)|(\\.{3})|[^\\s]"

    SENTENCE("([^(\\.|!|\\?)]+)(\\.|!|\\?)"),

    WORD("([^(\\s)]*)(\\s)*"),

    //WORD_AND_SIGN("([\\.,!\\?:;@]{1})|([^\\.,!\\?:;@]*)");
    WORD_AND_SIGN("\\b");

    private final String regularExp;

    EnumRegularExp(String regularExp) {
        this.regularExp = regularExp;
    }

    public String getRegularExp() {
        return regularExp;
    }
}
