package day34_inheritence;

public class Encapsulation {

	private String okulIsmý = "Yýldýz Koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcýkMý = true;
	
	
	public String getOkulIsmi() {
		return okulIsmý;
	}
	
	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	public boolean isokulAcýkMý() {
		return okulAcýkMý;
		
	}
	
	
	public void setOkulIsmý(String okulIsmý) {
		this.okulIsmý=okulIsmý;
	}
	public void setokulHesapNo(int okulHesapNo) { // içine Integer'de yazabilyoruz burada :D 
		this.okulHesapNo=okulHesapNo;
	}
	public void setokulAcýkMý(boolean okulAcýkMý) {
		this.okulAcýkMý=okulAcýkMý;
	}
	
	
	
	
	

}
