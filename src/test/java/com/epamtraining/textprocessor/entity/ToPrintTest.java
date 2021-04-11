package com.epamtraining.textprocessor.entity;

import com.epamtraining.textprocessor.services.TextParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToPrintTest {

    @Test
    public void toPrint() {
        String text = "Hello world!";

        TextParser textParser = new TextParser();
        CompositePart allText = textParser.parse(text);

        String test = allText.toPrintTested();
        Assertions.assertTrue(true);
    }
}
