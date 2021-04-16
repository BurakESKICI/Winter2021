package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();

		map1.put(101, "Ali, Can, java");
		map1.put(102, "Veli, Yan, java");
		map1.put(103, "Ali, Yan, C#");

		System.out.println(map1);// {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}

		// map'te print yaptigimizda diger interface'ler gibi koseli parantez yerine
		// korlybrace yapiyor birde icerisinde key'i esitleyerek yazdiriyor

		map2.put(101, "Vehri, Bas, java");
		map2.put(102, "Esra, Coban, SQL");

		System.out.println(map2);// {101=Vehri, Bas, java, 102=Esra, Coban, SQL}

		map1.putAll(map2);
		System.out.println(map1);// {101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#}

		// map'a yeni bir entry(key+value) eklemek istedigimde ,Java key'e bakar
		// ilk map'de eklenecek key varsa o zaman bu key'e ait value, eklenen value ile
		// update olur.

		map2.put(104, "Omer, Ari, SQL");
		map1.putAll(map2);
		System.out.println(map1);// {101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari,
									// SQL}

		map1.putIfAbsent(102, "Ahmet, Demir, Java");
		System.out.println(map1); // {101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari,
									// SQL}

		map1.putIfAbsent(100, "Ahmet, Demir, Java");
		System.out.println(map1); // {100=Ahmet, Demir, Java, 101=Vehri, Bas, java, 102=Esra, Coban, SQL, 103=Ali,
									// Yan, C#, 104=Omer, Ari, SQL}
		// genel olrak bu putifabsent method'u eger varsa eklemez eger yoksa ekler, once
		// bi kontrol eder
		// ama diger put methodlari direk onceki key'i degistiriyor ve ekliyor.

		System.out.println(map1.containsKey(101));// true
		System.out.println(map1.containsValue("java")); // false
		System.out.println(map1.containsValue("Vehri, Bas, java"));// true //degerin tamamini yazarsak bakarak ariyor am
																	// string'in tamamina bakiyor stringi parcalamadan
		

	}

}
