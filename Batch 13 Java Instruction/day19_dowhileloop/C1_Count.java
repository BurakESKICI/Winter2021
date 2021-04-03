package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		
		//kullan�c�dan bir cumle ve bir harf isteyin 
		//while loop kullanarak cumlede �stenen harf kac kez kullan�lm�s bulunuz
		//Program Case Senstive olsun ( buyuk harf kucuk harf onemli demek )
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine();
		System.out.println("lutfen saymak �sted�g�n�z harf� g�r�n�z");
		String harf=scan.next().substring(0, 1);  //String olarak ilk harfi al�r.
		
		int count=0;
		
		int index = 0;
		
		while (index<cumle.length()) {
			
			if (cumle.substring(index, index+1).equals(harf)) {
			    count++;
			    
			}
			index++;
			
		}
		System.out.println("cumlede "+ harf +" harfi "+count +  " defa kullan�lm�s");
		
		
scan.close();
	}

}
