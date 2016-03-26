class DoOperation{
	private int[] num1_IntPart, num1_DecimalPart;
	private int[] num2_IntPart, num2_DecimalPart;
	public int[] result_IntPart, result_DecimalPart;
	public int result_IntPartNum, result_DecimalPartNum;
	
	
	DoOperation(){
		
	}
	
	DoOperation(int[] newNum1_IntPart, int[] newNum1_decimalPart, int[] newNum2_IntPart, int[] newNum2_decimalPart){	

	}
	
	void doAddition(){
		result_IntPart = new int[result_IntPartNum];
	    result_DecimalPart = new int[result_DecimalPartNum];
		for(int i = 0 ; i < result_IntPartNum ; i++){
			result_IntPart[i] = num1_IntPart[i] + num2_IntPart[i];
		}
		for(int j = 0 ; j < result_DecimalPartNum ; j++){
			result_DecimalPart[j] = num1_DecimalPart[j] + num2_DecimalPart[j];
		}
	}
	
	int getResult_IntPartNum(){
		if(num1_IntPart.length >= num2_IntPart.length){
			result_IntPartNum = num1_IntPart.length;
		}
		else{
			result_IntPartNum = num2_IntPart.length;
		}	
		return result_IntPartNum;
	}
	
	int getResult_IntDecimalPart(){
		if(num1_DecimalPart.length >= num2_DecimalPart.length){
			result_DecimalPartNum = num1_DecimalPart.length;
		}
		else{
			result_DecimalPartNum = num2_DecimalPart.length;
		}
		return result_DecimalPartNum	;	
	}
	
	int[] getResult_IntPart(){
		return result_IntPart;
	}
	
	int[] getResult_DecimalPart(){
		return result_DecimalPart;
	}


}