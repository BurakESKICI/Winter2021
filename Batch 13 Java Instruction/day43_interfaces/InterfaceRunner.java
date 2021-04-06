package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {

		// static olarak tanýmlanmýs bir variable veya method baþka class'dan
		// classIsmi.methodIsmi þeklinde çaðrýlabilir.
		
		Interface02.deneme2();
		
		
		// Default keyword'ü ile olusturdugumuzmethod ise 
		// obje üzerinden çaðrýlabilir.
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();

	}

}
