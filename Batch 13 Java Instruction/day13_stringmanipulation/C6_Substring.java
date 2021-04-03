package day13_stringmanipulation;

public class C6_Substring {

	public static void main(String[] args) {
		
		// 
		
		String str="Her ders Java gibi olsa";
		
		
		
		System.out.println(str.substring(10));//10. index dahil (inclusive) sonuna kadar tum String
		System.out.println(str.substring(str.length()-10)); //son 10 harfi yazdirin
		
		//ilk 10 karakteri alma 
		System.out.println(str.substring(0, 10)); //substring (0 , 10) yazýldiginda
		                                          //0 inclusive, 10 exclusive
		//11..karakterden sonuna kadar olan string'i yazdiralim
		System.out.println(str.substring(10));
		
		// str'in ilk 10 karakteri *ile gizleyin geriye kalanlar normal yazilsin
		
		System.out.println("**********" + str.substring(10));
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*")+
				           str.substring(10));
		
		System.out.println(str.substring(10, 10)); // baslangýc indexi olsun der ama bitis indexi 
		                                           //olmasýn der ,Java son soyleneni yapar
		
	//	System.out.println(str.substring(8, 7)); // RTE verir 8 edn baslayip 7 ye gitmez 
		
		System.out.println(str.substring(22)); //length()-1 -> son karakter
		System.out.println(str.substring(23)); // length()  ->bosluk vericektir hiçlik 
	 //	System.out.println(str.substring(24)); //length()'den buyuk sayi yazarsak hata verir RTE
		
		
		//str'in ilk 10 karakteri * ile gizleyin,geriye kalanlar normal yazilsin
		
		String str3= str.substring(0, 10); //str'nin ilk 10 harf aldik
		str3=str3.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w", "*") + str.substring(10));
		
		
		
		
		
		
		
		
		
		
		
	}

}
