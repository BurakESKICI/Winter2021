package day48_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	private static final String istenenDilmap1 = null;

	public static void main(String[] args) {
		// asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
		// bir method yaziniz.
		
		Map<Integer, String> map1 = new HashMap<>();
		

		map1.put(101, "Ali, Can, java");
		map1.put(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");
		
		//1-) ilk dusunecegim ben method'a ne gonderecegim 
		// gidecek" map" var birde "String " var
		
		//2-) ikinci olarak bana method ne dondurucek
		//liste olarak isimleri dondurucek return list
		
		
		String istenenDil ="JAVA";
		
		List<String> isimList = javaBilenler(map1,istenenDil);
		//NOT: esitligin sol tarafinda donecek obje'ye gore belirle 
		// sag tarafi ise method call'oluyor(method ismi ve parametreler
		System.out.println(isimList);

	}

	public static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		//NOT : ilk yapicagim is value'lari birer birer alicaz
		//
		List<String> isimListesi =new ArrayList<>();
		
		for (String each : map1.values()) {
			
			String arr[] =each.split(", ");
			
			if (arr[2].equalsIgnoreCase(istenenDil)) {
				isimListesi.add(arr[0]);
			}
		}
		
		
		return isimListesi;
	}

}
