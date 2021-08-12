import java.util.Scanner;

public class CountEvenOddInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int odd_count = 0, even_count = 0;
		System.out.println("Enter the number:");
		int num  = sc.nextInt();
		
		while(num>0) {
			int rem = num%10;
			
			if (rem%2 == 0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num = num/10;
		}
		
		System.out.println("Even Count:" +even_count);
		System.out.println("Odd Count:" +odd_count);
	}

}
