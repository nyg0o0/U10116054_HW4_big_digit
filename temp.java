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