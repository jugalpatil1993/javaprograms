import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		System.out.print(n1+" "+n2);

		for (int i = 2; i<=num;i++) {
			sum = n1 + n2;
			System.out.print(" "+sum);
			n1=n2;
			n2= sum;
		}
		

}
}