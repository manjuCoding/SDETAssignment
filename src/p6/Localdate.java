package p6;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Localdate {

	public static void main(String[] args) {
		LocalDateTime l1=LocalDateTime.now();
		System.out.println("Before formating");
		System.out.println("current date and time="+ l1);

		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM-dd-yyyy  HH:mm:ss");
		String fDate=l1.format(f);
		System.out.println("after formating date="+fDate);
		Month m=l1.getMonth();
		System.out.println("Month="+m);
		
		int day =l1.getDayOfMonth();
		System.out.println("Day of month="+ day);
		
		 
	      int seconds=l1.getSecond();
	      System.out.println("seconds="+ seconds);
			
	}

}
