package personal_library;

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
	
	

}
