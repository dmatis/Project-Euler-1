package problems11to20; 

//correct
//uses buffered reader to read one line at a time
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

 
public class Problem13 {
	
	public static void main(String[]args) throws IOException{
		
		
	    BigInteger sum = BigInteger.ZERO; 
		BufferedReader inputStream = null;
	
		
		try{
			inputStream = new BufferedReader(new FileReader("Problem13InputFile"));
			String c; 
		
		while((c = inputStream.readLine())!= null){
			BigInteger tempHolder = new BigInteger(c);
			sum = sum.add(tempHolder);
		}
		}finally{
		       if (inputStream != null) {
		    	   inputStream.close();
	            }
	        }
		
		
		System.out.println(sum);
	}
	
	
	

}
