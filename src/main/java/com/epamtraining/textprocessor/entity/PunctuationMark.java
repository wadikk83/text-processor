package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;

public class PunctuationMark implements CompositeTextParts {
    private String punctuationMark;

    public PunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String returnAsString() {
        return punctuationMark;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {

    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
        return null;
    }
}
