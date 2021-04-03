package day30_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MMMM/d");
		// M :month m:minute anlamýna geldiði için ay kullanýcaksak buyuk m ile yaptýk 
		
		LocalDate tarih= LocalDate.now();
		
		System.out.println(dtf.format(tarih)); //2021/Mart/19
		
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("yyy/MMM/dd");
		System.out.println(dtf1.format(tarih)); //2021/Mar/19
		
		

	}

}
