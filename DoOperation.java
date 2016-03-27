import java.util.*;
class DoOperation{
	// num1's two parts with two arraylists
	private ArrayList<Integer> num1_IntPart = new ArrayList<>();
	private ArrayList<Integer> num1_DecPart = new ArrayList<>();
	
	// num2's two parts with two arraylists
	private ArrayList<Integer> num2_IntPart = new ArrayList<>();
	private ArrayList<Integer> num2_DecPart = new ArrayList<>();

	// result's two parts with two arraylists
	private ArrayList<Integer> result_IntPart = new ArrayList<>();
	private ArrayList<Integer> result_DecPart = new ArrayList<>();
	
    private int num1_IntPartNum,num1_DecPartNum;
	private int num2_IntPartNum,num2_DecPartNum;
	private int result_IntPartNum, result_DecPartNum;
	
	/* no-arg constructor */
	DoOperation(){
	}
	
	/* constructor with four arguments(two nums,four parts)*/
	DoOperation(ArrayList<Integer> newNum1_IntPart, ArrayList<Integer> newNum1_DecPart, ArrayList<Integer> newNum2_IntPart, ArrayList<Integer> newNum2_DecPart){	
		num1_IntPart = newNum1_IntPart;
		num1_DecPart = newNum1_DecPart;
		num2_IntPart = newNum2_IntPart;
		num2_DecPart = newNum2_DecPart;
		
		// If num1's interger part is not equal to num2's
		while(num1_IntPart.size() != num2_IntPart.size()){
			if(num1_IntPart.size() > num2_IntPart.size()){	// num1's interger part is bigger
				num2_IntPart.add(0);	// Fill zero to the head
			}
			else{
				num1_IntPart.add(0);	// Fill zero to the head
			}
		}
		
		// If num1's decimal part is not equal to num2's
		while(num1_DecPart.size() != num2_DecPart.size()){
			if(num1_DecPart.size() > num2_DecPart.size()){
				num2_DecPart.add(0);	// Fill zero to the tail
			}
			else{
				num1_DecPart.add(0);	// Fill zero to the tail
			}
		}
		result_IntPartNum = num1_IntPart.size();	// Get the size of interger part
		result_DecPartNum = num1_DecPart.size();	// Get the size of decimal part
	}
	
	/* A method to do addition */
	void doAddition(){
		int carryForInt = 0;	// A variable for storing the carry of interger part
		int carryForDec = 0;	// A variable for storing the carry of decimal part
		int carryFromDecToInt = 0;	// A variable for storing the carry from decimal part to interger part
		int temp = 0;	// A temp variable
		for(int j = result_DecPartNum-1; j >= 0 ; j--){	// Decimal part addition, form the tail to the head (reverse)
			temp = num1_DecPart.get(j) + num2_DecPart.get(j) + carryForDec;	// num1 plus num2 plus the carry for decimal part
			if( temp > 9 ){	// If temp is bigger then nine
				result_DecPart.add( temp - 10 );
				carryForDec = 1;	// set the carry
				if(j == 0){	// If it is the first of the decimal (It has carry for decimal part too)
					carryFromDecToInt = 1;	// set the carry to interger part
				}
			}
			else{	// If temp is not bigger then nine
				result_DecPart.add( temp );	// just add the two numbers
				carryForDec = 0;	// clear the carry
			}
		}
		for(int i = 0 ; i < result_IntPartNum ; i++){	// Interger part addition, form the head to the tail
			temp = num1_IntPart.get(i) + num2_IntPart.get(i) + carryFromDecToInt + carryForInt;
				if( temp > 9 ){
					result_IntPart.add( temp - 10 );
					carryForInt = 1;	// set the carry
					carryFromDecToInt = 0;	// clear the carry
				}
				else{
					result_IntPart.add( temp );
					carryForInt = 0;	// clear the carry
					carryFromDecToInt = 0;	// clear the carry
				}
		}
		if(carryForInt == 1){	// If it has a carry
			result_IntPart.add(1);	// new a digit, and filled with value (one)
			result_IntPartNum++;	// Interger part number plus one
		}
	}

	/* A method to return the result arraylist of the interger part */
	public ArrayList<Integer> getResult_IntPart(){
		return result_IntPart;
	}
	
	/* A method to return the result arraylist of the decimal part */
	public ArrayList<Integer> getResult_DecPart(){
		return result_DecPart;
	}	 
	
	/* Get the number of the result interger part */
	int getResult_IntPartNum(){
		return result_IntPartNum;
	}
	
	/* Get the number of the result decimal part */
	int getResult_DecPartNum(){
		return result_DecPartNum;
	}		
}