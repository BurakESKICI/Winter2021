package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini 
		//return eden bir method yaziniz
		//Ornek : Input Hellooo ouyput : H=1, e=1, l=2, 0=3
		
		//bu soruda ilk yapmam gereken method'a ne gonderecegim  ?
		//method bana ne return edicek ?
		
		// kisaca method'a String gonderecegim, merthod'da bana maps dondurucuek.
		
		String input="Hellooo";
		
		
		Map<String,Integer> methoddangelenmap = harfsayisibul(input);
		System.out.println(methoddangelenmap);

	}

	public static Map<String, Integer> harfsayisibul(String input) {
		
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler));
		
		Map<String,Integer> harfkullnaimsayisi = new HashMap<>();
		
		
		for (String each : harfler) {
		   if (!harfkullnaimsayisi.containsKey(each)) {
			harfkullnaimsayisi.put(each, 1);
		}else {
			harfkullnaimsayisi.put(each, harfkullnaimsayisi.get(each)+1);
		}
		   
		}
		
		
		
		return harfkullnaimsayisi;
	}

}
