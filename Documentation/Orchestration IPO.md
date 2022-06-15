# Orchestration Layer IPO

Latest edit: 4/16/21
- Remove all other programs from description except service broker
- Modify sample inputs

Orchestration:
-	Service Broker

Author: Thomas Levine

| Input | Process | Output
|---|---|---|
| Service Code | Determine succcess/failure of service modules | Return code |
| Parameter List for Service | Interact with service module and relay information | Return data from service module |


Inputs:
- Service Code
- Parameter List for Service 

Process:
- Determine succcess/failure of service modules
- Interact with service module and relay information

Outputs:
- Return code
- Return data from service module
- 
```
Pseudocode:  
Parse Service Code from 1st argument into ServeCode  
Parse rest of argument into ServeArg  
Set FoundFlag = “No”  
Open Service.file  
Read 1st record in Service.file  
Parse 1st element in record  
Do while FoundFlag = “No” or until end of file  
	If 1st element = ServiceCode  
		Set FoundFlag = “Yes”  
	Else  
		Read next Service.file record  
End If  
End do  
If FoundFlag = “Yes”  
	Parse out 2nd element in found record and place in ServeCode  
	Call ServeCode with ServeArg as parameter  
	Place returned data from ServeCode into ReturnData  
	Set ReturnCode to 0  
Else  
	Set MSG to “ServiceCode “”NOT FOUND”””  
Call UtilityModule Message with MSG parameter  
Place returned data from UtilityModule into ReturnData  
Set ReturnCode to 4  
End IF  
Return with ReturnCode. ReturnData  
```
