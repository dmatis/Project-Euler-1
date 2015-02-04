//correct
//careful with size of integers in chain! 

import java.math.BigInteger;


public class Problem14 {

	public static void main(String[]args){
		
		int number = 0; 
		int sequenceLength = 0; 
		
		for(int i = 1; i < 1*1E6;i++){
			int newSequenceLength = findSequenceLength(i);
			if(newSequenceLength > sequenceLength){
				number = i; 
				sequenceLength = newSequenceLength; 
			}
		//	System.out.println(i);
		}
		
		System.out.println(number);
		
	}

	private static int findSequenceLength(int i) {
		int sequenceLength = 0; 
		BigInteger number = BigInteger.valueOf(i);
		
		
		while(!number.equals(BigInteger.ONE)){
		if(number.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
			number = number.divide(BigInteger.valueOf(2));
			sequenceLength++; 
		}
		else{
			number = number.multiply(BigInteger.valueOf(3));
			number = number.add(BigInteger.ONE);
			sequenceLength++; 
			
		}
	}
		
		return sequenceLength; 
	}
}
