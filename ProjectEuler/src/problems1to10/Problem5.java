package problems1to10;

//correct
public class Problem5 {

	public static void main(String[] args) {
		
	int a = 20;
	boolean going = true; 
	
	while(going){
	if(checkOneToTwenty(a)){
		System.out.println(a);
		going = false; 
	}
	a += 20; 
	}


	}
	
	public static boolean checkOneToTwenty(int a){
		for(int i = 1; i <= 20; i++){
			if(!(a % i == 0)){
				return false; 
			}
		}
		return true; 
	}
	
	

}
