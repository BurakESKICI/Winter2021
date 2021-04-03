package day002;

public class maxmýndegerhesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] y1 = {8,9,5,9};
		 int [] z1 = {7,6,3,5};
		 
		 int [] y2 = {9,9,9,5};
		 int [] z2 = {1,5,1,7};
		 
		 int [] y3 = {3,9,5,9};
		 int [] z3 = {2,6,5,4};
		 
		 System.out.println("y1 is bigger than z1 " + isBiggerArray2(y1,z1));
		 System.out.println("y2 is bigger than z2 " + isBiggerArray2(y2,z2));
		 System.out.println("y3 is bigger than z3 " + isBiggerArray2(y3,z3));
	}
	
	public static boolean isBiggerArray2(int [] y ,int [] z ) {
		
		boolean isYBiggerThanZ = true;
		
		for(int i=0; i<y.length; i++ ) {
			if (y[i]<= z[i]) {
				isYBiggerThanZ = false;
			}
			
		}
		
		return isYBiggerThanZ;
	}

}
