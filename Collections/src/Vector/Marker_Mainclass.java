package Vector;

import java.util.Vector;

public class Marker_Mainclass {
	public static void main(String[] args) {
		Marker m1 = new Marker("Cello","blue",35);
		Marker m2 = new Marker("OX","Black",45);
		Marker m3 = new Marker("Doms","Red",30);
		
		Vector<Marker> v = new Vector<Marker> ();
		v.addElement(m1);
		v.addElement(m2);
		v.addElement(m3);
		//print red details
		for(Marker m:v) {
			if(m.getColor().equals("Red")) {
				System.out.println("Cost: "+m.getCost());
			}
		}
		//print cost>30 details
		for(Marker m:v) {
			if(m.getCost()>30) {
				m.marker_details();
			}
		}
		//modify blue marker cost
		for(Marker m:v) {
			if(m.getColor().equals("Blue")) {
				System.out.println("Cost: "+m.getCost());
			}
		}
	}
	
}
