//correct
//super easy, just make sure checking primes properly with negative numbers 
public class Problem27 {

	public static void main(String[] args) {
		int recordPrimes = 0; 
		int product = 0; 
		
		for(int a = - 1000; a < 1000;a++){
			for(int b = - 1000; b < 1000; b++){
				int numberOfPrimes = howManyPrimes(a,b);
				if(numberOfPrimes > recordPrimes){
					recordPrimes = numberOfPrimes;
					product = a*b; 
				}
				
				
			}
		}
		
		System.out.println(product);

	}

	private static int howManyPrimes(int a, int b) {
		int number = 0; 
		while(true){
			if(checkPrime(number*number + a*number + b)){
				number++; 
			}else
				return number; 
			 
			
		}
	}

	//checks if given integer is prime 
	private static boolean checkPrime(int primeNumber) {
		if(primeNumber < 0)
			return false; 
		int a = 2; 
		while(a <= Math.sqrt(primeNumber)){
			if(primeNumber % a == 0){
				return false;
			}
			a++; 
		}
     return true; 
	}
}
