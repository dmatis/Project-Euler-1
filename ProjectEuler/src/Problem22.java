//correct
//contains BufferedReader
//contains collection.Sort (alphabetizing strings) 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Problem22{

	public static void main(String[] args) throws IOException {
		
		LinkedList<String> namesAlpha = new LinkedList<String>();
		String[]names = null; 
		long score = 0; 
		BufferedReader inputStream = null;
		
		try{
			inputStream = new BufferedReader(new FileReader("Problem22InputFile"));
			String input = null; 
			
			while((input = inputStream.readLine()) != null){
				names = input.split(",");
			}
			
			
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
		}
		//done Input here 
        //trimming all the words 
	    for(int i = 0; i < names.length; i++){
	    	names[i] = names[i].substring(1, names[i].length() -1);
	    	}
	    
	    
	    for(int i = 0; i < names.length; i++){
	   	   namesAlpha.add(names[i]);
	    }
	
	    //list of strings in a linked list 
	    Collections.sort(namesAlpha);
	    
	    
	    for(int i = 1; i <= namesAlpha.size(); i++){
	    	score += scoreCalculator(i, namesAlpha.get(i-1));
	    }
	    
	    System.out.println(score);
		
	}
    //just takes advantage of the fact that a - 10, b - 11 for asc|| values 
	private static long scoreCalculator(int i, String string) {
		int tempSum = 0; 
		for(int j = 0;j < string.length(); j++){
			tempSum += Character.getNumericValue(string.charAt(j)) - 9;
		}
		
		return tempSum * i; 
	}

}
