package problems31to40;

//correct
//couple things to watch out for, repeat digits and 0s both mess up numbers
//map here not needed but too lazy to change and not a problem 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem35 {

		public static void main(String[] args) {
	
		    class Number{
				boolean checked = false; 
				
				
			}
			
		    int total = 0;
		    
			Map<Integer, Number> primes = new HashMap<Integer, Number>();
			for(int i = 3; i < 1E6;i+=2){
				if(checkPrime(i) && !String.valueOf(i).contains("0"))
					primes.put(i,new Number());
			}
			
			for(Integer current: primes.keySet()){
				if(primes.get(current).checked == false){
				boolean stillPrime = true;
				int tempTotal = 0; 
				List<Integer> permutations = createCircularNumbers(current);
				for(int a = 0; a < permutations.size();a++){
					if(!checkPrime(permutations.get(a))){
						stillPrime = false; 	 
					}
					else if(primes.get(permutations.get(a)).checked == false){
						primes.get(permutations.get(a)).checked = true;
					    tempTotal++; 
					}
						

				}
				if(stillPrime)
					total += tempTotal; 
				
				}
			}
			
			System.out.println(++total);
			
			

		
		
		
		
		}
		
		
		private static List<Integer> createCircularNumbers(int a) {
			List<Integer> tempList = new ArrayList<Integer>();
			String lengthString = String.valueOf(a);
			int length = lengthString.length();
			for(int i = 0; i < length;i++){
			tempList.add(a);
			int b = a % 10; 
			a /= 10; 
			a += Math.pow(10,length-1) * b;
			}
			return tempList; 
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
