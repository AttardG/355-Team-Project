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
 *    Author Thomas Levine / G Attard
 *    Version 04/27/2021   CMSC 355
 **************************************************************************************/

/**************************************************************************************
 *    MessageHarness Class
 ************************************************************************************
 * Function: Test Message.java
 *
 *
 *--------------------------------------------------------------------------------------
 *
 *    @author Thomas Levine / G Attard
 *    @version 04/27/2017  CMCS 355
 **************************************************************************************/
import java.io.*;
import java.util.Scanner;

public class MessageHarness {

    public static void main(String[] args) throws Exception {

        String input = "703, german";
        Process process = Runtime.getRuntime().exec("java Message" + " " + input);

        StringBuilder output = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line + "\n");
        }
        System.out.println(output);
    }
}
© 2022 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
