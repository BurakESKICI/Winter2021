package day002;



import java.util.Scanner;


public class ücgeninalaný {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
	
		System.out.println("ucgenin yukseklýgý ve taban uzunlugunu gýrýnýz");
	
		
		double yukseklýk=scan.nextDouble();
		
		double taban=scan.nextDouble();
		
		System.out.println("ucgenýn alaný ="+taban*yukseklýk/2);
	}

}
