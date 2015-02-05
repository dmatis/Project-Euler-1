package problems21to30;

//correct
//80 seconds (-20 needed) 
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem23Fast {
	
	public static void main(String[]args){
        long sum = 0; 
		//smallest abundent number 
	    int number = 0; 
	    List<Integer> abundentNumbers = new LinkedList<Integer>();
	    Set<Integer>   abundentSums = new TreeSet<Integer>();
	    //28123 is the mathematical limit of the largest abundent number
	    //note that it is not an abundent number and they stop before 28123, its simply the mathematical theoritical limit 
	    //STEP 1: Find all the abundent numbers beneath 28123/2 
	    

	    while(number < 28123){
	    	sum+= number; 
	    	if(abundentNumber(number)){
	    		abundentNumbers.add(number);
	    	}
	    	number++;
	    }
   
	    for(int i = 0; i < abundentNumbers.size(); i++){
	    	for(int j = i; j < abundentNumbers.size(); j++){
	    		Integer tempInt = abundentNumbers.get(i) + abundentNumbers.get(j);
	    		if(tempInt < 28123)
	    	    	abundentSums.add(tempInt);
	    		else
	    			break; //break out of inner loop to prevent unnessasary additions 
	    	}
	    }


	    for(Integer current: abundentSums){
	    	sum -= current; 
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

		
		


