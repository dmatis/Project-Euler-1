// correct 
public class Problem2 {


	public static void main(String[]args){

		// variables for answer and for the two fib numbers 
		 int fib1 = 1;
		 int fib2 = 2; 
		 int sum = 0;
		 
		 // while both fib numbers are smaller than 4 million
		 // go through them and if they are even add them to 
		 // the sum 
		 while(fib1 < 4*1E6 && fib2 < 4*1E6){
			 if(fib1 % 2 == 0){
				 sum += fib1;
			 }
			 if(fib2 % 2 == 0){
				 sum += fib2; 
			 }
			 fib1 += fib2;
			 fib2 += fib1;
		
			
		 }
		// print out the answer 
		System.out.println(sum);
	}
}
