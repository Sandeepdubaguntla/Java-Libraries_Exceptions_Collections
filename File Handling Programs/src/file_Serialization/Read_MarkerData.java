package file_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Deserialization of Employee Data
public class Read_MarkerData {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("Marker.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Marker emp = (Marker) ois.readObject();
			emp.display();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
