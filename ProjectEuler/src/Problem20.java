//correct
//contains BigInteger Digit Counter 
import java.math.BigInteger;


public class Problem20 {

	public static void main(String[] args) {
		BigInteger number = BigInteger.valueOf(100);
        BigInteger recorder = BigInteger.valueOf(99);
        BigInteger sum = BigInteger.ZERO;
		
        while(!recorder.equals(BigInteger.valueOf(1))){
        	number = number.multiply(recorder);
        	recorder = recorder.subtract(BigInteger.ONE);
        }
        
        //BigInteger DigitCounter 
        while(!number.equals(BigInteger.ZERO)){
        	BigInteger tempHolder = number.remainder(BigInteger.TEN);
        	sum = sum.add(tempHolder);
        	number = number.divide(BigInteger.TEN);
        }
        
        System.out.println(sum);
        
	}

}
