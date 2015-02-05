package problems10to19; 

//correct 
//easy use BigInteger
import java.math.BigInteger;


public class Problem16 {

	public static void main(String[]args){
		
		BigInteger number = BigInteger.valueOf(2);
		BigInteger sum    = BigInteger.valueOf(0);	
		
		
		for(int i = 1; i < 1000; i++){
			number = number.multiply(BigInteger.valueOf(2));
			
		}

        while(!number.equals(BigInteger.ZERO)){
        	BigInteger tempHolder = number.remainder(BigInteger.TEN);
        	sum = sum.add(tempHolder);
        	number = number.divide(BigInteger.TEN);
        }
        
        System.out.println(sum);
		
	}
}
