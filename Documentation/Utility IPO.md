# Utility Layer IPO
Utility:
-	Serve common non-functional support for Messages.
- Handles Error Messages and translating them

Author: G Attard

| Input | Process | Output
|---|---|---|
| error code, language | find error message for the error code | Return error message in language specified |
| 404, german | get the tranlated error message from msgGer.txt  | return Nicht gefunden |


Inputs:
- error code, language

Process:
- 

Outputs:
- error code message in language specified

Message Pseudo Code: Done by Aaliyah
```
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
```
