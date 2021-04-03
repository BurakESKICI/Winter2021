package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		
		//kullanýcýdan bir cumle ve bir harf isteyin 
		//while loop kullanarak cumlede ýstenen harf kac kez kullanýlmýs bulunuz
		//Program Case Senstive olsun ( buyuk harf kucuk harf onemli demek )
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine();
		System.out.println("lutfen saymak ýstedýgýnýz harfý gýrýnýz");
		String harf=scan.next().substring(0, 1);  //String olarak ilk harfi alýr.
		
		int count=0;
		
		int index = 0;
		
		while (index<cumle.length()) {
			
			if (cumle.substring(index, index+1).equals(harf)) {
			    count++;
			    
			}
			index++;
			
		}
		System.out.println("cumlede "+ harf +" harfi "+count +  " defa kullanýlmýs");
		
		
scan.close();
	}

}
