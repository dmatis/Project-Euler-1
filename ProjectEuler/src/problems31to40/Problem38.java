package problems31to40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Problem38 {

	private static int biggestAns = 0; 

	public static void main(String[] args) {
			build();
			System.out.println(biggestAns);
	}

	private static void build() {
		buildOneAndTwo();
		buildThree();
		buildFour();
	}

	public static boolean pandigital(int currentNumber){
	Set<Integer> digits = new HashSet<Integer>();
		while(currentNumber > 0){
		int tempInt = currentNumber%10; 
		if(tempInt == 0)
			return false; 
		digits.add(tempInt);
		currentNumber/=10; 
		}
		return digits.size() == 9; 
	}

	public static void buildOneAndTwo(){
		for(int i = 1; i < 100; i++){
			List<String> possibleConcats = new ArrayList<String>();
			possibleConcats.add(String.valueOf(i));
			possibleConcats.add(String.valueOf(i * 2));
			possibleConcats.add(String.valueOf(i * 3));
			possibleConcats.add(String.valueOf(i * 4));
			possibleConcats.add(String.valueOf(i * 5));
			possibleConcats.add(String.valueOf(i * 6));
			possibleConcats.add(String.valueOf(i * 7));
			possibleConcats.add(String.valueOf(i * 8));
			possibleConcats.add(String.valueOf(i * 9));
			String a = ""; 
			int index = 0; 
			while(a.length() < 9){
			a = a.concat(possibleConcats.get(index)); 
			index++; 
			}
			if(a.length() == 9){
				int aInt = Integer.parseInt(a);
				if(pandigital(aInt)){
					if(aInt > biggestAns)
						biggestAns = aInt; 
				}
			}
				
		}
	}

	public static void buildThree(){
		for(int i = 100; i < 334; i++){
			String a = String.valueOf(i);
			String b = String.valueOf(i * 2);
			String c = String.valueOf(i * 3);
			a = a.concat(b).concat(c);
			int aInt = Integer.parseInt(a); 
			if(pandigital(aInt)){
				if(aInt > biggestAns)
					biggestAns = aInt; 
			}
		

		}
		
	}
	public static void buildFour(){
		for(int i = 5000; i < 10000; i++){
			String a = String.valueOf(i);
			String b = String.valueOf(i * 2);
			a = a.concat(b);
			int aInt = Integer.parseInt(a);
			if(pandigital(aInt)){
				if(aInt > biggestAns)
					biggestAns = aInt; 
			}
			
		}
	}
}