package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;

public class Word implements CompositeTextParts {
    String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String returnAsString() {
        return word;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {

    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
        return null;
    }
}
