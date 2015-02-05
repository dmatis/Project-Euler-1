package problems31to40;

//correct
//super awesome nested for loops, avoid double counting 
public class Problem31 {
	
	public static void main(String[] args) {
	    int totalWays = 0; 
		final int sumNeeded = 200;  
		
	
		for(int a = 0; a <= 1; a++){
                if(a*200 == sumNeeded)
				totalWays++; 
			
			for(int b = 0; b <=2 ; b++){
				if(a*200 + b * 100 == sumNeeded && b!= 0)
					totalWays++;
				
				for(int c = 0; c <= 4; c++){
				if(a*200 + b*100 + c*50 == sumNeeded && c!= 0)
					totalWays++; 		
				
				    for(int d = 0; d <= 10; d++){
				    	if(a*200 + b*100 + c*50 + d*20 == sumNeeded && d!= 0)
							totalWays++; 		
				    	
				    	for(int e = 0; e <= 20; e++){
				    		if(a*200 + b*100 + c*50 + d*20 + e*10 == sumNeeded && e!= 0)
								totalWays++; 		
								
							
				    		
				    		for(int f = 0; f <= 40; f++){
				    			if(a*200 + b*100 + c*50 + d*20 + e*10 + f*5== sumNeeded && f!= 0)
									totalWays++; 		
									
							
				    			for(int g = 0; g <= 100; g++){
				    				if(a*200 + b*100 + c*50 + d*20 + e*10 + f*5 + g*2== sumNeeded && g!= 0)
										totalWays++; 		
										
									
				    			    for(int h = 0; h <= 200;h++){
				    			    	if(a*200 + b*100 + c*50 + d*20 + e*10 + f*5 + g*2 + h == sumNeeded && h!= 0)
											totalWays++; 		
											
										
				    			    	
				    			    	
				    			    	
				    			    }
				    			
				    			
				    			
				    			
				    		}
				    
			
				    	}
				    	
				    	
				    	
				    	
				    }
				
					
					
					
					
				}
								
				
			}
			
					
		}
		}
		System.out.println(totalWays);
	}

}
