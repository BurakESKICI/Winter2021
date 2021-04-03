package day07_ýfelsestatement;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip 
		//yazdirin.  50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin 
		//uzerinde ise “A”
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("100 üzerinden notunuzu giriniz");
		
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lutfen gecerli not giriniz");
			}
		else if (not<50 ) {     //notumuz 0 ile 100 arasýnda
			System.out.println("notunuz : D");
		}
		else  if(not<60) {     // beným notum þuan 50 ile 100 arasýnda 
			System.out.println("notunuz : C");
		} else if (not<80){    //notum þuan 60 ila 100 arasýnda
		System.out.println("notunuz : B");
		}else if(not<100) {  //þuan80 ila 100 arasýnda 
			System.out.println("notunuz : A");
		}
		
		scan.close();
	}

}
