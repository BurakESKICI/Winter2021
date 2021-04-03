package day14_methodcreation;

public class C2_MethodCreation2 {

	 public              static            void             main       (String[] args)         {        

 //acces modifier    //main method       //return type    //isim    //parametre               // body
	                                      //döndürdügü              //data tipi String
	                                    //bir sonuc yok            //ismi'de args'dir
	 
		 //bir method'u calistirmak icin main method'un icinden cagirmamiz gerekir bir method'u 
		 //cagirmak icin ise method adini ve parametrelere uygun argumentleri yazmaliyiz.
		 ortalama(85.2 ,90.3); //method call 
		 
		 
		 
		 
		 
	 }// main method sonu
	 
	 // bir method olusturmak istedigimizde Class'in icinde ama main method'un disinda 
		 // bir alanda olusturmalýyýz.Genel kullaným method'lari main method 'dan sonra olur.
		 
		 public static void ortalama(double sayi1, double sayi2) {
			 
			 System.out.println("girdiginiz 2 sayinin ortlamasi :" + (sayi1+sayi2)/2);
			 //bir method'u olusturmak o method'u calistirmak icin yeterli degildir.
			 //olusturulan method main method icinden cagrilinca calisir.
			 
		 }
		 
		 
		 
	
}  //Class sonu 
