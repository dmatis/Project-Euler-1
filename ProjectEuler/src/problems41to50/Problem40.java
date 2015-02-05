package problems41to50;

//correct
//super easy the way I did it
//run time -57-59 seconds 
public class Problem40 {

	public static void main(String[] args) {
		String numberConcat = "1";
		int index = 2; 
		while(numberConcat.length()<1000100){
		//System.out.println(index);
		String tempString = String.valueOf(index);
		numberConcat = numberConcat.concat(tempString);
		index++; 
		}
		int mult = 1; 
		int total = 1; 
		while(mult <= 1E6){
		total *= Integer.valueOf(String.valueOf(numberConcat.charAt(mult-1)));
		mult *= 10; 
		}
		System.out.println(total);
	}

}
