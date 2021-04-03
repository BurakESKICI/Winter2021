package day05_wrapperandconcatenation;

public class C3_Concatenation {

	public static void main(String[] args) {
	
		
		//Concatenation : (birleþtirme) : Java'da birden fazla String'i + iþareti ile 
		//toplarsanýz,Java bu Stringleri yan yana yazar 
		
		String str1="java";
		String str2="güzeldir";
		
		System.out.println(str1+str2);
		
		//eger arada bosluk býrakmak ýstersek daha profesyonel gozukmesý ýcýn araya 
		//býr bosluk býrakýýrýz.
		
		System.out.println(str1+" "+str2);
		// bu PRO ca yazýmdýr
		
		//tersten yazalým birde 
		System.out.println(str2+" "+str1); 
		
		int num1= 5;
		int num2= 4;
		
		//verilen degýskenlerýn kullanarak consolda 9 yazdýrýn
		
	    System.out.println(num1+num2);
	    
	    //kýsaca string lerde sozellerde yaný býrlestýrme yapar 
	    //integer lerde sayýlarda toplama ypar biri türkçe dersi biri matamatik :)
	    
	    //ikisini corba edersek ne olur
	    
	    System.out.println(num1+num2+" "+str1+str2);
	    
	    //java iþlem önceliði olarak parantezýn ýcýnden soldan baslar sayýlarý toplar kelýmelerý de býrlestýrýr
	    //num2 ile str1 arasýnda ýse kazanan str1 yaný strýng olur ve býrlestgýrme ýslemý yapar :) 
	    
	    // þöyle bir DÝPNOTE var
	    //örnek
	    
	    System.out.println(str1 +str2 +" "+num1 + num2);
	    
	    //burda ise ilk önce strýng oldugu ýcýn Java direk birleþtirmeye gidicek ve öyle devam edýcektýr :)()()
	    
	    //fakat iþlem önceliði saçmalýgýný göz onune alarak bunu duzeltebýlrýz
	    //örnek
	    
	    System.out.println(str1 +str2 +" "+(num1 + num2));
	    // bu sekýlde mat iþlemini fazladan parantez ekleyerek yaptýrabýlýyoruz :) 
	    
	    System.out.println(num1+num2+' '+str1+str2);
	    
	    //matematiksel bir iþlem yapýlýrken char data türünden bir deðerle karsýlasýrsa 
	   // o char'in deðeri ascii tablosunda ki degeri alýr 
	    
	    System.out.println(num1+num2+str1+' '+str2);  //9 java yazar 
	    //burada stringe kaydýgý ýcýn char iþareti o yuzden concatenation yani birleþtirme yapar
	    
	    //eðer çarpma iþlemi iþin içine soksaydýk yýne ýslem oncelýgný dusuncez 
	    //örnek
	    
	    System.out.println(str1 +str2 +" "+num1 * num2);
	    
	    //normal olarak ilk çarpma yapýp orayý 20 yapýcak ardýndan strýng degerlerý devam eder býrlestýrýr.
	 
	    
	    
	    //son tekrar :)
	    
	    /*1)KURAL : eger toplama degerlerden 1 tanesý býle strýng ýse java toplama degýl
	        *concatenation (birleþtirme) yapar
        *2)KURAL : eger toplanan degerlerýn ýkýsýde matematýksel ýslem ýse java otomatýk olarak 
	       *toplar
	    *3)KURAL : eger sayý Strýng degýskenlerý býrlýkte kullanýlýcaksa oncelýkler
	         *belýrlenýp o ýslemler ýcýn parantez kullanýlabýlýr
	    *4)KURAL :  matematýksel býr ýslemde cahr degýskený kullanýlýrsa Java CHAR'ÝN ascii degerini
	         iþleme alýr
	     *5)KURAL : char bir degýsken ýse strýng bir egýsken toplanýrsa Cocatenatýon olur
	   
	   */
	    
	    
	    
	    
	    
		
				

	}

}
