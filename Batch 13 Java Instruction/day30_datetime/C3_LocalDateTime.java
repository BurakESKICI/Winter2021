package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		// 
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); //2021-03-19T23:06:45.930553100
		
		System.out.println(ldt.toString());
		
		String time =ldt.toString();
		
		System.out.println(time.startsWith("2021"));
		
		
		
		

	}

}
