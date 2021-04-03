package day22_constructor;

public class CarUret {

	//SORU ........ CONSTRUCTIR BU CLASS'DA NEREDE ?
	//þu anda bu class'da gorunur bir constructýr yok 
	//bir class olusturuludugunda Java bu class'dan obje üretilecegini bilir 
	//ve gorunmeyen default constructor class'a yerlestýrýr.
	// DEFAULT CONSTRUCTOR parametresizdir dolayýsýyla sadece hic bir ozellýgý tanýmlanyamayan 
    // objeler uretýr(tshort uret gibi )
	//default constructor ile uretilen bir objenin tum ozellýklerý sonradan tanýmlanmalýdýr.
	
	//eger biz sonradan bir constructor yazarsak ,Java default constructor'ý iptal eder.
	
	//bir constructor olusturalým
	public CarUret() {
		
		
	}
	/*kurallar 
	 * 1-) ismi class ile ayný olmalýdýr ( dolayýsýyla buyuk harf ýle baslar)
	 * 2-) Constructor return type'a  sahip degildir.
	 * 3-)Constructor isminden sonra mutlaka parantez olur () ama parametre olmasý obsiyoneldir.
	 * 4-)bir constructor olusturuldugunda kýmlerýn kullanacagýný belýrlemek ýcýn acces modifier yazýlýr
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
