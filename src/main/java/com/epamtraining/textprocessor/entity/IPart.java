package com.epamtraining.textprocessor.entity;


public interface IPart {

    void addElement(IPart part);

    void toPrint();

    void toDelete();


    String toPrintTested();


}