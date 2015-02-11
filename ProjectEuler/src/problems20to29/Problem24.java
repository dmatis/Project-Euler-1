package problems20to29;

//Question -----------------------------------------------------------------------------------------------------------------------
// A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
// 	012   021   102   120   201   210
// What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
//---------- -----------------------------------------------------------------------------------------------------------------------
// Solution correct 

public class Problem24 {

	public static void main(String[] args) {
	
		
		long number = 123456789;      // smallest number with all digits (assume that there is a 0 in front - 0123456789)
		int numberOfPermutations = 0; // recording which number we are currently on 
		boolean running = true;       // clean loop-control variable
		
		while(running){
			if(checkContainsAllDigits(number)){
				numberOfPermutations++; 
				if(numberOfPermutations == 1E6){
					System.out.println(number);
					running = false; 
				}
				   				
			}
			number++;  			
		}

	}
	

	private static boolean checkContainsAllDigits(long number) {
		int [] digits = new int[10]; 
		int tempHolder = 0; 
		boolean smallNumber = number < 1000000000;
				
		while(number>0){
			tempHolder = (int)(number % 10);  
			if(digits[tempHolder]++ != 0){
				return false; 
			}
			number /= 10; 
		}
	
		return !smallNumber || (digits[0] == 0);
	}

}
