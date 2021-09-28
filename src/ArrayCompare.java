import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1,2,3,4,5,6};
		int a2[] = {1,2,3,4,5,6};
		
		/*
		 * boolean status = Arrays.equals(a1, a2);
		 * 
		 * if(status == true) { System.out.println("Arrays are equal."); }
		 * 
		 * else { System.out.println("Arrays are not equal."); }
		 */
		
		boolean status  =true;
		
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				a1[i]=a2[i];
			}
		}
		
		else {
			status = false;
		}
		
		if(status==true) {
			System.out.println("Arrays are equal.");
		}
		else {
			System.out.println("Not equal");
		}
		
	}

}
