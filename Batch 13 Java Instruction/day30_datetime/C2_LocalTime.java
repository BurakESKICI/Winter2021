package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java'da saat ile iþlem yapmak icin LocalTime Class'indan obje kullanýrýz
		
		
		LocalTime saat= LocalTime.now();
		System.out.println(saat);
		
		for (int i = 0; i <100000; i++) {
			i+=1;
		}
		LocalTime saat2= LocalTime.now();
		System.out.println(saat2);  //22:45:47.221814100
		System.out.println(saat); // 22:45:47.220814200
		
		System.out.println(saat.plusHours(15)); //13:45:47.220814200
		
		System.out.println(saat.getSecond()); // þuanki saniye yi verir
		
		System.out.println(saat.minusSeconds(65165461));// 17:25:09.349899600
		
		System.out.println(LocalTime.now(ZoneId.of("Japan"))); // japonyadaki saati verdi
		
		System.out.println(LocalTime.now( ZoneId.of("America/New_York")));
		
		
		

	}

}
