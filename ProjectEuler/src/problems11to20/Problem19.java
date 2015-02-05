package problems11to20; 

//correct
//pretty easy and boring, just use loops 
public class Problem19 {

	public static void main(String[] args) {
		int month = 1;
		int day = 1; 
		int year = 1901; 
		int dayOfWeek = 1; 
		boolean isLeapYear = false; 
		int sundays = 0; 
		
		
		while(year < 2000 || (year == 2000 && day <= 31 && month <= 12)){
			if(dayOfWeek == 7 && day == 1){
				sundays++; 
			}
			//TickTimeForward:
			//tickday
			day++;
			//update day of week
			dayOfWeek++; 
			if(dayOfWeek == 8){
				dayOfWeek = 1; 
			}
			//tickmonths 
			if(month == 2 && day == 29 && isLeapYear){
				day = 1; 
				month++; 
			}
			if(month == 2 && day == 28 && !isLeapYear){
				day = 1; 
				month++; 
			}
			
			
			else if((month == 1 ||month == 3||month==5 ||month == 7||month == 8|| month == 10||month==12)&& day == 31){
				day = 1;
				month++; 
			}
			else if((month == 4 || month == 6 || month == 9|| month == 11) && day == 30){
				day = 1;
				month++;
			}
			//tickyears
			if(month == 13){
				month = 1; 
				year++; 
				//update whether it is a leap year 
				if(year%400 == 0||(year%4==0 && year%100!=0)){
					isLeapYear = true; 
				}
				else{
					isLeapYear = false; 
				}
				
			}
			
	
		
			
		
		}
		System.out.println(sundays);
	}

}
