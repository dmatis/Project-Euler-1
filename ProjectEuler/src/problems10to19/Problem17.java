package problems10to19; 

//correct 
//careful - forty not fourty 
public class Problem17 {
	
	public static void main(String[]args){
		int total = 0; 
		for(int i = 1; i < 1001; i++){
			//Ones Place 1-9
			if(i%10 == 1){
				total+= 3; 
			}
			else if(i%10 == 2){
				total+= 3; 
			}
	    	else if(i%10 == 3){
				total+= 5;
			}
	    	else if(i%10 == 4){
	    		total+= 4; 
	    	}
	    	else if(i%10 == 5){
	    		total += 4; 
	    	}
	    	else if(i%10 == 6){
	    		total+= 3;
	    	}
	    	else if(i%10 == 7){
	    		total+= 5;
	    	}
	    	else if(i%10 == 8){
	    		total += 5; 
	    	}
	    	else if(i%10 == 9){
	    		total+=4; 
	    	}
			//and
			if(i > 100 && !(i%100==0)){
				total += 3; 
			}
			
			//10-19
			if((i/10)%10 == 1){
				if(i%100 == 10){
					total+= 3;
				}
				if(i%100 == 11){
					total+= 6;
					total-= 3;
				}
				
				if(i%100 == 12){
					total+= 6;
					total-= 3;
				}
				if(i%100 == 13){
					total+= 8;
					total-= 5;
				}
				if(i%100 == 14){
					total+= 8;
					total-= 4;
				}
				if(i%100 == 15){
					total+= 7;
					total-= 4;
				}
				if(i%100 == 16){
					total+= 7;
					total-= 3;
				}
				if(i%100 == 17){
					total+= 9;
					total-= 5;
				}
				if(i%100 == 18){
					total+= 8;
					total-= 5;
				}
				if(i%100 == 19){
					total+= 8;
					total-= 4;
				}
				
			}
			//20-90
			if((i/10)%10 == 2){
				total += 6;
			}
			if((i/10)%10 == 3){
				total += 6;
			}
			if((i/10)%10 == 4){
				total += 5;
			}
			if((i/10)%10 == 5){
				total += 5;
			}
			if((i/10)%10 == 6){
				total += 5;
			}
			if((i/10)%10 == 7){
				total += 7;
			}
			if((i/10)%10 == 8){
				total += 6;
			}
			if((i/10)%10 == 9){
				total += 6;
			}
			//hundreds 	
			if((i/100)%10 == 1){
				total+= 10; 
			}
			if((i/100)%10 == 2){
				total+= 10;			
			}
			if((i/100)%10 == 3){
				total+= 12;
			}
			if((i/100)%10 == 4){
				total+= 11;
			}
			if((i/100)%10 == 5){
				total += 11;
			}
			if((i/100)%10 == 6){
				total += 10;
			}
			if((i/100)%10 == 7){
				total += 12;
			}
			if((i/100)%10 == 8){
				total += 12; 
			}
			if((i/100)%10 == 9){
				total += 11; 
			}
		}
		System.out.println(total + 11);
	}
	

}
