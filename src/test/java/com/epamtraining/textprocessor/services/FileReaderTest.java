package com.epamtraining.textprocessor.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FileReaderTest {

    @Test
    public void testReadFromFileWithEmptyPath() {
        Assertions.assertTrue(new FileReader().readFromFile("").isEmpty());
    }

}