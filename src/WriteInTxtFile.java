import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTxtFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileWriter fw = new FileWriter("C:\\Users\\patil\\Documents\\test.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi, Good Morning");
		bw.write("Hi, Good Morning");
		bw.write("Hi, Good Morning");
		
		System.out.println("Message is added to test.txt");
		
		bw.close();
	}

}
