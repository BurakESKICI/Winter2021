package day18_Whileloop;

import java.util.Scanner;

public class C1_NestedForLoop {

	public static void main(String[] args) {
		
	/*	Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve 
	 * girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
	 1 2 3
	 2 4 6
	  3 6 9
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen carpim tablosu icin bir rakam girin");
		int rakam=scan.nextInt();
		
		if (rakam<0) {
			System.out.println("lutfen pozitif bir rakam giriniz");
		} else {

			for (int i = 1; i <= rakam; i++) {
			//	System.out.println("");
				for (int j = 1; j <= rakam; j++) {  // eger 3 girerse !
					System.out.print(i*j+" ");     //1*1 1*2 1*3
					                               //2*1 2*2 2*3
					                               //3*1 3*2 3*3
					
				}
				System.out.println("");
			}
		}

		scan.close();
	}

}
