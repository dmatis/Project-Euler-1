//correct
//a little tricky with double/int type casting but other than that easy 
public class Problem33 {

	public static void main(String[] args) {
		double currentNumerator = 1; 
	    double currentDenominator = 1; 
		for(int a = 10; a < 100; a++){
			for(int b =a+1; b < 100; b++){
 				double numerator = a; 
				double denominator = b; 
				double fraction = numerator / denominator;
				if(fraction == cancelNumberFirst(a,b) || fraction == cancelNumberSecond(a,b)){
					System.out.println(a + "/" + b);
					currentNumerator *= numerator; 
					currentDenominator *= denominator; 
				}
					
			}
		}
		
		System.out.println(currentNumerator / currentDenominator);

	}

	private static double cancelNumberSecond(int a, int b) {
		if(String.valueOf(a).charAt(1) == String.valueOf(b).charAt(0) && String.valueOf(b).charAt(1) != '0'){
			//System.out.println(a/10);
			//System.out.println(b%10);
			return (double)(a/10)/(double)(b%10);
		}
		else
			return -1; 
	}

	private static double cancelNumberFirst(int a, int b) {
		if(String.valueOf(a).charAt(0) == String.valueOf(b).charAt(1) && String.valueOf(b).charAt(0) != '0')
			return (double)(a%10)/(double)(b/10);
		else
			return -1; 
	}

}
