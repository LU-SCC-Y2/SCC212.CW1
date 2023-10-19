import java.util.ArrayList; 

public class Planet extends SolarObjects {
	private ArrayList <Moon> moonList;
	private ArrayList <PlanetRing> ringList;
	
	public Planet(String name, double distance, double diameter, double velocity, String color) {
		super(name, distance, diameter, velocity, color);
		moonList = new ArrayList<Moon>();
		
		if (name == "SATURN") {
			ringList = new ArrayList<PlanetRing>();
		}
	}

	public void addMoon(Moon m) {
		moonList.add(m);
	}
	public void addRing(PlanetRing r){
		ringList.add(r);
	}
	
	public ArrayList<Moon> getMoonList() {
		return moonList;
	}
	public ArrayList<PlanetRing> getRingList() {
		return ringList;
	}

	
	
	
	
	
	
	
	

}
