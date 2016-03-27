import java.util.*;

public class TestBigDigit {
	public static void main(String[] args) {

		/* Prompt user to How many digital operations?(at least two) */
		Scanner in = new Scanner(System.in);
		int numOfOperation = 0;
		System.out.print("How many digital operations?(at least two) ");
		try{ 
			numOfOperation = in.nextInt();	// Scan the input
			if(numOfOperation <= 1 ){	// if the digit is under two
				System.out.println("Please enter the correct number(at least two)!");	// Warn the user!
				System.exit(1);	// Exit!
			}
		}
		catch (Exception ex){ 
			System.out.println("Please enter a interger!");	// Warn the user!
			System.exit(1);	// Exit!
		}
			
		String[] inputStr = new String[numOfOperation];		// A input string
		ProcessInputNumber[] num = new ProcessInputNumber[numOfOperation];	// A object array for class processInputNumber
		
		/* Prompt user enter datas, and new objects to check datas */
		for(int i = 0 ; i < numOfOperation ; i++){
		    num[i] = new ProcessInputNumber();	// Initial the object array
			System.out.print("Pleas enter No." + (i+1) +" big number: ");	//Prompt user to enter big number
			inputStr[i] = in.next();	// Scan the big number
			num[i].checkIsNumber(inputStr[i]);	// check the input is number or not by using the class processInputNumber
			
			/* Check for its type, and store them into the array */
			if(inputStr[i].indexOf('.') == -1){	// If it is a interger
				num[i].storeIntNum(inputStr[i]);	// Store to the arraylist by the method of the class ProcessInputNumber
			}
			else{	// If it is not a interger
				num[i].storeDecNum(inputStr[i]);	// Store to the arraylist by the method of the class ProcessInputNumber
			}
		}

		/* Thorw two numbers to do operation */
		DoOperation operation1 = new DoOperation(num[0].getIntPart(),num[0].getDecPart(),num[1].getIntPart(),num[1].getDecPart());
		operation1.doAddition();	// Addition by the method of the class DoOperation
		System.out.print("Answer: ");
		for(int j = operation1.getResult_IntPartNum()-1 ; j >= 0  ; j--){	// Reverse the order (Opposite to each other)
			System.out.print( (operation1.getResult_IntPart()).get(j) );	// Do interger part addition by the method of the class DoOperation
		}
		if(operation1.getResult_DecPartNum() != 0){	// If it has dec part
			System.out.print(".");	// Print the dec point
		}
		 for(int j = operation1.getResult_DecPartNum()-1 ; j >= 0 ; j--){	// Reverse the order (Opposite to each other)
			System.out.print( (operation1.getResult_DecPart()).get(j) );	// Do dec part addition by the method of the class DoOperation
		}
	}
}