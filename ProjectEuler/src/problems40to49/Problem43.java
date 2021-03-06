package problems40to49;

//correct
//super cool recursion, upgraded version of the original (void as opposed to BigInteger for method)
import java.lang.Character.Subset;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem43 {

	public static BigInteger total = BigInteger.ZERO;
	
	public static void main(String[] args) {
		//start on right side, 3 digit numbers divisible by 17
		//chop off last digit and add 1-9 
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(13);primes.add(11);primes.add(7);primes.add(5);primes.add(3);primes.add(2);
		List<String> div17 = new ArrayList<String>();
		for(int i = 100; i < 1000; i++){
			if(i%17 == 0 && noRepeats(i))
				div17.add(String.valueOf(i));
		}
		for(String current: div17){
        startRecursion(current, primes,0);
		}
		System.out.println(total);
		
	}

	private static boolean noRepeats(int i) {
		int a = i % 10;
		i /= 10; 
		int b = i % 10;
		i /= 10;
		int c = i % 10; 
		if(a != b && a!= c && b != c)
			return true; 
		else
			return false; 
			
	}

	private static void startRecursion(String current, List<Integer> primes,
			int i) {
		//base case
		if(i == 6 && current.contains("0")){
		for(int b = 1; b < 10; b++){
			if(!current.contains(String.valueOf(b))){ 
				total = total.add(new BigInteger(String.valueOf(b).concat(current)));
			}
		}

		}else{
		for(int a = 0; a < 10; a++){
			String stringNumber = String.valueOf(a);
			if(!current.contains(stringNumber)){
			String testString = stringNumber.concat(current.substring(0, 2));
			if(Integer.valueOf(testString) % primes.get(i) == 0){
				startRecursion(stringNumber.concat(current), primes, i+1);
				//System.out.println(totalRecursionRunner);
			}
			}
		}
			
		}
	}

}
