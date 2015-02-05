package problems20to29;

//correct
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Problem26 {

	public static int greatestNumber; 
	public static int ans; 
	public static int i; 
	public static boolean notFound;
	private static int currentGreatestLength; 
 
	public static void main(String[] args) {
		currentGreatestLength = 0; 
		for(i = 3; i < 1000; i++){
		//	System.out.println(i);
			if(checkPrime(i)){
			notFound = true; 
			int a = 0; 
			while(notFound){	
			checkOverNines(a);
			checkOverTens(a);
		    a++;
		    }
		  }
		}
        System.out.println(ans);
		}

	private static void checkOverTens(int a) {
		BigInteger biggieSmalls = BigInteger.TEN;
		for(int b = 0; b < a; b++){
			biggieSmalls = biggieSmalls.multiply(BigInteger.TEN);
		}
		if(biggieSmalls.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
			notFound = false; 
		}
	    
		
	}

	private static void checkOverNines(int a) {
		String nines = "9";
		for(int i = 0; i < a;i++){
			nines = nines.concat("9");
		}
		BigInteger ninesNumber = new BigInteger(nines);
		if(ninesNumber.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
			if(nines.length() > currentGreatestLength){
				ans = i; 
				currentGreatestLength = nines.length();
			}
			notFound = false; 
		}
			
		
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
