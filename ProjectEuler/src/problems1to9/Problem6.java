package problems1to9;

//correct 
import java.math.BigInteger;


public class Problem6 {

	public static void main(String[]args){
		long a = 0; 
		
		BigInteger b = BigInteger.ZERO;
		BigInteger c = BigInteger.ZERO;
		
		//get (1+2...+100)^2
		for(int i = 1; i <= 100; i++){
			a += i; 
			}
	    //set it to a bigInteger for equality of types 
	    c = BigInteger.valueOf(a);
	    //square it 
	    c = c.multiply(c);

	    //add all sqaures to other big int 
	    for(int i = 1; i <= 100; i++){
	    	BigInteger d = new BigInteger("0");
	    	d = BigInteger.valueOf(i);
	    	b = b.add(d.multiply(d));
	    }
	    
	    //print difference 
	    System.out.println(c.subtract(b));
	}
	
}
