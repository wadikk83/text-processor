package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;

public class Text implements CompositeTextParts {

    private ArrayList<CompositeTextParts> listOfParagraphs = new ArrayList<>();

    public Text() {
    }

    @Override
    public String returnAsString() {
        StringBuilder text = new StringBuilder();
        for (CompositeTextParts elements : listOfParagraphs) {
            text.append(elements.returnAsString());
        }
        return String.valueOf(text);
    }

    @Override
    public void addElementToList(CompositeTextParts paragraph) {
        listOfParagraphs.add(paragraph);
    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
        return listOfParagraphs;
    }
}
