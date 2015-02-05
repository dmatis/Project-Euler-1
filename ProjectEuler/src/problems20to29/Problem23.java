package problems20to29;

//correct
//slow takes 300+ seconds
import java.util.LinkedList;
import java.util.List;

public class Problem23 {
	
	public static void main(String[]args){
        long sum = 0; 
		//smallest abundent number 
	    int number = 0; 
	    List<Integer> abundentNumbers = new LinkedList<Integer>();
	    List<Integer>  allNumbers = new LinkedList<Integer>();
	    //28123 is the mathematical limit of the largest abundent number
	    //note that it is not an abundent number and they stop before 28123, its simply the mathematical theoritical limit 
	    //STEP 1: Find all the abundent numbers beneath 28123 
	    
	    //add 0-12 to allNumber
	    while(number<12){
	    	allNumbers.add(number);
	    	number++;
	    }
	    
	    //add 12 - 28123 
	    while(number < 28123){
	    	allNumbers.add(number);
	    	if(abundentNumber(number)){
	    		abundentNumbers.add(number);
	    	}
	    	number++;
	    }
       System.out.println(abundentNumbers.size());
	    for(int i = 0; i < abundentNumbers.size(); i++){
	    	System.out.println(i);
	    	for(int j = i; j < abundentNumbers.size(); j++){
	    		Integer tempInt = abundentNumbers.get(i) + abundentNumbers.get(j);
	    		if(tempInt < 28123)
	    	    	allNumbers.remove(tempInt);
	    		else
	    			break; //break out of inner loop to prevent unnessasary additions 
	    	}
	    }

	    for(int i = 0; i < allNumbers.size(); i++){
	    	sum+= allNumbers.get(i);
	    }
	    
	    
	    System.out.println(sum);
		
				
		
		
	}

	private static boolean abundentNumber(int number) {
		int recorder = 1; 
		int sum = 0; 
		while(recorder <= (number/2)){
			if(number%recorder == 0){
				sum+= recorder; 
			}
			recorder++; 
		}
		
		if(sum > number)
			return true; 
		else
			return false; 
			
		
	}


	
}

		
		


