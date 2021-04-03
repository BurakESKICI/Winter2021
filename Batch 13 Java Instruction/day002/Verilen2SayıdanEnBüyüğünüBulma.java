package day002;

import java.util.Scanner;

public class Verilen2SayýdanEnBüyüðünüBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("lütfen deðer giriniz");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		System.out.println("lütfen deðer giriniz");
		Scanner scanner1 = new Scanner(System.in);
		double b = scanner1.nextDouble();
		
		if(a>b) {
			System.out.println("Biggest value is "+a); }
		else {
			System.out.println("Biggest value is "+b);}

	}

}
