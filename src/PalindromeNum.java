import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int originalNum = sc.nextInt();
		int num = originalNum;
		int rev = 0 ;
		
		while(num!=0) {
			rev= rev*10+num%10;
			num= num/10;
				}
		
		if (originalNum==rev) {
			System.out.println("The number is a palindrome.");
		}
		else System.out.println("The number is not a palindrome");
	}

}
