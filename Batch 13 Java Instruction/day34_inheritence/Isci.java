package day34_inheritence;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci i�ci1 = new Isci();

		i�ci1.isim = "Omer";
		i�ci1.soyisim = "Aydin";
		i�ci1.ID = 1001;
		i�ci1.izindemi = false;
		i�ci1.saat�creti = 10;
		i�ci1.stat� = "I�ci";
		i�ci1.maas = i�ci1.maasHesapla();
		i�ci1.prim=1000;
		

		System.out.println(
				i�ci1.ID + " " + i�ci1.isim + " " + i�ci1.soyisim + " " + i�ci1.stat� + " " + (i�ci1.maas+i�ci1.prim) + " tl");

		Isci i�ci2 = new Isci();
		
		i�ci2.isim = "Burak";
		i�ci2.soyisim = "Esk�c�";
		i�ci2.ID = 214;
		i�ci2.izindemi = true;
		i�ci2.saat�creti = 10;
		i�ci2.stat� = "y�netici";
		i�ci2.maas = i�ci2.maasHesapla();
		i�ci2.prim=7000;
		

		System.out.println(
				i�ci2.ID + " " + i�ci2.isim + " " + i�ci2.soyisim + " " + i�ci2.stat� + " " + (i�ci2.maas+i�ci2.prim) + " tl");

	
		
		
	}

}
