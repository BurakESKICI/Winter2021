package day16_forloop;

import java.util.Scanner;

public class C2_ForLOOp2 {

	public static void main(String[] args) {
		
		//kullanicidan 2 tam sayi alin
		//ilk sayidan,ikinci sayiya kadar tum tamsayilari
		//yanyana aralari bosluk olarak yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 tam sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sayi1>sayi2) {
			
			for (int i = sayi1; i >=sayi2 ; i--) {
				System.out.print(i +",");
				
			}
			
		} else {// sayi1<sayi2

			for (int i = sayi1; i <= sayi2 ; i++) {	
				System.out.print(i +",");
			}
		
		}
			
            scan.close();
	}

}
