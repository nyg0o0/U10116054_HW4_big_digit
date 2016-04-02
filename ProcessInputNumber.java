/* 
********************** Big Digit java Assignment ********************
*	Strudent ID: U10116054											*
*	Strudent Name: Yu-Hsin Chen										*
*	Assign Date: 4/2												*
*	Content:This is a program for big digit to do repeat addition.	*
*********************************************************************
*		TestBigDigit.java : Test class								*
*		DoOperation.java : Do addition								*
*	--> ProcessInputNumber.java : store the number from the string	*
*********************************************************************
*/

import java.util.*;

class ProcessInputNumber{
	private int intPartNum = 0, decPartNum = 0;
	private ArrayList<Integer> intPart = new ArrayList<>();
	private ArrayList<Integer> decPart = new ArrayList<>();
	
	/* no-arg constructor */
	ProcessInputNumber(){
	}
	
	/* Check for inputStr is a number or not */
	public void checkIsNumber(String str){
		try{ 
		  Double.parseDouble(str);
		}
		catch (NumberFormatException e){ 
		  System.out.println("This is not a digit!");	// Warn the user!
			 System.exit(1);	// Exit!
		}
	}
	
	/* If it is a interger, use this method to store into arraylist */
	public void storeIntNum(String newStr){
		// Record the number of digits (before and after dec point)
		intPartNum = newStr.length();
		
		// Store the number into the array	
		for(int i = (intPartNum-1) ; i >= 0 ; i--){	// Start from the end 
			intPart.add(Character.getNumericValue(newStr.charAt(i)));	// Store them (string ascii convert to num)
		}	
	}

	/* If it is a decimal, use this method to store into arraylist */
	public void storeDecNum(String newStr){
		// Record the number of digits (before and after dec point)
		intPartNum = newStr.indexOf('.');
		decPartNum = newStr.length() - intPartNum - 1;  // string length - interger part - dec point

		// Store the intPart into the array	
		for(int i = (intPartNum-1) ; i >= 0 ; i--){	// Start from the end 
			intPart.add(Character.getNumericValue(newStr.charAt(i)));	// Store them (string ascii convert to num)
		}
		// Store the deciamlPart into the array	
		for(int j = 0; j < decPartNum ; j++){	// Start form the first
			decPart.add(Character.getNumericValue(newStr.charAt( ( newStr.indexOf('.') + 1 ) + j)));
		}
	}
	
	/* A method to return the arraylist of the interger part */
	public ArrayList<Integer> getIntPart(){
		return intPart;
	}
	
	/* A method to return the arraylist of the decimal part */
	public ArrayList<Integer> getDecPart(){
		return decPart;
	}	
}

