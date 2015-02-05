package problems41to50;

//correct
//105 seconds (-45 needed) 
import java.util.LinkedList;
import java.util.List;


public class Problem41Fast {


	
	public static void main(String[] args) {
		for(long i = 987654321; i >0; i-=2){
			//System.out.println(i);
			if(checkPandigital(i)&&checkPrime(i)){
				System.out.println(i);
				break; 
			}
				
		}

	}
	
	
	
	private static boolean checkPandigital(long i) {
		String tempString = String.valueOf(i);
		int length = tempString.length(); 
		List<Integer> tempList = new LinkedList<Integer>();
		long biggestNumber = 0;
		
		for(int a = 0; a < length;a++){
			if(tempList.contains((int)(i%10)) || i%10 == 0)
				return false; 
			if(i%10 > biggestNumber)
				biggestNumber = i%10; 
			tempList.add((int) (i%10));
			i/=10;
		}
		
		if(biggestNumber == length)
			return true;
		else
			return false; 
		
	}



	//checks if given integer is prime 
	private static boolean checkPrime(long primeNumber) {
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


