package day34_inheritence;

public class EncapsulationRunner {

	public static void main(String[] args) {

		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isokulAc�kM�());

		obj1.setOkulIsm�("Mehmet Koleji");// burada setter yaparak oncek� private calss'ta ismi farkl� bile olsa okulun
		                                     // biz bu method ile degistirebidik ama sadece burada degisti hala
											// geneldeki kolejin ismi Y�ld�z koleji
		System.out.println(obj1.getOkulIsmi());	// burada yazd�r�rsak mehmet koleji yazar.
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmi()); // burada y�ld�z koleji yazd�r�r.

	}

}
