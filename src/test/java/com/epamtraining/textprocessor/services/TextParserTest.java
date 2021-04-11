package com.epamtraining.textprocessor.services;

import com.epamtraining.textprocessor.entity.CompositePart;
import com.epamtraining.textprocessor.entity.IPart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextParserTest {

    @Test
    public void countCompositeParts() {
        String text = "Hello world!";

        TextParser textParser = new TextParser();
        CompositePart allText = textParser.parse(text);
        int partsCount = 0;
        for (IPart part : allText.getPartList()) {
            partsCount++;
        }
        Assertions.assertEquals(partsCount,3);
    }
}
