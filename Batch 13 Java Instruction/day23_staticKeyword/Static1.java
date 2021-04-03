package day23_staticKeyword;

public class Static1 {

	   static String isim = "Ridvan";
	    int yas = 49;
	    @SuppressWarnings("static-access") 
		public static void main(String[] args) {
	        
	        /*Static Variable'ler olusturulan tüm Object'ler icin gecerlidir. (Okul Adi Gibi)
	         * 
	         * Örnegin bir Class'da bir Instance, bir de Static Variable olsun:
	         * 
	         */
	        
	        Static1 str1 = new Static1 ();
	        Static1 str2 = new Static1 ();
	        Static1 str3 = new Static1 ();
	        
	        
	        str1.isim = "Hasan";
	        str1.yas = 25;
	        System.out.println(str1.isim + " " + str1.yas);
	        System.out.println();
	        
	        
	        str2.isim = "Ayse";
	        str2.yas = 30;
	        System.out.println(str2.isim + " " + str2.yas);
	        System.out.println(str1.isim + " " + str1.yas);
	        System.out.println();
	        
	        
	        str3.isim = "Alican";
	        str3.yas = 40;
	        System.out.println(str3.isim + " " + str3.yas);
	        System.out.println(str2.isim + " " + str2.yas);
	        System.out.println(str1.isim + " " + str1.yas);
	        
	        
	    }
	}