package com.epamtraining.textprocessor;

import com.epamtraining.textprocessor.entity.CompositePart;
import com.epamtraining.textprocessor.services.FileReader;
import com.epamtraining.textprocessor.services.TextParser;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Slf4j
public class Main {
    public static final String PATH = "./src/main/resources/data.txt";
    public static final Integer WORD_LENGTH = 8;

    public static void main(String[] args) {

        log.info("Application Text processor is started at " +
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        System.out.println("Start application");

        FileReader fileReader = new FileReader();
        String originalText = fileReader.readFromFile(PATH);

        TextParser textParser = new TextParser();
        CompositePart allText = textParser.parse(originalText);


        System.out.println("==================================================================================================================");
        allText.toPrint();
        System.out.println("==================================================================================================================");
        allText.toDelete();
        allText.toPrint();


        log.info("Application Text processor is finished at " +
                new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        log.info("==========================================================================");
    }
}
