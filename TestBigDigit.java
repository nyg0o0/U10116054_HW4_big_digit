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
		
		ArrayList<Integer> Res_IntPart = new ArrayList<>();
		ArrayList<Integer> Res_DecPart = new ArrayList<>();
		//ArrayList<Object> operation = new ArrayList<>();
		DoOperation[] operation = new DoOperation[numOfOperation];
		/* Repeat addtion by how many digit there */
		
		for(int i = 0 ; i < numOfOperation-1 ; i++ ){	// four numbers only need  three times (minus one)
			if(i == 0){ 
				operation[i] = new DoOperation(num[i].getIntPart(),num[i].getDecPart(),num[i+1].getIntPart(),num[i+1].getDecPart());
				operation[i].doAddition();	// Addition by the method of the class DoOperation
				System.out.println();
				System.out.println("i: " + i);
				Res_IntPart = operation[i].getResult_IntPart();
				Res_DecPart = operation[i].getResult_DecPart();
				for(int k = ((operation[i]).getResult_IntPartNum()-2) ; k >=0 ; k-- ){
					System.out.print((operation[i].getResult_IntPart()).get(k));	// Do interger part addition by the method of the class DoOperation
				}
				if((operation[i]).getResult_DecPartNum() != 0){	// If it has dec part
					System.out.print(".");	// Print the dec point
				}
				for(int k = 0 ; k < operation[i].getResult_DecPartNum() ; k++ ){
					System.out.print((operation[i].getResult_DecPart()).get(k));	// Do interger part addition by the method of the class DoOperation
				}
				System.out.println();
			}
			else{
				operation[i] = new DoOperation(num[i+1].getIntPart(),num[i+1].getDecPart(),Res_IntPart, Res_DecPart);
				System.out.println();
				operation[i].doAddition();	// Addition by the method of the class DoOperation
				while( (num[i+1].getDecPart()).size() != Res_DecPart.size() ){
					if( (num[i+1].getDecPart()).size() > Res_DecPart.size()){
						Res_DecPart.add(0);
					}
					else{
						
						num[i+1].getDecPart().add(0);
					}
				}
				System.out.println();
				System.out.println("i: " + i);

				Res_IntPart = operation[i].getResult_IntPart();
				Res_DecPart = operation[i].getResult_DecPart();
				for(int k = ((operation[i]).getResult_IntPartNum()-1) ; k >=0 ; k-- ){
					System.out.print(Res_IntPart.get(k));	// Do interger part addition by the method of the class DoOperation
				}
				if((operation[i]).getResult_DecPartNum() != 0){	// If it has dec part
					System.out.print(".");	// Print the dec point
				}
				for(int k = 0 ; k < (operation[i]).getResult_DecPartNum() ; k++ ){
					System.out.print(Res_DecPart.get(k));	// Do interger part addition by the method of the class DoOperation
				}
				System.out.println();
			}
		}
		
		//for(int i = 0 ; i < numOfOperation-1 ; i++ ){
			//for(int j = (operation[i]).getResult_IntPartNum()-1 ; j >= 0  ; j--){	// Reverse the order (Opposite to each other)
		//		System.out.println(operation[numOfOperation-2].getResult_IntPart().get(i));	// Do interger part addition by the method of the class DoOperation
			//}
		//}
		
		
		
		//	for(int j = operation[i].getResult_DecPartNum()-1 ; j >= 0 ; j--){	// Reverse the order (Opposite to each other)
		//		System.out.println(Res_DecPart.get( (operation[i].getResult_DecPart()).get(j) ));	// Do dec part addition by the method of the class DoOperation
		//	}
		
		/*
		if( numOfOperation % 2 == 0 ){	// If there is even digits
			for(int i = 0 ; i < numOfOperation ; i = i+2 ){
				/* Thorw two numbers to do operation
				if( times == 0 ){
					operation.add(new DoOperation(num[i].getIntPart(),num[i].getDecPart(),num[i+1].getIntPart(),num[i+1].getDecPart()));
				}
				else{
					operation.add(new DoOperation(num[i].getIntPart(),num[i].getDecPart(), Res_IntPart, Res_DecPart));
				}
				(operation.get(times)).doAddition();	// Addition by the method of the class DoOperation
				for(int j = (operation.get(times)).getResult_IntPartNum()-1 ; j >= 0  ; j--){	// Reverse the order (Opposite to each other)
					Res_IntPart.add( (operation).getResult_IntPart().get(times) );	// Do interger part addition by the method of the class DoOperation
				}
				for(int j = operation[times].getResult_DecPartNum()-1 ; j >= 0 ; j--){	// Reverse the order (Opposite to each other)
					Res_DecPart.add( ((operation).getResult_DecPart()).get(times) );	// Do dec part addition by the method of the class DoOperation
				}
				times++;
			}
			


			System.out.print("Answer: ");
			
			for(int j = (operation).getResult_IntPartNum()-1 ; j >= 0  ; j--){	// Reverse the order (Opposite to each other)
				System.out.print( ((operation.get(times)).getResult_IntPart()).get(times) );	// Do interger part addition by the method of the class DoOperation
			}
			if((operation).getResult_DecPartNum() != 0){	// If it has dec part
				System.out.print(".");	// Print the dec point
			}
		}
		*/
	}
}