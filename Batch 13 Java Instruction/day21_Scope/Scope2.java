package day21_Scope;

public class Scope2 {

	public static void main(String[] args) {
		
		//Static variable'lar icin object olusturma ihtiyaci yoktur 
		//Baska bir class'DAn static variable'lara ulasmak istedigimizde
		//ulasmak istedigimiz class'in adi.Static variable adi yazmamiz yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);// Java Run Time program'dir
		                                  // Scope2 Class'i calistirildiginda Scope1 calismazzzzzzzzzzzzzzzzzz
		                                  // dolayýsýyla en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="mehmet koleji";  //Mehmet Koleji
		System.out.println(Scope1.okulAdi);

		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
		
	}

}
