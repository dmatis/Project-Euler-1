package personal_library;

import java.util.LinkedList;

public class MathFunctions {

	// Requires: primeNumber must be positive 
	// Check if the number is a prime, 1 is not prime. 
		public static boolean checkPrime(long primeNumber) {
			int a = 2; 
			
			if (primeNumber == 1) {
				return false; 
			}
			while(a <= Math.sqrt(primeNumber)){
				if(primeNumber % a == 0){
					return false;
				}
				a++; 
			}
	     return true; 
		}
	
		
		// Requires: A positive number
		// Checks if the number is a palandrome
		public static boolean checkPalandrome(int number){
			LinkedList<Integer> list = new LinkedList<Integer>();
			int tempStorage = 0; 
			
			// make the list of parsed integers 
			while(number > 0){
				tempStorage = number - ((number / 10) * 10);
				list.add(tempStorage);
				number /= 10; 
			}
			
			// Go through list from opposite ends comparing values 
			int listSize = list.size();
			for(int i = 0; i < listSize; i++){
				if(list.get(i) != list.get(listSize - (i + 1))){
					return false; 
				}
			}
			
			// if it got this far it's a palandrome 
			return true; 
			
		}
	
}
