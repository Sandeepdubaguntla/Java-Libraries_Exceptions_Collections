package file_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee emp=new Employee("Sandeep",3965,50000.00);
		try {
			FileOutputStream fos = new FileOutputStream("Emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.flush();
			oos.close();
			System.out.println("Data Stored...");
		} catch (FileNotFoundException e1) {
			System.out.println("Handled...");
		} catch (IOException e1) {
			System.out.println("Handled...");
		}
	}
}
