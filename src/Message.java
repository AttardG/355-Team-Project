/**************************************************************************************
 *    Utility Module
 *
 * Component: Message
 ***************************************************************************************
 * Function:
 *   Serve common non-functional support for Messages.
 *      Handles Error Messages and translating them
 *----------------------------------------------------------------------------------------------------------------------------------------
 *    Input:
 *          Parameters - error code
 *                      - language
 *    Output:
 *          Return - Return error message
 *
 *----------------------------------------------------------------------------------------------------------------------------------------
 *    Author Thomas Levine / Aaliyah Souleyman / G Attard
 *    Version 04/27/2021   CMSC 355
 **************************************************************************************/

/**************************************************************************************
 *    Message Class
 ************************************************************************************
 * Function: Main() - Handles Error Messages
 *
 *
 *--------------------------------------------------------------------------------------
 *
 *    @author Thomas Levine / Aaliyah Souleyman / G Attard
 *    @version 04/27/2017  CMCS 355
 **************************************************************************************/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Message {

    public static String textBroker(String input) {
        // input str: "message.txt, german"
        String[] tokens = input.split(",");
        tokens[1] = tokens[1].replace(" ", "");
        try {
            File file = new File(tokens[0]);

            Scanner fileReader = new Scanner(file);

            ArrayList<String> parsedFile = new ArrayList<>();

            while (fileReader.hasNextLine()) {
                parsedFile.add(fileReader.nextLine());
            }

            for (String s : parsedFile) {
                String[] record = s.split(",");
                tokens[1] = tokens[1].toUpperCase();


                if (record[0].equalsIgnoreCase(tokens[1])) {
                    // found match
                    //System.out.println("Found match"); /* <---- STUB TEST */
                    if (record[1].charAt(0) == ' ') {
                        record[1] = record[1].substring(1);
                    }
                    //System.out.println("File to be returned: " + record[1]);
                    return record[1];
                }
            }

        } catch (Exception ex) {

        }
        return "Record not found";
    }

    public static void main(String[] args) throws IOException {
//Read in argument from commandline 	
//if there is a comma then there is a specified language, so we use the text broker method to find the corresponding msgLangauge.txt file
        //tokenize input
        //token[0] = error code
        //token[1] = language
        // use the text broker method to return corresponding msgLanguage file
        // use the text broker method again to return the translated error message in the corresponding msgLanguage file
        //prints message in specified translation for bufferedreader
//else there is no specified language then assume the error messages should be in english
        // use the text broker method to return the translated error message in english
        //prints message in specified translation for bufferedreader
//end module

        //Message.java
        //example input : "703, german"
        //example return: "Service nicht gefunden"

        //TextBroker method
        //Example args: "message.txt, german" 
        //Example return: "msgGer.txt"
        //Example args: "msgGer.txt, 401"
        //Example return: "Nicht gefunden"


        //example input : "703"
        //example return: "Service not found"
        String input = args[0];

        if (input.contains(",")) {    //if there is a comma then there is a specified language, so we use the text broker method to find the corresponding msgLangauge.txt file
            String[] tokens = input.split(",");
            //token[0] = error code
            //token[1] = language

            // use the text broker method to return corresponding msgLanguage file
            String arg1 = "txtFiles/message.txt, " + tokens[1];
            String file1 = textBroker(arg1);

            // use the text broker method again to return the translated error message in the corresponding msgLanguage file
            String result = textBroker(file1 + "," + tokens[0]);

            //prints message in specified translation for bufferedreader
            System.out.println(result);

        } else {    //else there is no specified language then assume the error messages should be in english

            // use the text broker method to return the translated error message in english
            String result = textBroker("txtFiles/msgEng.txt," + input);
            result = result.replace("\"", "");
            //prints message in specified translation for bufferedreader
            System.out.println(result);
        }

    }
}
