import java.util.*;

class processInputNumber{
	public int intPartNum = 0, decimalPartNum = 0;
	public int[] intPart,decimalPart;
	
	processInputNumber(){
	}
	
	public void checkIsNumber(String str){
		// Check for inputStr is a number or not
		try{ 
		  Double.parseDouble(str);
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

	public void storeDecimalNum(String newStr){
		// Record the number of digits (before and after decimal point)
		intPartNum = newStr.indexOf('.');
		decimalPartNum = newStr.length() - intPartNum - 1;  // string length - interger part - decimal point
		intPart = new int[intPartNum];
		decimalPart = new int[decimalPartNum];
		
		// Store the intPart into the array	
		for(int i = 0; i < intPartNum ; i++){
			intPart[intPartNum-i-1] = Character.getNumericValue(newStr.charAt(i));
		}
		// Store the deciamlPart into the array	
		for(int j = 0; j < decimalPartNum ; j++){
			decimalPart[j] = Character.getNumericValue(newStr.charAt( ( newStr.indexOf('.') + 1 ) + j));
		}
	}
}

