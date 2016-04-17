package datum;

import java.util.Date;

public class main_datum {

	static int day, month, year, hour, min;
	
	public static void main(String[] args) {
		Date date = new Date();
		setTodayDate(date);
		setTimeNow(date);
		System.out.println("Now:");
		System.out.println(day+"."+month+"."+year);
		System.out.println( hour+":"+min );
		System.out.println();
		
		int numberOfTakes = 24, plushour = 24;
		
		for(int i = 1; i <= numberOfTakes; i++){
			
			System.out.println("plus next :"+plushour+" hours");
			plusHoursToDate(plushour);
			System.out.println(day+"."+month+"."+year);
			System.out.println( hour+":"+min );
			System.out.println();
		}
	}
	
	private static void setTodayDate(Date date){
		day = date.getDate();
		month = date.getMonth();
		month++;
				
		year = date.getYear();
		year += 1900;
	}
	
	private static void setTimeNow(Date date){
		hour = date.getHours();
		min = date.getMinutes();

	}
	
	private static void plusHoursToDate(int plusHour){
		hour += plusHour;
		if(hour>24){
			hour -= 24;
			day++;
			if(month%2 ==1){
				if(month <= 7){
					if(day>31){
						day -= 31;
						month++;
						if(month>12){
							month -= 12;
							year++;
						}
					}
				}else{
					if(day>30){
						day -= 30;
						month++;
						if(month>12){
							month -= 12;
							year++;
						}
					}
				}
			}
			else if(month%2 ==0){
				if(month ==2){
					if(year%4 ==0){
						if(day>29){
							day -= 29;
							month++;
						}
					}else{
						if(day>28){
							day -= 28;
							month++;
						}
					}
				}
				else if(month != 2){
					if(month < 7){
						if(day>30){
							day -= 30;
							month++;
							if(month>12){
								month -= 12;
								year++;
							}	
						}
					}else{
						if(day>31){
							day -= 31;
							month++;
							if(month>12){
								month -= 12;
								year++;
							}	
						}
					}
				}
			}
		}

	}
}