import java.util.*;
class DoOperation{
	// num1's two parts with two arraylists
	private ArrayList<Integer> num1_IntPart = new ArrayList<>();
	private ArrayList<Integer> num1_DecimalPart = new ArrayList<>();
	
	// num2's two parts with two arraylists
	private ArrayList<Integer> num2_IntPart = new ArrayList<>();
	private ArrayList<Integer> num2_DecimalPart = new ArrayList<>();

	// result's two parts with two arraylists
	private ArrayList<Integer> result_IntPart = new ArrayList<>();
	private ArrayList<Integer> result_DecimalPart = new ArrayList<>();
	
    private int num1_IntPartNum,num1_DecimalPartNum;
	private int num2_IntPartNum,num2_DecimalPartNum;
	private int result_IntPartNum, result_DecimalPartNum;
	
	
	DoOperation(){

	}
	
	DoOperation(ArrayList<Integer> newNum1_IntPart, ArrayList<Integer> newNum1_DecimalPart, ArrayList<Integer> newNum2_IntPart, ArrayList<Integer> newNum2_DecimalPart){	
		num1_IntPart = newNum1_IntPart;
		num1_DecimalPart = newNum1_DecimalPart;
		num2_IntPart = newNum2_IntPart;
		num2_DecimalPart = newNum2_DecimalPart;
		
		num1_IntPartNum = newNum1_IntPart.size();
		num1_DecimalPartNum = newNum1_DecimalPart.size();
		
		num2_IntPartNum = newNum2_IntPart.size();
		num2_DecimalPartNum = newNum2_DecimalPart.size();
		
	}
	
	void doAddition(){
		//result_IntPart = new int[result_IntPartNum];
	    //result_DecimalPart = new int[result_DecimalPartNum];
		for(int i = 0 ; i < result_IntPartNum ; i++){
			result_IntPart.add( num1_IntPart.get(i) + num2_IntPart.get(i) );
			System.out.println();
		}
		for(int j = 0 ; j < result_DecimalPartNum ; j++){
			result_DecimalPart.add( num1_DecimalPart.get(j) + num2_DecimalPart.get(j) );
		}
	}
	
	int getResult_IntPartNum(){
		if(num1_IntPartNum >= num2_IntPartNum){
			result_IntPartNum = num1_IntPartNum;
		}
		else{
			result_IntPartNum = num2_IntPartNum;
		}	
		return result_IntPartNum;
	}
	
	int getResult_IntDecimalPartNum(){
		if(num1_DecimalPartNum >= num2_DecimalPartNum){
			result_DecimalPartNum = num1_DecimalPartNum;
		}
		else{
			result_DecimalPartNum = num2_DecimalPartNum;
		}
		return result_DecimalPartNum;	
	}
	
	int getResult_IntPartValue(int x){
		return result_IntPart.get(x);
	}
 	int getResult_DecimalPartValue(int x){
		return result_DecimalPart.get(x);
	}   

}