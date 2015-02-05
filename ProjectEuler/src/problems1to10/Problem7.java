package problems1to10;

//correct 
//contains prime - int method 
public class Problem7 {

	public static void main(String[] args) {
		int a = 0; 
		int primeNumber = 2; 
		int currentHigh = 0; 
		
		while(a < 10001){
			if(checkPrime(primeNumber)){
				a++; 
				currentHigh = primeNumber;
				primeNumber++; 
			}
			else{
				primeNumber++; 
			}
		}
		System.out.println(currentHigh);
		//System.out.println(primeNumber);
	}

	
	
	//checks if given integer is prime 
	private static boolean checkPrime(int primeNumber) {
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
