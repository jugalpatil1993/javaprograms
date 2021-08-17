import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a =sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter c:");
		int c=sc.nextInt();
		
		/*
		 * if (a>b && a>c) { System.out.println("a is the largest number."); } else if
		 * (b>a && b>c) { System.out.println("b is the largest number."); } else {
		 * System.out.println("c is the largest number."); }
		 */
		
       int largest,largest1;
       
       largest = a>b?a:b;
       largest1=largest>c?largest:c;
       System.out.println("The largest is:"+largest1);
       
	}

}
