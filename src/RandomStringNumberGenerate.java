import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringNumberGenerate {

	public static void main(String[] args) {
		
		String str = RandomStringUtils.randomAlphabetic(2);
					System.out.println(str);
					
				String num = 	RandomStringUtils.randomNumeric(2);
				System.out.println(num);
				
				Random ram = new Random();
				System.out.println(ram.nextInt(1000000));
	
	}

}
