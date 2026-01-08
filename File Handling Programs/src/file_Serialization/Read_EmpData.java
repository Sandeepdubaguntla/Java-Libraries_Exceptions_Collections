package file_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Deserialization of Employee Data
public class Read_EmpData {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("Emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee)ois.readObject();
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
