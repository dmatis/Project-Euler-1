package problems11to20; 

//orrect
//simple, practice using helper methods 
//contains 2-d && 1-d string arrays 
//contains BufferedReader 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem11 {

	public static void main(String[]args) throws IOException{
		
		String[][] board = new String[20][20];
		BufferedReader inputStream = null; 
		int i = 0;
		int greatestProduct = 0; 
		
		try{
			inputStream = new BufferedReader(new FileReader("Problem11InputFile"));
			String line; 
			while((line = inputStream.readLine())!= null){
				i++; 
			}

		
		}finally{
			if(inputStream != null){
				inputStream.close();
			}	
			
		}
		
		//System.out.println(board[19][19]); checking to make sure imported properly 
		
		//Input done, at this point you have a 2-d String array containing the 20x20 grid 
		for(int a = 0; a <= 19; a++){
			for(int b = 0; b <= 19; b++){
				greatestProduct = Math.max(greatestProduct, checkAllDirections(board, a, b));
				
			}
		}
		
		System.out.println(greatestProduct);

		
		
		
		
		
	}

	private static int checkAllDirections(String[][] board, int a, int b) {
		return Math.max(Math.max(checkRightDirection(board, a, b), checkDowntDirection(board, a ,b)), Math.max(checkDiagnolRightDirection(board, a ,b), checkDiagnolLeft(board, a, b)));
	
	
	
}

	private static int checkDiagnolLeft(String[][] board, int a, int b) {
          if(a <= 16 && b >= 3){
        		return Integer.parseInt(board[a][b]) * Integer.parseInt(board[a+1][b-1])* Integer.parseInt(board[a+2][b-2])* Integer.parseInt(board[a+3][b-3]); 
          }
          else{
        	  return 0; 
          }
	}

	private static int checkDiagnolRightDirection(String[][] board, int a, int b) {
		if(a <= 16 && b <= 16){
			return Integer.parseInt(board[a][b]) * Integer.parseInt(board[a+1][b+1])* Integer.parseInt(board[a+2][b+2])* Integer.parseInt(board[a+3][b+3]); 
		}else{
			return 0; 
		}
		
	}

	private static int checkRightDirection(String[][] board, int a, int b) {
		if(b<=16){
			return Integer.parseInt(board[a][b]) * Integer.parseInt(board[a][b+1])* Integer.parseInt(board[a][b+2])* Integer.parseInt(board[a][b+3]) ;
		}
		else{
			return 0; 
		}
	}

	private static int checkDowntDirection(String[][] board, int a, int b) {
		if(a<=16){
			return Integer.parseInt(board[a][b]) * Integer.parseInt(board[a+1][b])* Integer.parseInt(board[a+2][b])* Integer.parseInt(board[a+3][b]) ;
		}
		else{
			return 0; 
		}
		
	}
	
	
	
	
	
}


