package day05_wrapperandconcatenation;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		
		// AND && , OR (VEYA) ||
		
		//&& AND  : i�areti iki i�lem aras�na konursa ikisini de ba�lar 
		//|| OR   : i�areti ise i�lemlerden herhangi birini ba�lar :)
		

		boolean isTrue = 5>4 && 7-3>0 ;
		System.out.println(isTrue);
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0);// true
		//NOT == : e�it mi anlam�na gel�yordu. 
		
		
		System.out.println(x+y<0 && x-y>0);// false
		
		// s�ra OR || A GE�T� :)
		
		System.out.println(x<y || x+y>0 || x*y>0); //true 
		
		//5. g�n sonu :)))
		
		
	}

}
