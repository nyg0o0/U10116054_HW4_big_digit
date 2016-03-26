class DoOperation{
	private int[] num1_IntPart = new int[10];
	private int[] num1_DecimalPart = new int[10];
	private int[] num2_IntPart  = new int[10];
	private int[] num2_DecimalPart = new int[10];
    private  int num1_IntPartNum,num1_DecimalPartNum;
	private  int num2_IntPartNum,num2_DecimalPartNum;
	public  int[] result_IntPart = new int[10];
	public  int[] result_DecimalPart = new int[10];
	private  int result_IntPartNum, result_DecimalPartNum;
	
	
	DoOperation(){

	}
	
	DoOperation(int[] newNum1_IntPart, int[] newNum1_DecimalPart, int[] newNum2_IntPart, int[] newNum2_DecimalPart){	
		num1_IntPart = newNum1_IntPart;
		num1_DecimalPart = newNum1_DecimalPart;
		newNum2_IntPart = newNum2_IntPart;
		num2_DecimalPart = newNum2_DecimalPart;
	}
	
	void doAddition(){
		//result_IntPart = new int[result_IntPartNum];
	    //result_DecimalPart = new int[result_DecimalPartNum];
		for(int i = 0 ; i < result_IntPartNum ; i++){
			result_IntPart[i] = num1_IntPart[i] + num2_IntPart[i];
			System.out.println(num1_IntPart[i] + " + " + num2_IntPart[i] + " = " + result_IntPart[i]);
		}
		for(int j = 0 ; j < result_DecimalPartNum ; j++){
			result_DecimalPart[j] = num1_DecimalPart[j] + num2_DecimalPart[j];
		}
	}
	
	int getResult_IntPartNum(){
		num1_IntPartNum = num1_IntPart.length;
		num2_IntPartNum = num2_IntPart.length;
		if(num1_IntPartNum >= num2_IntPartNum){
			result_IntPartNum = num1_IntPartNum;
		}
		else{
			result_IntPartNum = num2_IntPartNum;
		}	
		return result_IntPartNum;
	}
	
	int getResult_IntDecimalPart(){
		num1_DecimalPartNum = num1_DecimalPart.length;
		num2_DecimalPartNum = num2_DecimalPart.length;
		if(num1_DecimalPartNum >= num2_DecimalPartNum){
			result_DecimalPartNum = num1_DecimalPartNum;
		}
		else{
			result_DecimalPartNum = num2_DecimalPartNum;
		}
		return result_DecimalPartNum;	
	}
	
	int[] getResult_IntPart(){
		return result_IntPart;
	}
	
	int[] getResult_DecimalPart(){
		return result_DecimalPart;
	}


}