package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		/*
		 * kullanicidan pozitif bir rakam girmesini isteyin ve
		 * girilen rakama gore asag�daki sekli cizdirin
		 * 
		 * *
		 * * *
		 * * * *
		 * 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 10'dan kucuk pozitif bir tam sayi girin�iz");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <=sayi; i++) {
			System.out.println(" ");
			for (int j = 0; j <i; j++) {
				System.out.print("* ");
			}
			
		}
scan.close();
	}

}
