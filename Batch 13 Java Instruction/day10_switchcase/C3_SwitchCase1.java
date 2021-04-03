package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan bir rakam isteyin girilen rakami yazi ile yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir rakam giriniz");
		
		int rakam=scan.nextInt();
		if (rakam==0) {
			System.out.println("SIFIR"); 
	    }else if (rakam==1) {
			System.out.println("B�R");
		}else if (rakam==2) {
			System.out.println("�K�");
		} else if (rakam==3) {
			System.out.println("UC");
		}else if (rakam==4) {
			System.out.println("DORT");
		}else if (rakam==5) {
			System.out.println("BES");
		}else if (rakam==6) {
			System.out.println("ALTI");
		}else if (rakam==7) {
			System.out.println("YEDI");
		}else if (rakam==8) {
			System.out.println("SEK�Z");
		}else if (rakam==9) {
			System.out.println("DOKUZ");
		}else {
			System.out.println("Lutfen bir rakam gir adam�m!");
		}
		
		//simdi bu kodu switch ile yazal�m
		
		switch (rakam) {
		
		case 0:
			System.out.println("SIFIR");
			break;
		case 1 :
            System.out.println("B�R");
            break;
		case 2:
			System.out.println("�K�");
		case 3 :
            System.out.println("UC");
            break;
		case 4 :
            System.out.println("DORT");
            break;
		case 5 :
            System.out.println("BES");
            break;
		case 6 :
            System.out.println("ALTI");
            break;
		case 7 :
            System.out.println("YED�");
            break;
		case 8 :
            System.out.println("SEK�Z");
            break;
		case 9 :
            System.out.println("DOKUZ");
            break;
		default:
			System.out.println("rakam gir adam�m!");
			break;
		}
		
		
		
		

		scan.close();
	}

}
