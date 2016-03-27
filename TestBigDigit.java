import java.util.*;

public class TestBigDigit {
	public static void main(String[] args) {

		/* Prompt user to How many digital operations?(at least two) */
		Scanner in = new Scanner(System.in);
		int numOfOperation = 0;
		System.out.print("How many digital operations?(at least two) ");
		try{ 
			numOfOperation = in.nextInt();
			if(numOfOperation <= 1 ){
				System.out.println("Please enter the correct number(at least two)!");
				System.exit(1);	
			}
		}
		catch (Exception ex){ 
			System.out.println("Please enter a interger!");
			System.exit(1);
		}
			
		
        
		//ArrayList<String> inputStr = new ArrayList<>();
		String[] inputStr = new String[numOfOperation];		// A input string
		ProcessInputNumber[] num = new ProcessInputNumber[numOfOperation];	// A object array for class processInputNumber
		
		for(int i = 0 ; i < numOfOperation ; i++){
			/* Prompt user enter datas, and new objects to check datas */
		    num[i] = new ProcessInputNumber();	// Initial the object array
			System.out.print("Pleas enter No." + (i+1) +" big number: ");	//Prompt user to enter big number
			inputStr[i] = in.next();	// Scan the big number
			num[i].checkIsNumber(inputStr[i]);	// check the input is number or not by using the class processInputNumber
			
			/* Check for its type, and store them into the array */
			if(inputStr[i].indexOf('.') == -1){	// If it is a interger
				num[i].storeIntNum(inputStr[i]);
			}
			else{	// If it is not a interger
				num[i].storeDecimalNum(inputStr[i]);
			}
		}
		
		//System.out.print(num[0].getIntSize());
		//for(int j = 0 ; j < num[0].getIntSize() ; j++){
		//	System.out.print("num[0].getIntPartValue(j)" + num[0].getIntPartValue(j));
		//}
     /*
		DoOperation operation1 = new DoOperation(num[0].intPart,num[0].decimalPart,num[1].intPart,num[1].decimalPart);


			operation1.doAddition();
			
			
			for(int j = 0 ; j < operation1.getResult_IntPartNum() ; j++){
				System.out.println(operation1.result_IntPart[j]);
			}
	 */	
	}
}