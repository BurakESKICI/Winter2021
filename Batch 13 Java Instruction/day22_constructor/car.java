package day22_constructor;

public class car {

	String marka;
	String model;
	int yýl;
	boolean kazasiVarMi;

	public static void main(String[] args) {

		car car1=new car(); // obje olusturduk 
		
		System.out.println(car1.marka +" "+car1.model + " "+ car1.yýl+" "+car1.kazasiVarMi);
		
		car1.marka="Lamborghini";
		car1.model="Aventador";
		car1.yýl=2010;
		car1.kazasiVarMi=false;
		
		System.out.println(car1.marka +" "+car1.model + " "+ car1.yýl+" "+car1.kazasiVarMi);
		
		car car2=new car();
		car2.marka="Lamborghini";
		car2.model="Huracan";
		car2.yýl=2020;
		car2.kazasiVarMi=false;
		
		System.out.println(car2.marka +" "+car2.model + " "+ car2.yýl+" "+car2.kazasiVarMi);
		
	}

}
