# Translator and Tax Calculator Task IPOs
Translator:
-	3 different languages 
-	User will pick one of three languages and then type an English word to be translated into the chosen language 
-	The foreign word will be displayed next to the English word the user provided 
-	Words can be provided in a sequence 
-	Make for easy implementation with other languages 

| Input | Process | Output
|---|---|---|
|Language type | Set the input language as the language to translate to | |
| English word to translate | Translate from English to set 'end' language |English word translated to previously determined language type |

Tax Calculator: 
-	Tax tables for 2020 and 2021
-	User inputs year 
-	User inputs gross income 
-	App returns taxes to be paid
-	User can change income to be calculated
-	User can change tax year 
-	Make for easy implementation with other tax years 

| Input | Process | Output
|---|---|---|
|Tax year | Set the input year as the year to calculate for  | |
|Marital Status | Set the input status as the current status  | |
|Income | Calculate taxes due with currently set year, status, and income   | Tax due|

```
* ****************************************************************
* Tax Calculator Pseudocode  
Author: E Estwick  
*-----------------------------------------------------------------------------------------------------  
* takes a file, looks up tax percentage, calculates tax due given year, status, and income input.  
*----------------------------------------------------------------------------------------------  
* Input: Year, Status, Income  
* Output: Tax Due, Error Message (when necassary)   
******************************************************************  

////////////////// tax broker can be called to find the appropriate tax.txt file  
//1st argument into taxStatus   
//foundStatus = "No"  
// Open tax.txt file  
//Read first entry in tax.txt file  
//While foundStatus = "No", or while the file still has entries    
//  Read entry   
//  If entry = taxStatus   
//    foundStatus = "Yes"  
//  Else  
//    move to next record in tax.txt  
//  End If  
// End While  
Open appropriate tax text file returned by broker     
First element in record = maxIncome    
Second element in record = taxPercent    
Read user's income = userIncome    
taxDue initialized   
returnedData = "no"    
For all records in taxStatus.txt file     
  if user income > maxIncome    
    move to next record/percentage    
  if user income < maxIncome    
    taxDue = userIncome * taxPercent  
		returnedData = "yes"  
  else     
//moving to final bracket as the income does not fit with the previous brackets :)    
    move to final record    
    taxDue = userIncome * taxPerecnt  
		returnedData = "yes"  
   close loops    
  return taxDue    
//opporunity for error handling    
if returnedData = "no"   
return error message "Please try again, error calculating tax.".   
```

Translator Pseudocode
```
* ****************************************************************
* Translator Pseudocode  
Author: T Kemp
*-----------------------------------------------------------------------------------------------------  
* takes a file, looks up tax percentage, calculates tax due given year, status, and income input.  
*----------------------------------------------------------------------------------------------  
* Input: Target Language, Target Word. 
* Output: Translated word, Error Message (when necassary)   
******************************************************************  
//Translator Pseudocode:
//1st argument is translator.txt
//2nd argument into “target language”
//returnLang = “No” 
//dataReturned = “No”  

//Open translate.txt file
//Read first entry in translate.txt file
//While foundLanguage = "No", or while the file still has entries
//  Read record
// If record = Language
//   foundLanguage = "Yes"
//   return “target language”.txt
//  Else
//    move to next record in translate.txt

//1st argument is targetLanguage.txt
//foundWord = “no”
//2nd argument into “target word” 
//Open.txt file
//Read first entry in targetLanguage.txt file
//While foundLanguage = "No", or while the file still has entries
// Read record
//  If record = Word
//    foundWord = "Yes"
//    return “target word”.txt
//    dataReturned = “Yes” 
//  Else
//    move to next record in targetLanguage.txt
//If dataReturned = “No” 
//    Print “Error code XXX, no data returned”
```
