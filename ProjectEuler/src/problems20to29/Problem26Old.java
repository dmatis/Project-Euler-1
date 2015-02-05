package problems20to29;
//import java.math.BigDecimal;
//import java.util.LinkedList;
//import java.util.List;
//
////thinking how to deal with the first digit if 0.1666? can you still use the 9-trick? 
//public class Problem26Old {
//
//	public static int greatestNumber; 
//	public static int ans; 
//	public static int i; 
// 
//	public static void main(String[] args) {		
//		for(i = 3; i < 1000; i++){
//		double x = 1/i;
//		int zeroes= 0; 
//		while(true){
//		List<Integer> number = new LinkedList<Integer>();
//		for(int a = 0; a < 2; a++){
//		x *= 10; 
//		int tempNumber = (int)x; 
//		x -= tempNumber; 
//		number.add(tempNumber);
//		if(tempNumber == 0)
//			zeroes++; 
//		else
//			zeroes=0; 
//		}
//		if(zeroes>=20 || checkRepition(number))
//			break; 
//		
//		}
//
//
//		}
//
//	}
//
//	private static boolean checkRepition(List<Integer> number) {
//		if(number.size() == 1)
//			return false; 
//		else if(allTheSame(number) || checkRepition(combinedDoubles(number,number))){
//		    if(number.get(0).toString().length() > greatestNumber){
//		    	greatestNumber = number.get(0).toString().length(); 
//		    	ans = i;
//		    }
//			return true; 
//		}
//		
//			
//	}
//
//
//	
//	// 1 2 1 3 1 2 1 3
//	// 12 13 12 13
//	// 121 312 13 
//	// 1213 1213
//	// stop 
//	private static List<Integer> combinedDoubles(List<Integer> number, List<Integer> number2) {
//		List<Integer> tempList = new LinkedList<Integer>();
//		for(int a = 0; a < number.size()/2;a++){
//			 if(number.get(a).toString().length() == 1){
//				 String tempString = number.get(a).toString().concat(number.get(a+1).toString());   
//			 }
//		}
//	}
//
//	private static boolean allTheSame(List<Integer> number) {
//		for(int a = 0; a < number.size()-1; a++){
//			if(number.get(a) != number.get(a+1))
//				return false; 
//		}
//		return true; 
//	}
//
//}
