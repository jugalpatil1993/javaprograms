import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * String str = "JAVA"; String rev = ""; for (int i=str.length()-1;i>=0;i--) {
		 * 
		 * rev = rev+str.charAt(i);
		 * 
		 * 
		 * } System.out.println(rev);
		 */
			
		
		/*
		 * String str = "JAVA";
		 * 
		 * char a[] = str.toCharArray(); String rev= ""; 
		 * for (int i=a.length-1;i>=0;i--)
		 * {
		 * 
		 * rev = rev+a[i]; } System.out.println(rev);
		 */
	
	
		String str = "JAVA";
		String rev = "";
	
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(sb);
	}

}
