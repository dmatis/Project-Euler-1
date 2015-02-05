package problems31to40;

//correct
//easy just use divide and modolos 
public class Problem37 {

	public static void main(String[] args) {
		int total = 0; 
		int number = 10;
		int sum = 0; 

		System.out.println(trunctablePrime(3797));
		while(total < 11){
			//so that I dont have to change reverse number 
			if(number%10 != 0){
				if(trunctablePrime(number)){
					System.out.println(number);
					sum +=number; 
					total++; 
				}
	
			
			}
			number++;
		}
		
		System.out.println(sum);

	}
	
	private static boolean trunctablePrime(int number){
		return checkLeftToRightPrime(number) && checkRightToLeftPrime(number);
	}



	private static boolean checkRightToLeftPrime(int number) {
		while(number>0){ 
			if(!checkPrime(number))
				return false;
			number /= 10;
		}
		return true; 
			
	}

	private static boolean checkLeftToRightPrime(int number) {
		String tempString = String.valueOf(number);
		int length = tempString.length(); 
		
		for(int i = 0; i < length; i++){
			int tempNumber = (int) (number%(Math.pow(10, i)));
			if(!checkPrime(tempNumber))
				return false; 
		}
		return true; 
	}

	//checks if given integer is prime 
	private static boolean checkPrime(int primeNumber) {
		int a = 2; 
		if(primeNumber == 1)
			return false; 
		while(a <= Math.sqrt(primeNumber)){
			if(primeNumber % a == 0){
				return false;
			}
			a++; 
		}
     return true; 
	}

}
