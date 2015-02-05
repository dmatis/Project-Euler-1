package problems21to30;

//correct 
//super easy!  
public class Problem28 {

	public static void main(String[] args) {
		int sum = 1; 
		int number = 1; 
		
		for(int i = 1; i <= 500; i++){
			number += i*2; 
			sum += number;
			number += i*2; 
			sum += number;
			number += i*2; 
			sum += number;
			number += i*2; 
			sum += number;
		}
		
		System.out.println(sum);

	}

}
