/**
 * This is one of the child classes of the SolarObjects class. But the Planet class has two lists, which are 
 * moonList and ringList, that are used to store the Moon Objects and the PlanetRing Object
 * @author JIAJUNKK on 19/10/2023
 */
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
	
	/**
	 * This method is used to get the moonList from each planet, then draw them out. See more details in the SolarSystemPainter class. 
	 * @return moonList
	 */
	public ArrayList<Moon> getMoonList() {
		return moonList;
	}
	/**
	 * This method is used to get the ringList from specific planet, then draw them out. See more details in the SolarSystemPainter class. 
	 * and SolarSystemObjectsPopulator class. 
	 * @return ringList
	 */
	public ArrayList<PlanetRing> getRingList() {
		return ringList;
	}

	
	
	
	
	
	
	
	

}
