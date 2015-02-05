package problems31to40;

//correct
//super easy 
public class Problem30 {

	public static void main(String[] args) {
		int sum = 0; 
		
		for(int i = 2; i < 295245;i++){
			if(i == fourthPowerSums(i)){
				sum += i; 
			}
			
		}
		
		System.out.println(sum);

	}

	private static int fourthPowerSums(int i) {
		int sum = 0; 
		while(i > 0){
			sum += Math.pow((i%10), 5);
			i /= 10; 
		}
		return sum; 
		
	}

}
