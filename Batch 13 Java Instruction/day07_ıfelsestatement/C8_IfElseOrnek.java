package day07_ýfelsestatement;

import java.util.Scanner;

public class C8_IfElseOrnek {

	public static void main(String[] args) {
		//  Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore 
	    //cevap azdirin. Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
		//60 – 80.000 arasinda ise  “Konusabiliriz”, 60.000’nin altinda ise
		//“Maalesef Kabul edemem” yazdirin
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen teklifinizi giriniz");

		double num1=scan.nextDouble();
		
		if (num1>80000) {
			System.out.println("Kabul ediyorum");
		}
		else if (num1>60000) {
			System.out.println("Konusabiliriz");
		} else {
            System.out.println("Maalesef Kabul edemem");
        }

		scan.close();

	}

}
