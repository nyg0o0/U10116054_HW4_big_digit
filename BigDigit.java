import java.util.*;

class BigDigit{
	private int intPartNum = 0, decimalPartNum = 0;
	private int[] intPart,decimalPart;	
	BigDigit(){
		
		
	}
	


	public void checkIsNumber(String newStr){
		// Check for inputStr is a number or not
		try{ 
		  Double.parseDouble(newStr);
		}
		catch (NumberFormatException e){ 
		  System.out.println("This is not a digit!");
			 System.exit(1);
		}
	}
	
	public void storeIntNum(String newStr){
		// Record the number of digits (before and after decimal point)
		intPartNum = newStr.length();
		intPart = new int[intPartNum];
		
		// Store the number into the array	
		for(int j = 0; j < intPartNum ; j++){
			intPart[intPartNum-j-1] = Character.getNumericValue(newStr.charAt(j));
		}	
	}
}

