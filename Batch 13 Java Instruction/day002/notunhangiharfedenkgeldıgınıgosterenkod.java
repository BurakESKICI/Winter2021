package day002;

import java.util.Scanner;

public class notunhangiharfedenkgeldıgınıgosterenkod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the grade");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		
		if(grade>=90 && grade<= 100)
		{
			System.out.println("Letter grade is A.");
		}
		else if(grade>=80 && grade <= 89)
		{
			System.out.println("Letter grade is B");
		}
		else if(grade>= 70 && grade <= 79)
		{
			System.out.println("Letter grade is C");
		}
		else if(grade>= 60 && grade <=69)
		{
		System.out.println("Letter grade is D.");
		}
		else if(grade >= 0 && grade <=59)
		{
			System.out.println("Letter grade is F");
		}
	}

}
