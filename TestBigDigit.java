import java.util.*;

public class TestBigDigit {
	public static void main(String[] args) {

		// Prompt user to input a big number
		System.out.print("Pleas enter a big number: ");
		Scanner in = new Scanner(System.in);
		String inputStr = in.next();

		// Check for inputStr is a number or not
		try{ 
		  Double.parseDouble(inputStr);
		}
		catch (NumberFormatException e){ 
		  System.out.println("This is not a digit!");
		  System.exit(1);
		}
  
  
        /* First, check for its type, and store them into the array */  
		
		int intPartNum = 0, decimalPartNum = 0;
		int[] intPart,decimalPart;
		if(inputStr.indexOf('.') == -1){	// If it is a interger
		
			// Record the number of digits (before and after decimal point)
			intPartNum = inputStr.length();
			intPart = new int[intPartNum];
		
			// Store the number into the array	
			for(int j = 0; j < intPartNum ; j++){
				intPart[intPartNum-j-1] = Character.getNumericValue(inputStr.charAt(j));
			}	
		}
		else{		// If it is not a interger
			// Record the number of digits (before and after decimal point)
			intPartNum = inputStr.indexOf('.');
			decimalPartNum = inputStr.length() - intPartNum - 1;  // string length - interger part - decimal point
			intPart = new int[intPartNum];
			decimalPart = new int[decimalPartNum];
		
			// Store the intPart into the array	
			for(int i = 0; i < intPartNum ; i++){
				intPart[intPartNum-i-1] = Character.getNumericValue(inputStr.charAt(i));
			}
			// Store the deciamlPart into the array	
			for(int j = 0; j < decimalPartNum ; j++){
				decimalPart[j] = Character.getNumericValue(inputStr.charAt( ( inputStr.indexOf('.') + 1 ) + j));
			}

		}
	}
}