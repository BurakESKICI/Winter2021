package day06_ifstatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		

		int a= 10;
		int b= 8;
		
		if (a>b) {  // e�er bu i�lem true ise ilk say� b�y�k yaz�cak
			System.out.println("ilk say� b�y�k");
		}
		 if (a*b<0) {// false oldugu �c�n asag�dak�n� yazmad�
			 System.out.println("say�lar�n �arp�m� negatif");
		 }
		 
		 if (a<b  ||  b>0) {// or (veya) yazd�k b� tanes� dogru oldugu �c�n true oldu d�rek �al��t�
			 System.out.println("or'lu c�mle �al��t�");
		 }
		 
		 if (a-b>0 && a*b>0) {
			System.out.println("and c�mlesi cal��t�");
		}
		
		
		
	}

}
