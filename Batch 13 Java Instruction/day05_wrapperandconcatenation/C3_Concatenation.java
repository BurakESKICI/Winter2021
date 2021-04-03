package day05_wrapperandconcatenation;

public class C3_Concatenation {

	public static void main(String[] args) {
	
		
		//Concatenation : (birle�tirme) : Java'da birden fazla String'i + i�areti ile 
		//toplarsan�z,Java bu Stringleri yan yana yazar 
		
		String str1="java";
		String str2="g�zeldir";
		
		System.out.println(str1+str2);
		
		//eger arada bosluk b�rakmak �stersek daha profesyonel gozukmes� �c�n araya 
		//b�r bosluk b�rak��r�z.
		
		System.out.println(str1+" "+str2);
		// bu PRO ca yaz�md�r
		
		//tersten yazal�m birde 
		System.out.println(str2+" "+str1); 
		
		int num1= 5;
		int num2= 4;
		
		//verilen deg�skenler�n kullanarak consolda 9 yazd�r�n
		
	    System.out.println(num1+num2);
	    
	    //k�saca string lerde sozellerde yan� b�rlest�rme yapar 
	    //integer lerde say�larda toplama ypar biri t�rk�e dersi biri matamatik :)
	    
	    //ikisini corba edersek ne olur
	    
	    System.out.println(num1+num2+" "+str1+str2);
	    
	    //java i�lem �nceli�i olarak parantez�n �c�nden soldan baslar say�lar� toplar kel�meler� de b�rlest�r�r
	    //num2 ile str1 aras�nda �se kazanan str1 yan� str�ng olur ve b�rlestg�rme �slem� yapar :) 
	    
	    // ��yle bir D�PNOTE var
	    //�rnek
	    
	    System.out.println(str1 +str2 +" "+num1 + num2);
	    
	    //burda ise ilk �nce str�ng oldugu �c�n Java direk birle�tirmeye gidicek ve �yle devam ed�cekt�r :)()()
	    
	    //fakat i�lem �nceli�i sa�mal�g�n� g�z onune alarak bunu duzelteb�lr�z
	    //�rnek
	    
	    System.out.println(str1 +str2 +" "+(num1 + num2));
	    // bu sek�lde mat i�lemini fazladan parantez ekleyerek yapt�rab�l�yoruz :) 
	    
	    System.out.println(num1+num2+' '+str1+str2);
	    
	    //matematiksel bir i�lem yap�l�rken char data t�r�nden bir de�erle kars�las�rsa 
	   // o char'in de�eri ascii tablosunda ki degeri al�r 
	    
	    System.out.println(num1+num2+str1+' '+str2);  //9 java yazar 
	    //burada stringe kayd�g� �c�n char i�areti o yuzden concatenation yani birle�tirme yapar
	    
	    //e�er �arpma i�lemi i�in i�ine soksayd�k y�ne �slem oncel�gn� dusuncez 
	    //�rnek
	    
	    System.out.println(str1 +str2 +" "+num1 * num2);
	    
	    //normal olarak ilk �arpma yap�p oray� 20 yap�cak ard�ndan str�ng degerler� devam eder b�rlest�r�r.
	 
	    
	    
	    //son tekrar :)
	    
	    /*1)KURAL : eger toplama degerlerden 1 tanes� b�le str�ng �se java toplama deg�l
	        *concatenation (birle�tirme) yapar
        *2)KURAL : eger toplanan degerler�n �k�s�de matemat�ksel �slem �se java otomat�k olarak 
	       *toplar
	    *3)KURAL : eger say� Str�ng deg�skenler� b�rl�kte kullan�l�caksa oncel�kler
	         *bel�rlen�p o �slemler �c�n parantez kullan�lab�l�r
	    *4)KURAL :  matemat�ksel b�r �slemde cahr deg�sken� kullan�l�rsa Java CHAR'�N ascii degerini
	         i�leme al�r
	     *5)KURAL : char bir deg�sken �se str�ng bir eg�sken toplan�rsa Cocatenat�on olur
	   
	   */
	    
	    
	    
	    
	    
		
				

	}

}
