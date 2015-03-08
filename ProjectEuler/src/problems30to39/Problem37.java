package problems30to39;

import personal_library.MathFunctions;

//Question -----------------------------------------------------------------------------------------------------------------------
// The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
//
// Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
//
// NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
//---------- -----------------------------------------------------------------------------------------------------------------------
// Solution correct

public class Problem37 {

	public static void main(String[] args) {
		int total = 0; 										// the current number of trunc-primes found
		int sum = 0; 										// sum of the eleven trunc-primes

		for(int currentNumber = 10; total < 11; currentNumber++) {
			//so that I dont have to change reverse number 
			if(currentNumber%10 != 0) {
				if(trunctablePrime(currentNumber)) {
					System.out.println(currentNumber);
					sum +=currentNumber; 
					total++; 
				}			
			}
		}
		
		// print out the answer
		System.out.println(sum);
	}
	
	// Private Function
	// 
	private static boolean trunctablePrime(int number) {
		return checkLeftToRightPrime(number) && checkRightToLeftPrime(number);
	}


	// Private Function
	// 
	private static boolean checkRightToLeftPrime(int number) {
		while(number>0) { 
			if(!MathFunctions.checkPrime(number)) {
				return false;
			}
			number /= 10;
		}
		return true; 
	}
	
	// Private Function 
	// 
	private static boolean checkLeftToRightPrime(int number) {
		String tempString = String.valueOf(number);
		int length = tempString.length(); 
		
		for(int i = 0; i < length; i++){
			int tempNumber = (int) (number%(Math.pow(10, i)));
			if(!MathFunctions.checkPrime(tempNumber))
				return false; 
		}
		return true; 
	}
}
