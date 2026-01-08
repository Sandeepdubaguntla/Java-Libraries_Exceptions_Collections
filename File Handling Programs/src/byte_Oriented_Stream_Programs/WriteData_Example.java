package byte_Oriented_Stream_Programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData_Example {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("File.txt");
			String s="1234";
			byte[] b =s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Stored Successfully...");
		} catch (FileNotFoundException e) {
			System.out.println("Handled...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
