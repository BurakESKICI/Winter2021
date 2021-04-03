package day22_constructor;

public class CarUret {

	//SORU ........ CONSTRUCTIR BU CLASS'DA NEREDE ?
	//�u anda bu class'da gorunur bir construct�r yok 
	//bir class olusturuludugunda Java bu class'dan obje �retilecegini bilir 
	//ve gorunmeyen default constructor class'a yerlest�r�r.
	// DEFAULT CONSTRUCTOR parametresizdir dolay�s�yla sadece hic bir ozell�g� tan�mlanyamayan 
    // objeler uret�r(tshort uret gibi )
	//default constructor ile uretilen bir objenin tum ozell�kler� sonradan tan�mlanmal�d�r.
	
	//eger biz sonradan bir constructor yazarsak ,Java default constructor'� iptal eder.
	
	//bir constructor olustural�m
	public CarUret() {
		
		
	}
	/*kurallar 
	 * 1-) ismi class ile ayn� olmal�d�r ( dolay�s�yla buyuk harf �le baslar)
	 * 2-) Constructor return type'a  sahip degildir.
	 * 3-)Constructor isminden sonra mutlaka parantez olur () ama parametre olmas� obsiyoneldir.
	 * 4-)bir constructor olusturuldugunda k�mler�n kullanacag�n� bel�rlemek �c�n acces modifier yaz�l�r
	*/
	
	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    // bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
    // bu class'da olusturulacak objelere ait tum ozellikler olur
    // bu class direk calistirilmayacagi icin main method olmasa da olur
    // (Kaliphane gibidir)
    
    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) {
        System.out.println("Araba " + vites + " viteslidir");
    }
}
