package problems21to30;

//correct 
//slow - takes 180 seconds 
import java.util.List;
import java.util.LinkedList;


public class Problem24 {

	public static void main(String[] args) {
		//smallest number with all digits (assume that there is a 0 in front - 0123456789)
		long number = 123456789;
		//recording which number we are currently on 
		int recorder = 0; 
		boolean running = true; 
		
		while(running){
			if(checkContainsAllDigits(number)){
				recorder++; 
				//System.out.println(recorder);
				if(recorder == 1E6){
					System.out.println(number);
					running = false; 
				}
				   
				
			}
			number++; 
			
		}

	}

	private static boolean checkContainsAllDigits(long number) {
		List<Long> digits = new LinkedList<Long>();
		long tempHolder = 0; 
		boolean smallNumber = number < 1000000000;
				
		while(number>0){
			tempHolder = number%10; 
			if(digits.contains(tempHolder)||(smallNumber && tempHolder == 0)){
				return false; 
			}
			else{
				digits.add(tempHolder);
				number/=10; 
			}
		}
		
		return true; 
		
		
	}

}
