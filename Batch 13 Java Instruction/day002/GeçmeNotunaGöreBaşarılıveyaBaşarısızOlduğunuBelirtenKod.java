package day002;

import java.util.Scanner;

public class GeçmeNotunaGöreBaşarılıveyaBaşarısızOlduğunuBelirtenKod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the student's grade");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		
		if (grade >= 50) { 
			System.out.println("You passed!");
		}
		else {
			System.out.println("You failed!");
		}
		
		// bu da aynı kodun farklı yazılmıs şekli ;
		
		//System.out.println("Enter the student's grade");
		//Scanner scanner = new Scanner(System.in);
		//int grade = scanner.nextInt();
		
		//System.out.println(grade >= 60 ? "You passed.": "You failed." );
		
		
	}

}
