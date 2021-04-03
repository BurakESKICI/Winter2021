package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {

	public String bolum = "takimhane";
	public int sorOldIscisayi = 20;

	public static void main(String[] args) {

		UstaBasi ub1 = new UstaBasi();
		// Objeyi torun (3 asag� class oldugu �c�n ded�k) clas�nda olusturunca 3 classA
		// da ulasab�l�yoruz

		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIscisayi); // 20
		System.out.println(ub1.saatUcreti); // 10
		System.out.println(ub1.isim); // Mehmet

		// List<String> list= new ArrayList<>();
		// Object str =new String("Hasan");
		Isci ub2 = new UstaBasi();
		// Extends ile birbirine bagli olan class'larda IS-A relation olan Data turleri
		// istege bagl� olarak kullan�lab�l�r.
		//Daha geni� Data turu Yazman�n avantaji : Kapsam� daha geni� olmas� 
		// Daha geni� Data turu Yazman�n dezavantaji : 
		//Data turu olarak sect�g�m�z class ve parent(lar�na ) ait datalara ulasabiliriz.
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id);// Personel'e ulas�cak sadece 1001 yazd�r�cak :D
		
		
		
		

	}

}
