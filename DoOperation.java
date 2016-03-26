class DoOperation{
	private int[] num1_IntPart, num1_DecimalPart;
	private int[] num2_IntPart, num2_DecimalPart;
	private int result_IntPartNum, result_DecimalPartNum;
	private int[] result_IntPart, result_DecimalPart;
	
	DoOperation(){
	}
	
	DoOperation(int[] newNum1_IntPart, int[] newNum1_decimalPart, int[] newNum2_IntPart, int[] newNum2_decimalPart){
		/* How many digit of the result (before and after point) */
		if(num1_IntPart.length >= num2_IntPart.length){
			result_IntPartNum = num1_IntPart.length;
		}
		else{
			result_IntPartNum = num2_IntPart.length;
		}
		
		if(num1_DecimalPart.length >= num2_DecimalPart.length){
			result_DecimalPartNum = num1_DecimalPart.length;
		}
		else{
			result_DecimalPartNum = num2_DecimalPart.length;
		}
	}
	
	int doAddition(){
		result_IntPart = new int[result_IntPartNum];
		for(int i = 0 ; i < result_IntPartNum ; i++){
			result_IntPart[i] = num1_IntPart[i] + num2_IntPart[i];
		}
		return 0;
	}
}