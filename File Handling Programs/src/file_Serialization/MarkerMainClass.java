package file_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MarkerMainClass {
	public static void main(String[] args) {
		Marker m = new Marker("Cello", "Black", 50);
		try {
			FileOutputStream fos = new FileOutputStream("Marker.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			oos.flush();
			oos.close();
			System.out.println("Data Stored...");
		} catch (FileNotFoundException e) {
			System.out.println("Handled..");
		} catch (IOException e) {
			System.out.println("Handled..");
		}
		
	}
}
