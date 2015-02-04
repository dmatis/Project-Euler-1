//correct
//fast 
public class Problem12 {

	public static void main(String[]args){
		
		int number = 0;
		int adder = 1; 
		
		while(!overXDivisors(500, number)){
			number+= adder;
			adder++; 
		}
		
		System.out.println(number);
		
	}
	
	public static boolean overXDivisors(int x, int number){
		int recorder = 1; 
		int score = 0; 
		
		while(recorder <= Math.sqrt(number)){
			if(number%recorder == 0){
				score++; 
			}
			recorder++;
		}
		
		if(score > (x/2))
			return true;
		else
			return false; 
	}
}
