package day39_exception;

public class Exception05 {

	public static void main(String[] args) {
		
		//null olarak tan�mlanm�s bir obje ile uygun olmayan bir i�lem yapmaya cal�st�g�n�zda 
		//Java NullPointerException verir.
		//Unchecked exception'dir
		
		String str1=" ";
		String str2="";
		String str3 =null ; // null bir deger degildir sadece str3'un hi�birseye esit olmad�g�n�
		                    //soyleyen bir isaretcidir(pointer)
		
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
	//	System.out.println(str3.length()); // NullPointerException
		
		System.out.println(str3+"bos"); // nullbos
		System.out.println(str3.concat("bos")); //NullPointerException

	}

}
