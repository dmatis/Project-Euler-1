package problems20to29;

//correct
//super easy (thanks BigInteger...) 
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class Problem29 {

	public static void main(String[] args) {
		Set<BigInteger> numbers = new TreeSet<BigInteger>();
		
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b<= 100; b++){
			BigInteger tempInteger = BigInteger.valueOf(a);	
			tempInteger = tempInteger.pow(b);	
			numbers.add(tempInteger);
			}						
			
		}
		System.out.println(numbers.size());
		

	}

}
