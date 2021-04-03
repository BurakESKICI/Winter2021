package day34_inheritence;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci iþci1 = new Isci();

		iþci1.isim = "Omer";
		iþci1.soyisim = "Aydin";
		iþci1.ID = 1001;
		iþci1.izindemi = false;
		iþci1.saatücreti = 10;
		iþci1.statü = "Iþci";
		iþci1.maas = iþci1.maasHesapla();
		iþci1.prim=1000;
		

		System.out.println(
				iþci1.ID + " " + iþci1.isim + " " + iþci1.soyisim + " " + iþci1.statü + " " + (iþci1.maas+iþci1.prim) + " tl");

		Isci iþci2 = new Isci();
		
		iþci2.isim = "Burak";
		iþci2.soyisim = "Eskýcý";
		iþci2.ID = 214;
		iþci2.izindemi = true;
		iþci2.saatücreti = 10;
		iþci2.statü = "yönetici";
		iþci2.maas = iþci2.maasHesapla();
		iþci2.prim=7000;
		

		System.out.println(
				iþci2.ID + " " + iþci2.isim + " " + iþci2.soyisim + " " + iþci2.statü + " " + (iþci2.maas+iþci2.prim) + " tl");

	
		
		
	}

}
