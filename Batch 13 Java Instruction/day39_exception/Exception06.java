package day39_exception;

import java.util.ArrayList;
import java.util.List;

public class Exception06 {

	public static void main(String[] args) {
		/*
		 *List ve array'de varolmayan bir index ile i�lem yapmak �stersen�z, 
		 *Java IndexOutOfBoundsException verir 
		 */
		
		int arr[]= {1,2,5,6};
		
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); //6
	//	System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
		
		
		List<String> list= new ArrayList<>();
		list.add("Bahattin");
		list.add("Kaz�m");
		list.add("Celil");
		System.out.println(list); // [Bahattin, Kaz�m, Celil]
		
		System.out.println(list.get(1)); // Kaz�m
		System.out.println(list.get(3)); //IndexOutOfBoundsException

	}

}
