package day23_staticKeyword;

public class StaticBlock {
	
	
	static String isim;
	//static block class calistiriliginda ilk olarak calýsýr (main method 'dan bile önce calýsýr)
	//static block'lar static variable'lara deger atamak ýcýn kullanýlýr.
	//static block'larda öncelik sýrasý yukarýdan asagýya dogrudur.
	
	static {
		System.out.println("1.static block caliþti");
		
		isim ="Burak";
		System.out.println(isim);
		
	}
	

	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		
		
		
	}

}
