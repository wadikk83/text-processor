package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;

public interface CompositeTextParts {

    public String returnAsString();

    public void addElementToList(CompositeTextParts element);

    public ArrayList<CompositeTextParts> getListOfElements();
}
