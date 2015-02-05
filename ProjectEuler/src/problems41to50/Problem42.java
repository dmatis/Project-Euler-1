package problems41to50;

//correct
//super easy 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class Problem42 {

	public static void main(String[] args) throws IOException {
		//--
		BufferedReader reader = null; 
		String[] words = null; 
		try{
			reader = new BufferedReader(new FileReader("Problem42InputFile"));
			words = reader.readLine().split(","); //only 1 line
		}finally{
			if(reader != null){
				reader.close();
			}
		}
		//--
		List<Integer> triangleNumbers = new LinkedList<Integer>();
		int number = 0; 
		int i = 1; 
		//stopping at 520 because 20 (longest word Im guessing) * 26 (the value of the letter Z) 
		while(number<520){
			number = (int) (0.5 * i * ++i);
		    triangleNumbers.add(number);
		}
		//---
        int totalWords = 0; 
        for(int a = 0; a < words.length; a++){
        	if(triangleNumbers.contains(triangleValue(words[a])))
        		totalWords++; 
        }

		System.out.println(totalWords);
		

	}

	private static int triangleValue(String string) {
		string = string.substring(1, string.length()-1);
		int tempSum = 0; 
		for(int j = 0;j < string.length(); j++){
			tempSum += Character.getNumericValue(string.charAt(j)) - 9;
		}
		return tempSum; 
	}

}
