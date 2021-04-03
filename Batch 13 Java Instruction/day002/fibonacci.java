package day002;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter a number: ");
		
		Scanner scanner = new Scanner(System.in);	
		int number = scanner.nextInt();
		int answer = fibonacci(number);
		System.out.println("Answer is "+ answer);
	}	
	public static int fibonacci(int n) {
		int t1=0, t2=1, sum=0;
		
		for(int i=1; i<n ; i++) {
			sum=t1+t2;
			t1=t2;
			t2= sum;
		}
		return sum;
		
	}

}
