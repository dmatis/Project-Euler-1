package problems31to40;

//correct 
//super easy 
public class Problem34 {

	public static void main(String[] args) {
		final long end = 99999; 
		long sum = 0; 
		
	    for(int i = 3; i < end; i++){
	    if(digitFactorialsum(i) == i)
	    	sum += i; 
	    }		
        System.out.println(sum);
	}

	private static int digitFactorialsum(int integer) {
		int tempNumber = 0; 
		int sum = 0; 
		
		while(integer > 0){
			tempNumber = integer%10; 
			integer /= 10; 
			sum += factorial(tempNumber); 
		}
		
		return sum; 
	}

	private static int factorial(int tempNumber) {
		int sum = 1; 
		while(tempNumber > 0){
			sum*= tempNumber;
			tempNumber--;
		}
		
		return sum; 
	}

}
