package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForeachLoop3 {

	public static void main(String[] args) {
		// verlien bir array'deki tum elemanlar� bir listeye aktaran bir method yaz�n�z

		String arr[] = { "Ali", "Veli", "Ayse", "Fatma" };

		List<String> list = listeyeCevir(arr);
		
		list.add(0,"Bu is bu kadar");
		System.out.println(list);

	}

	private static List<String> listeyeCevir(String[] arr) { // static yapmam�z�n sebebi direk mainden cag�rmak �c�n

		List<String> geciciList = new ArrayList<>();
		
		for (String each : arr) {
			
			geciciList.add(each);
		}
		
		return geciciList;
	}

}
