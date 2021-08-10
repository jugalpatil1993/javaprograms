import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str = sc.next();
		
		String org_string = str;
		
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(org_string.equals(rev)) {
			System.out.println(org_string +" is the plaindrome");
		}
		else {
			System.out.println(org_string +" is not the plaindrome");
		}
	}

}
