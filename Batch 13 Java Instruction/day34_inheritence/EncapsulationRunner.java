package day34_inheritence;

public class EncapsulationRunner {

	public static void main(String[] args) {

		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isokulAcýkMý());

		obj1.setOkulIsmý("Mehmet Koleji");// burada setter yaparak onceký private calss'ta ismi farklý bile olsa okulun
		                                     // biz bu method ile degistirebidik ama sadece burada degisti hala
											// geneldeki kolejin ismi Yýldýz koleji
		System.out.println(obj1.getOkulIsmi());	// burada yazdýrýrsak mehmet koleji yazar.
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmi()); // burada yýldýz koleji yazdýrýr.

	}

}
