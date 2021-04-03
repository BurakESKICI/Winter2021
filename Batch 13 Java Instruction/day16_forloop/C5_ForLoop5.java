package day16_forloop;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
		/*Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
            - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
            - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
            - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
*/

		Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 100'den Kucuk bir pozitif tam Sayi Girin");
        int sayi = scan.nextInt();
        
       for (int i = 1; i <= sayi; i++) {
		
    	   if (i%15==0) {
			System.out.println("Java guzeldir");
		} else if (i%5==0) {
			System.out.print("Guzeldir"+" ");
		} else if (i%3==0) {
			System.out.print("Java"+" ");
		} else {

			System.out.print(i+" ");
		}
    	   
    	   
	}
   
	scan.close();
	}

}
