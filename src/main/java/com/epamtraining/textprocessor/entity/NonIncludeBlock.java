package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;

public class NonIncludeBlock implements CompositeTextParts{

    private String notIncludeText;

    @Override
    public String returnAsString() {
        return notIncludeText;
    }

    @Override
    public void addElementToList(CompositeTextParts element) {

    }

    @Override
    public ArrayList<CompositeTextParts> getListOfElements() {
        return null;
    }
}
