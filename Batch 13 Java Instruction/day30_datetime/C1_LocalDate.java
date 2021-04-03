package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate {

	public static void main(String[] args) {

		// Java'da sadece tarih kullanmak istiyorsak LocalDate Class'indan bir obje
		// �retiriz

		LocalDate tarih = LocalDate.now();
		System.out.println(tarih); // 2021-03-19

		System.out.println(tarih.plusWeeks(20)); // 20 hafta sonraki tarihi yazd�r�yor.
		System.out.println(tarih.plusDays(500)); // 500 g�n sonraki tarih nedir diye bakar.
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); // �imdide arka arkaya ekledim 3 y�l 5 ay 12
																			// g�n sonraki tarih ��k�cak

		System.out.println(tarih.minusWeeks(20));// minus yaz�ncada 20 hafta �ncesini g�rm�� olduk
		// yukar�daki pluslar�n hepsinin tersini minus ile yapabiliyorum
		
		System.out.println(tarih.getDayOfYear()); // y�l�n kac�nc� g�n� 78
		System.out.println(tarih.getMonthValue()); // 3  y�l�nc 3. ay�
		System.out.println(tarih.getDayOfWeek()); //Friday yazar bug�n g�nlerden ne olarak bakar
		LocalDate dogumGunu = LocalDate.of(1998, 9, 4);
		System.out.println(dogumGunu.getDayOfWeek()); // FRIDAY
		
		System.out.println(dogumGunu.getMonth()); // SEPTEMBER

		
		

		System.out.println(tarih.isLeapYear()); // false art�k y�l sorusunu h�zl�ca ��z�yor

		// eger suan ki tari ile degilde eski bir tarih ile islem yap�caksak
		// LocalDate.of methodunu kullan�yoruz
		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);

		System.out.println(tarih1.isAfter(tarih2)); // iki tarihi kars�last�r�rken kulland�k isAfter'� // true
		System.out.println(tarih1.isBefore(tarih2));// bu da tam tersi hangisi �nce gelir demek // false
		
		
	}

}
