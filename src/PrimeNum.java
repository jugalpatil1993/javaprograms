import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		if(num>1) {
			for(int i = 1;i<= num;i++) {
				if(num%i==0) 
					count++;
			}
					if(count==2) {
						System.out.println("Num is a Prime Num.");
					}
					else {
						System.out.println("Num is not a Prime Num.");
					}
				
			
		}
		else {
			System.out.println("Not a Prime Number.");
		}

	}

}
