package com.epamtraining.textprocessor.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sentence implements CompositeTextParts {

    ArrayList<CompositeTextParts> partsListOfSentence = new ArrayList<>();

    @Override
    public String returnAsString() {
        StringBuilder sentence = new StringBuilder();
        for (CompositeTextParts elemenst : partsListOfSentence) {
            sentence.append(elemenst.returnAsString());
        }
        return String.valueOf(sentence);
    }

    @Override
    public void addElementToList(CompositeTextParts element) {

    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
        return null;
    }
}
