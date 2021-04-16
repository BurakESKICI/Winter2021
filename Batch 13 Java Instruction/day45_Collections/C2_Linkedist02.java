package day45_Collections;

import java.util.LinkedList;

public class C2_Linkedist02 {

	public static void main(String[] args) {

		LinkedList<Object> ll1 = new LinkedList<>(); 
		//Collections'da esitligin sol tarafýnda <> icinde data turu yazýlmassa
		// veya data turu olarak Object yazýlsa collecitons calýsýr
		//ama boyle bir kullanýmda sureklý casting  yapýldýgý icin
		// zaman ve hafýza acýsýndan cerýmlý degýldýr

		ll1.add("A");
		ll1.add(20);
		ll1.add('C');
		System.out.println(ll1);

		LinkedList /* <Object> */ ll2 = new LinkedList<>(); // Collection flexible oldugu için Object'i silsekde
															// parametresiz
															// olsada Collection flexible olup en genýs kumede kabul
															// edýcektýr

		ll2.add("A");
		ll2.add(20);
		ll2.add('C');
		System.out.println(ll2);

		LinkedList<String> ll3 = new LinkedList<>(); // parametre tutmuyo izinvermez ama value'leri
														// Stringlerstirebilirizi +"" ile .

		ll3.add("A");
		ll3.add(""+20);
		ll3.add(""+'C');
		System.out.println(ll3);

	}

}
