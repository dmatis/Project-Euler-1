// correct 
public class Problem1 {

	public static void main(String[] args) {
		int sum = 0; 
		
		// Go through 1-1000 and add the number to sum if it  
		// is divisible by 3 or 5 
		for(int i = 0; i < 1000;i++){
		if(i % 3 == 0 || i % 5 == 0)	
			sum += i; 
		}
		
		// Print out the answer 
		System.out.println(sum);
	}
	
	
	
	

}
