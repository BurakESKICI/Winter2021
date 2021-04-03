package day21_Scope;

public class Scope6 {

	public int num1;
	String name = "Ali";

	public static void main(String args) {
		add();
		// product (5); // static olmayan bir method satatic olan main method
		// icerisinden
	}

	public static void add() {
		// num1 ++; // static olmayan (instance) num1 static bir method icinden
		// kullanýlamaz
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");
	}

	public void product(int num3) {
		name = "Veli";
		// num2++; // num2 üstteki method'da olusturulmus locak bir variabledir.
		System.out.println(num3 * num3);
	}
}
