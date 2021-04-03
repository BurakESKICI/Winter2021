package day15_methodcreation;


public class C4_Forloop {

	public static void main(String[] args) {

		//5 defa Hello World yazdýralým
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		//bunun yerine loop kullanýyruz
		//ne yapacagimizi Java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		//tum looplarda 3 seyi yazmak zorundayiz
		//1) baslangic degeri
		//2) bitis degeri
		//3) artis degeri
		
		for (int i = 1; i <=5; i++) {
			System.out.println(i + "Hello World");
		}
		
		//Not : Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
		//Not : loop 'da artis degeri pozitif oldugu gibi negatif'de olabilir i--
		//Not : artis degeri 1 olmak zorunda degil,farkli da olabilir
		//Not : eger loop'un sarti hic true olmazsa loop body hic devreye girmez
			
		
		
		}
		

	}


