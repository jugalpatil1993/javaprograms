
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,9,4,2};
		int sum = 0;
		int sum1 = 0;

		for (int i = 0;i<a.length;i++) {
			sum=sum+a[1];
		}
		
		System.out.println(sum);
		
		for (int v : a) {
			sum1=sum1+v;
		}
		
		System.out.println(sum);
	}

}
