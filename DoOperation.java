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
		
		while(num1_IntPart.size() != num2_IntPart.size()){
			if(num1_IntPart.size() > num2_IntPart.size()){
				num2_IntPart.add(0);
			}
			else{
				num1_IntPart.add(0);
			}
		}
		while(num1_DecimalPart.size() != num2_DecimalPart.size()){
			if(num1_DecimalPart.size() > num2_DecimalPart.size()){
				num2_DecimalPart.add(0);
			}
			else{
				num1_DecimalPart.add(0);
			}
		}
		result_IntPartNum = num1_IntPart.size();
		result_DecimalPartNum = num1_DecimalPart.size();
	}
	
	void doAddition(){
		int carryForInt = 0;
		int carryForDec = 0;
		int carryFromDecToInt = 0;
		int temp = 0;
		for(int j = result_DecimalPartNum-1; j >= 0 ; j--){
			temp = num1_DecimalPart.get(j) + num2_DecimalPart.get(j) + carryForDec;
			if( temp > 9 ){
				result_DecimalPart.add( temp - 10 );
				carryForDec = 1;
				if(j == 0){
					carryFromDecToInt = 1;
				}
			}
			else{
				result_DecimalPart.add( temp );
				carryForDec = 0;
			}
		}
		for(int i = 0 ; i < result_IntPartNum ; i++){
			temp = num1_IntPart.get(i) + num2_IntPart.get(i) + carryFromDecToInt + carryForInt;
				if( temp > 9 ){
					result_IntPart.add( temp - 10 );
					carryForInt = 1;
					carryFromDecToInt = 0;
				}
				else{
					result_IntPart.add( temp );
					carryForInt = 0;
					carryFromDecToInt = 0;
				}
		}
		if(carryForInt == 1){
			result_IntPart.add(1);
			result_IntPartNum++;
		}
		/*
		for(int i = 0 ; i < result_IntPartNum ;i++){
			System.out.print(result_IntPart.get(i));
		}
		
		System.out.println("");
		for(int i = 0 ; i < result_DecimalPartNum ;i++){
			System.out.print(result_DecimalPart.get(i));
		}
		*/
	}

	public ArrayList<Integer> getResult_IntPart(){
		return result_IntPart;
	}
	public ArrayList<Integer> getResult_DecimalPart(){
		return result_DecimalPart;
	}	 
	int getResult_IntPartNum(){
		return result_IntPartNum;
	}
	
	int getResult_DecimalPartNum(){
		return result_DecimalPartNum;
	}		
	int getResult_IntPartValue(int x){
		return result_IntPart.get(x);
	}
	
	int getResult_DecimalPartValue(int x){
		return result_DecimalPart.get(x);
	}	

}