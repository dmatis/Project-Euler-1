package problems31to40;

//Originally read the question wrong and tackled a much more impressive question.
//Most likely correct
//DONE WITH RADU NESIU
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//
public class Problem35InsaneMode {

	public static void main(String[] args) {
	    System.out.println(numberOfPossibilities(1024977));
		//System.out.println(checkPrime(7));
		//factorial represents number of possibilities,
		//divide by number of repitions * factorial of each other 
	    class Number{
	    boolean checked=false;
		int value;
		Number(int val)
		{
			value=val;
		}
	    }		
		
		Map<Integer,List<Number>> primes=new HashMap<Integer,List<Number>>();
		// initialize lists in the map or get screwed by null pointer ex
		List<Number> oneDigit = new ArrayList<Number>();
		List<Number> twoDigit = new ArrayList<Number>();
		List<Number> threeDigit = new ArrayList<Number>();
		List<Number> fourDigit = new ArrayList<Number>();
		List<Number> fiveDigit = new ArrayList<Number>();
		List<Number> sixDigit = new ArrayList<Number>();
		primes.put(1, oneDigit);
		primes.put(2, twoDigit);
		primes.put(3, threeDigit);
		primes.put(4, fourDigit);
		primes.put(5, fiveDigit);
		primes.put(6, sixDigit);
		
		for(Integer i = 1; i < 10000; i+=2){
			if(!String.valueOf(i).contains("5"))
			{
			if(checkPrime(i))
			{
				primes.get(i.toString().length()).add(new Number(i));}
			}
		}
		
		
		int count=0;
		for(Integer key : primes.keySet())
		{
			//System.out.println(key);
			List<Number> listOfPrimes=primes.get(key);
			//System.out.println(listOfPrimes.size());
			// for each set of value grab the first and buble serach the rest
			for(int i=0;i<listOfPrimes.size()-1;i++)
			{
				int actualAppearance=1;
				if(!listOfPrimes.get(i).checked)// cause we will hit those checked numbers again
				{
				for(int j=i+1;j<listOfPrimes.size();j++)
				{
					// do this for unchecked numbers
					if(!listOfPrimes.get(j).checked)
					{
					
					if(checknumbers(listOfPrimes.get(i).value,listOfPrimes.get(j).value)) // contains same values
					{
						actualAppearance++;
						listOfPrimes.get(i).checked=true;
						listOfPrimes.get(j).checked=true;
						
					}
					
					}
				}
				}	// check if actualAppearance matches expected value
			if(actualAppearance == numberOfPossibilities(listOfPrimes.get(i).value))
			{
				//System.out.println(listOfPrimes.get(i).value + " ");
				count += actualAppearance; 
			}
			}
			
		}
		
		//++count because it skips over the prime 5 and 2 and 7 
		System.out.println(count + 3);
	}
	
	//checks if given integer is prime 
	private static boolean checkPrime(int primeNumber) {
		if(primeNumber == 1)
			return false; 
		int a = 2; 
		while(a <= Math.sqrt(primeNumber)){
			if(primeNumber % a == 0){
				return false;
			}
			a++; 
		}
     return true; 
	}
	
	private static Boolean checknumbers(int i, int j)
	{
		// check appearance vector
		Integer[] apparitions=new Integer[]{0,0,0,0,0,0,0,0,0,0};
		while(i>0)
		{
			int a = i % 10; 
			apparitions[a]++;
			i/=10;
		}
		while(j>0)
		{
			int b = j % 10; 
			apparitions[b]--;
			j/=10;
		}
		for(int k=0;k<10;k++)
		{
			if(apparitions[k]!=0)
			{
				return false;
			}
		}
	
		return true;
	}
	
	private static int numberOfPossibilities(int x){
		String xString = String.valueOf(x);
		char[] xChar = xString.toCharArray();
		int length = xChar.length;
		return factorial(length) / numberOfRepeat(xChar);
		
		
	}

	private static int numberOfRepeat(char[] xChar) {
		int total = 1; 
		Integer[] apparitions= new Integer[]{0,0,0,0,0,0,0,0,0,0};
		for(char currentChar : xChar){
		apparitions[Integer.valueOf(String.valueOf(currentChar))]++;
		}
		for(int i = 0; i < 10; i++)
		{
		total *= factorial(apparitions[i]);
		}
		
		return total;
	}

	private static int factorial(int length) {
		//System.out.println(length);
		int total = 1; 
		for(int i = length;i > 1;i--){
			total *= i; 
		}
		return total; 
	}

	
	
	
	
	
	
}
