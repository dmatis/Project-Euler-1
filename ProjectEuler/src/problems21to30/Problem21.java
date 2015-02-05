package problems21to30;

//correct
//make sure to follow the a != b clause, changes answer drastically 
public class Problem21 {

	public static void main(String[] args) {
		int total = 0; 
		for(int i = 0; i < 10000;i++){
			if(amicableNumber(i)){
				total += i; 
			}
		}
		System.out.println(total);

	}

	public static boolean amicableNumber(int x){
		if(x == sumOfDivisers(sumOfDivisers(x)) && x != sumOfDivisers(x)){
			return true; 
		}else
			return false; 
	}

	
	private static int sumOfDivisers(int x) {
		int sum = 0; 
		for(int i = 1; i < x; i++){
			if(x%i == 0){
				sum+=i;
			}
		}
		return sum; 
	}
}
