package day07_�felsestatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		//kullan�c�dan yas�n� sorun 
		//65 den buyukse emekli olab�l�rs�n
		//yoksa emekl� olamazs�n yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ya��n�z");
		
		double num1=scan.nextDouble();
		
		if (num1>=65) {
			System.out.println("emekli olabilirsiniz");
		}
		if (num1<65) {
			System.out.println("emekli olamazs�n�z");
		}
		
scan.close();
	}

}
