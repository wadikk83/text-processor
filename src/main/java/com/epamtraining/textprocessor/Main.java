package com.epamtraining.textprocessor;


import com.epamtraining.textprocessor.entity.CompositeTextParts;
import com.epamtraining.textprocessor.services.FileReader;
import com.epamtraining.textprocessor.services.TextParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static final String PATH_TO_FILE = "./src/main/resources/data.txt";


    public static void main(String[] args) {

        LOGGER.info ("Application Text processor is started at " +
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

        System.out.println("Start application");

        FileReader fileReader = new FileReader();
        String tempText = fileReader.readFromFile(PATH_TO_FILE);
        ArrayList<CompositeTextParts> listOfParagraphs = new TextParser().textParser(tempText);

        LOGGER.info("Application Text processor is finished at " +
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        LOGGER.info("==========================================================================");
    }
}
