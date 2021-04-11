package com.epamtraining.textprocessor.entity;

import java.util.ArrayList;
import java.util.List;

public class CompositePart implements IPart {
    private final List<IPart> partList = new ArrayList<>();

    public CompositePart() {
        super();
    }

    @Override
    public void addElement(IPart part) {
        partList.add(part);
    }

    @Override
    public void toPrint() {
        for (IPart part : partList) {
            if (part != null) part.toPrint();
        }
    }

    public List<IPart> getPartList() {
        return partList;
    }

    @Override
    public void toDelete() {
        for (IPart part : partList) {
            if (part != null) part.toDelete();
        }
    }
    public String toPrintTested() {
        for (IPart part : partList) {
            if (part != null) return part.toPrintTested();
        }
        return null;
    }
}
