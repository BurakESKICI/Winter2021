package day18_Whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/*Soru 6 ) Kullanicidan bir sayi alin ve 
		 * bu sayiyi tam bolen sayilari ve 
		 * toplam kac tane  olduklarini ekranda yazdirin
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bolenleri bulmak icin bir tam sayi giriniz");
		int sayi=scan.nextInt(); //100
		
		int bolen=1;
		
		int count=0;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				count++;
				System.out.println(bolen);
			}
			bolen++;
		}

		System.out.println(sayi + " sayisinin bolenleri :" +count +" adettir");
		
		// bolenleri su sekýlde yazdýrýn
		// 1- 1
		//2- 2
		//3- 4
		//4- 6
		//6- 10
		
         bolen=1;
		
		 count=0;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				count++; // boleni buluýnca count'ý arttýrýyorum 
				System.out.println(count + "- " + bolen);
			}
			bolen++;
		
		
		
		}
		scan.close();
	}

}
