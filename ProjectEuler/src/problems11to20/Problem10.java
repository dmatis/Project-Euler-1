package problems11to20; 

//correct
//contains prime method
//careful large numbers needed!

import java.math.BigInteger;


public class Problem10 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO; 
		
		
		//System.out.println(checkPrime(4));
		//System.out.println(checkPrime(81));
		//System.out.println(checkPrime(101));
		for(int i = 2; i < 2*1E6; i++){
			if(checkPrime(i)){
				//System.out.println(i);
				sum = sum.add(BigInteger.valueOf(i));
			}
			
		}
		
		System.out.println(sum);

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
