package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {

	public String bolum = "takimhane";
	public int sorOldIscisayi = 20;

	public static void main(String[] args) {

		UstaBasi ub1 = new UstaBasi();
		// Objeyi torun (3 asagý class oldugu ýcýn dedýk) clasýnda olusturunca 3 classA
		// da ulasabýlýyoruz

		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIscisayi); // 20
		System.out.println(ub1.saatUcreti); // 10
		System.out.println(ub1.isim); // Mehmet

		// List<String> list= new ArrayList<>();
		// Object str =new String("Hasan");
		Isci ub2 = new UstaBasi();
		// Extends ile birbirine bagli olan class'larda IS-A relation olan Data turleri
		// istege baglý olarak kullanýlabýlýr.
		//Daha geniþ Data turu Yazmanýn avantaji : Kapsamý daha geniþ olmasý 
		// Daha geniþ Data turu Yazmanýn dezavantaji : 
		//Data turu olarak sectýgýmýz class ve parent(larýna ) ait datalara ulasabiliriz.
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id);// Personel'e ulasýcak sadece 1001 yazdýrýcak :D
		
		
		
		

	}

}
