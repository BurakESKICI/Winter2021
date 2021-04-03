package day42_abstractclasses;

public class C2_final2 extends C1_final {

	public static void main(String[] args) {
		System.out.println(C1_final.SAYÝ);

		// static bir variable okul ismi gibi herkes için aynýdýr.

		// C1_final.SAYÝ+=20;
		// sayi variablesi final olarak tanýmlandýgý ýcýn degýstýrýlemez

		C2_final2 obj1 = new C2_final2(); // method cagýrýrken hata alýrsak eger genelde static olmadýgý ýcýndýr ve
											// method cagýrýrken static hatasý alýrsak o class'da yený bir obje
											// olustururuz ve onunla birlikte methodu cagýrýrýz.

		obj1.deneme();

	}

	@Override
	public void deneme() {
		System.out.println("child class'daki overriding method");
	}
	
 //	public void deneme2() {
		//Cannot override the final method from C1_final
	 // }
	
	
	
	

}
