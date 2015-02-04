//correct
//easy just watch for 0s (1-9 pandigital) 
import java.util.Set;
import java.util.TreeSet;

public class Problem32 {

	public static void main(String[] args) {
		int total = 0; 
		Set<Integer> numbers = new TreeSet<Integer>();
		for(int a = 1; a < 9999; a++){
			//System.out.println(a);
			for(int b = a+1; b < 9999; b++){
				int c = b * a; 
				String fullWord = "" + a + "" + b + "" + c; 
				if(containsAllDigits(fullWord))
					numbers.add(c);
			}
		}
		
		for(Integer current: numbers){
			total += current; 
		}
		
		System.out.println(total);
	}

	private static boolean containsAllDigits(String fullWord) {
		Set<Character> word = new TreeSet<Character>();
		if(fullWord.length() != 9)
			return false; 
		for(int i = 0; i < fullWord.length();i++){
		if(fullWord.charAt(i) == '0')
			return false; 
		word.add(fullWord.charAt(i));	
		}
		if(word.size() == 9)
			return true;
		else
			return false; 
	}

}
