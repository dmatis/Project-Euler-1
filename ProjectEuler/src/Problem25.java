//correct
//using -- before does it before
//      ++ after does it after   
import java.math.BigInteger;


public class Problem25 {
	
	public static void main(String[]args){
		
		BigInteger fib1 = BigInteger.ONE;
		BigInteger fib2 = BigInteger.ONE; 
		int termHolder = 2; 
		
		while(true){
			
			fib1 = fib1.add(fib2);
			fib2 = fib2.add(fib1);
			termHolder+=2; 
			if(hasXDigits(fib1, 1000)){
				System.out.println(--termHolder);
				break; 
			}
			if(hasXDigits(fib2, 1000)){
				System.out.println(termHolder);
				break; 
			}
			
		}
				
				
	}
	
	
	public static boolean hasXDigits(BigInteger bigInteger, int x){
		int numberOfDigits = 0; 
	    while(bigInteger.signum() == 1){
	    	bigInteger = bigInteger.divide(BigInteger.TEN);
	    	numberOfDigits++; 
	    }
		
		
		return numberOfDigits == x; 
				
	}

}
