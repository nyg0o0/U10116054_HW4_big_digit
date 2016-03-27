import java.util.*;

class ProcessInputNumber{
	public int intPartNum = 0, decimalPartNum = 0;
	private ArrayList<Integer> intPart = new ArrayList<>();
	private ArrayList<Integer> decimalPart = new ArrayList<>();
	
	ProcessInputNumber(){
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
		
		// Store the number into the array	
		for(int i = (intPartNum-1) ; i >= 0 ; i--){
			intPart.add(Character.getNumericValue(newStr.charAt(i)));	
		}	
		System.out.println(intPart.size());
	}

	public void storeDecimalNum(String newStr){
		// Record the number of digits (before and after decimal point)
		intPartNum = newStr.indexOf('.');
		decimalPartNum = newStr.length() - intPartNum - 1;  // string length - interger part - decimal point
		
		// Store the intPart into the array	
		for(int i = (intPartNum-1) ; i >= 0 ; i--){
			intPart.add(Character.getNumericValue(newStr.charAt(i)));
		}
		// Store the deciamlPart into the array	
		for(int j = 0; j < decimalPartNum ; j++){
			intPart.add(Character.getNumericValue(newStr.charAt( ( newStr.indexOf('.') + 1 ) + j)));
		}
	}
	
	int getIntPartNum(){
		return intPartNum;
	}
	
	int getDecimalPartNum(){
		return decimalPartNum;
	}
	public ArrayList<Integer> getIntPart(){
		return intPart;
	}
	public ArrayList<Integer> getDecimalPart(){
		return decimalPart;
	}	
	public int getIntSize(){
		return intPart.size();
	}
	
	public int getIntPartValue(int x){
		return intPart.get(x);
	}
}

