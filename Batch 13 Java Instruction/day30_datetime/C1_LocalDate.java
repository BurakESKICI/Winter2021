package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate {

	public static void main(String[] args) {

		// Java'da sadece tarih kullanmak istiyorsak LocalDate Class'indan bir obje
		// üretiriz

		LocalDate tarih = LocalDate.now();
		System.out.println(tarih); // 2021-03-19

		System.out.println(tarih.plusWeeks(20)); // 20 hafta sonraki tarihi yazdýrýyor.
		System.out.println(tarih.plusDays(500)); // 500 gün sonraki tarih nedir diye bakar.
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); // þimdide arka arkaya ekledim 3 yýl 5 ay 12
																			// gün sonraki tarih çýkýcak

		System.out.println(tarih.minusWeeks(20));// minus yazýncada 20 hafta öncesini görmüþ olduk
		// yukarýdaki pluslarýn hepsinin tersini minus ile yapabiliyorum
		
		System.out.println(tarih.getDayOfYear()); // yýlýn kacýncý günü 78
		System.out.println(tarih.getMonthValue()); // 3  yýlýnc 3. ayý
		System.out.println(tarih.getDayOfWeek()); //Friday yazar bugün günlerden ne olarak bakar
		LocalDate dogumGunu = LocalDate.of(1998, 9, 4);
		System.out.println(dogumGunu.getDayOfWeek()); // FRIDAY
		
		System.out.println(dogumGunu.getMonth()); // SEPTEMBER

		
		

		System.out.println(tarih.isLeapYear()); // false artýk yýl sorusunu hýzlýca çözüyor

		// eger suan ki tari ile degilde eski bir tarih ile islem yapýcaksak
		// LocalDate.of methodunu kullanýyoruz
		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);

		System.out.println(tarih1.isAfter(tarih2)); // iki tarihi karsýlastýrýrken kullandýk isAfter'ý // true
		System.out.println(tarih1.isBefore(tarih2));// bu da tam tersi hangisi önce gelir demek // false
		
		
	}

}
