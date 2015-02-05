package problems11to20; 

//correct
//super cute trick to figure out this problem, involves simple path analysis 
//contains buffered reader and 2-d String arrays 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Problem18 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = null; 
		String line = null; 
		String[][] board = new String[15][15];
		int i = 0; 
		int level = 0;
	    int greatestCombo = 0; 
		
		
		try{
		input = new BufferedReader(new FileReader("Problem18InputFile"));	
		while((line = input.readLine())!= null){
			board[i] = line.split(" ");
			i++;
		}
		}
		finally{
			if(input != null){
				input.close();
			}
		}
		
		
		//System.out.println(board[14][14]); checking that the input is proper 
	    //input into a 2-d array is done here, it is 15-15 so there are empty spaces in every row but the last

		//length and depth are the same here 
     	for(int a = 1; a < board.length;a++){
     		int recorder = 0; 
     		while(recorder<=a){
     			if(recorder == 0){
     			board[a][recorder] = String.valueOf((Integer.parseInt(board[a][recorder]) + Integer.parseInt(board[a-1][0])));
     			greatestCombo = Math.max(greatestCombo, Integer.parseInt(board[a][recorder]));
     			}
     			else if(recorder == a){
     		    board[a][recorder] = String.valueOf((Integer.parseInt(board[a][recorder]) + Integer.parseInt(board[a-1][recorder-1])));
     		    greatestCombo = Math.max(greatestCombo, Integer.parseInt(board[a][recorder]));
     			}
     			else{
     				board[a][recorder] = String.valueOf((Integer.parseInt(board[a][recorder]) +  Math.max(Integer.parseInt(board[a-1][recorder]),Integer.parseInt(board[a-1][recorder-1]))));
     				greatestCombo = Math.max(greatestCombo, Integer.parseInt(board[a][recorder]));
     			}
     			recorder++; 
     		}
     		
     	}
     	
     
		System.out.println(greatestCombo);


	}

}
