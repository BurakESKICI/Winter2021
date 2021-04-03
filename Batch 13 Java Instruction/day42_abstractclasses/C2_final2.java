package day42_abstractclasses;

public class C2_final2 extends C1_final {

	public static void main(String[] args) {
		System.out.println(C1_final.SAY�);

		// static bir variable okul ismi gibi herkes i�in ayn�d�r.

		// C1_final.SAY�+=20;
		// sayi variablesi final olarak tan�mland�g� �c�n deg�st�r�lemez

		C2_final2 obj1 = new C2_final2(); // method cag�r�rken hata al�rsak eger genelde static olmad�g� �c�nd�r ve
											// method cag�r�rken static hatas� al�rsak o class'da yen� bir obje
											// olustururuz ve onunla birlikte methodu cag�r�r�z.

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
