package day14_methodcreation;

public class C1_MethodCreation {

	public static void main(String[] args) {
		
		// 
		
		String str = "Java cok guzel";
		
		//1)java method'larýn sadece ismine degil, isim + argument'lere bakar
		//sadece parametre sayisi degil parametre'lerin data tiplerine de bakar
		
		str.endsWith("el");   // bu metodun gorevi kelimenin son kismini kontrol etmek
		                      //Bu method'u kullanmak icin bu method'un kontrol ettikten sonra
		                      //bana rapor olarak ne getirdigini bilmem lazim
		
		//2)bir method olusturdugumuzda method'un ne yapacagina 
		//ve gorevi yaptiktan sonra bana ne dçndürücegine bastan karar vermeliyiz 
		
		// 3) bir method olusturulurken "str.indexOf(str, fromIndex)" de oldguu gibi 
		//disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
		// deklare(bildirmek) etmeliyiz 
		
		//Method'u calistirmak istedigimde(Method'u cagirmak ) parametre olarak deklare edilen
		//data tiplerine uygun degerler girmeliyiz
		// girilen bu degerlere ARGUMENT denir.
		
		str.indexOf("va", 1); //
		
		System.out.println(str.indexOf("va", 1));

	}

}
