package file_Serialization;

import java.io.Serializable;

public class Marker implements Serializable{
	
	private String brand;
	private String color;
	private  transient int cost;
//	transient is a keyword used to avoid serialization for the data members
	
	public Marker() {}

	public Marker(String brand, String color, int cost) {
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void display()   {
		System.out.println("Brand :" +getBrand());
		System.out.println("Color :" +getColor());
		System.out.println("Cost :"+getCost());
	}
	
	
	
}
