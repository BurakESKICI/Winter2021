package day23_staticKeyword;

public class StaticBlock {
	
	
	static String isim;
	//static block class calistiriliginda ilk olarak cal�s�r (main method 'dan bile �nce cal�s�r)
	//static block'lar static variable'lara deger atamak �c�n kullan�l�r.
	//static block'larda �ncelik s�ras� yukar�dan asag�ya dogrudur.
	
	static {
		System.out.println("1.static block cali�ti");
		
		isim ="Burak";
		System.out.println(isim);
		
	}
	

	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		
		
		
	}

}
