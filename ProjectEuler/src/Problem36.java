//correct
//super easy 
public class Problem36 {

	public static void main(String[]args){
		int sum = 0; 
		
		for(int i = 0; i <= 1E6; i++){
			if(doublePalindrome(i))
				sum += i; 
			
			
		}
		
		System.out.println(sum);
		
	}

	private static boolean doublePalindrome(int i) {
		String number = String.valueOf(i);
		String binaryNumber = Integer.toBinaryString(i);
		
		return palindrome(number) && palindrome(binaryNumber);
	}

	private static boolean palindrome(String number) {
		char[] characters = number.toCharArray();
		for(int i = 0; i < characters.length;i++){
			int j = characters.length - ( i+ 1);
			if(characters[i] != characters[j])
				return false; 
		}
		return true; 
	}
}
