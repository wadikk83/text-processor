package com.epamtraining.textprocessor.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {

    private final static Logger LOGGER = LoggerFactory.getLogger(FileReader.class);

    public FileReader() {
    }


    public String readFromFile(String filename) {

        LOGGER.trace("Trying to read a file at the path " + filename);

        StringBuilder outputText = new StringBuilder();

        try {
            Scanner in = new Scanner(new File(filename), "UTF-8");
            while (in.hasNext()) {
                outputText.append("\n" + in.nextLine());//add line break because it is not read automatically
            }
        } catch (FileNotFoundException exception) {
            LOGGER.error("File not found on path " + filename);
        } catch (IOException exception) {
            LOGGER.error("IO Exception" + exception);
        }

        outputText.deleteCharAt(0); //remove the first (zero) element - this is a line break

        LOGGER.info("File reading was successful");


        return outputText.toString();
    }
}
