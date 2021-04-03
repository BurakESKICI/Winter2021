package day002;

import java.util.Scanner;

public class afiþ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan= new Scanner(System.in);
        
        
        System.out.println("What is your name");
        
        String name=scan.nextLine();
        
        
        System.out.println("What's your pet's name?");
        String pet = scan.nextLine();
        
        System.out.println("How old is she/he?");
        String age= scan.nextLine();
        
        
        System.out.println("What do you like to do with her/him?");
        
        String activity = scan.nextLine();
        
        
        System.out.println("Where do you play?");
        
        String place=  scan.nextLine();
        
        
        System.out.println("Hey " + name + "!" + pet + " is " + age + " years old." + "sever " + activity + "  " + place + "." );


	}

}
