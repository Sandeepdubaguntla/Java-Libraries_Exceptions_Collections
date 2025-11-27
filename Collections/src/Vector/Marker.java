package Vector;

public class Marker {
	private String brand,color;
	private int cost;
	Marker(String brand,String color,int cost){
		super();
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
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
	public void marker_details() {
		System.out.println("Brand: "+getBrand());
		System.out.println("Color: "+getColor());
		System.out.println("Cost: "+getCost()); 
	}
}
