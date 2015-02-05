package problems1to9;

//correct
import java.lang.reflect.Array;
import java.util.LinkedList;


public class Problem4 {

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 1; 
		int largestPalandrome = 0; 
		
		
		while(number1 < 1000){
			while(number2 < 1000){
				int current = number1 * number2; 
				if(checkPalandrome(current) && current > largestPalandrome){
			        largestPalandrome = current; 
				}
				number2++; 
			}
			number1++; 
			number2 = 1; 
			
		}
		System.out.println(largestPalandrome);
	}
	
	public static boolean checkPalandrome(int a){
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		int tempStorage = 0; 
		
		//make the list of parsed integers 
		while(a > 0){
			tempStorage = a - ((a / 10) * 10);
			list.add(tempStorage);
			a /= 10; 
		}
		
		//make a new list the reverse way 
		for(int i = 0; i < list.size();i++){
			list2.add(list.get(list.size() - (i+1)));
		}
		
		//compare lists 
		for(int i = 0; i < list.size(); i++){
			if(!list.get(i).equals(list2.get(i))){
				return false; 
			}
			
			
		}
		
		//if it got this far its a palandrome 
		return true; 
		
		
		
		
		
			
		
	}

}
















