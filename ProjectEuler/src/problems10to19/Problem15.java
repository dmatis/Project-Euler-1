package problems10to19; 

//correct
//easy if you can think of the trick
//problems with storage using int! (long is enough)
public class Problem15 {
	
	public static void main(String[]args){
		
		long [][]board = new long[21][21];
		board[0][0] = 1; 
		
		for(int i = 0; i < board.length; i++){
			for(int a = 0; a < board.length; a++){
				if(i == 0){
					board[i][a] = 1; 
				}
				else if(a == 0){
					board[i][a] = 1; 
				}
				else{
					board[i][a] = board[i-1][a] + board[i][a-1];
				}
				
			}
		}
		
		System.out.println(board[20][20]);
		
	}
}

