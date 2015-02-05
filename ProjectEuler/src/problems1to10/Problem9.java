package problems1to10;

//correct 
//relativly easy, just use two for loops and be smart with what you go up to
import java.math.BigInteger;


public class Problem9 {

	public static void main(String[] args) {
		
		for(int a = 0; a <= 500; a++){
			BigInteger aBig = BigInteger.valueOf(a);
	
			
			for(int b = 0; b <= 500; b++){
				BigInteger bBig = BigInteger.valueOf(b);
				
				double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				if(c == (int)c && aBig.add(bBig.add(BigInteger.valueOf((long) c))).equals(BigInteger.valueOf(1000))){
					//System.out.println(Double.toString((a * (double)b *(double)c)));
					System.out.println(aBig.multiply(bBig.multiply(BigInteger.valueOf((long) c))));
				}
				
				
				
				
				
			}
			
			
			
		}
	

	}

}
