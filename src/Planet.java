import java.util.ArrayList; 

public class Planet extends SolarObjects {
	private ArrayList <Moon> moonList;
	
	public Planet(String name, double distance, double diameter, double velocity, String color) {
		super(name, distance, diameter, velocity, color);
		moonList = new ArrayList<Moon>();
	}

	public void addMoon(Moon m) {
		moonList.add(m);
		
	}
	
	
	public ArrayList<Moon> getMoonList() {
		return moonList;
}
	
	
	
	
	

}
