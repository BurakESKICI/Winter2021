package day002;



import java.util.Scanner;


public class �cgeninalan� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
	
		System.out.println("ucgenin yuksekl�g� ve taban uzunlugunu g�r�n�z");
	
		
		double yuksekl�k=scan.nextDouble();
		
		double taban=scan.nextDouble();
		
		System.out.println("ucgen�n alan� ="+taban*yuksekl�k/2);
	}

}
