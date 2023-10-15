
public class SolarSystemObjectsPopulator {
	private SolarObjectsList list;
	
	public SolarSystemObjectsPopulator(SolarObjectsList list){
		this.list = list;
	}
	
	public void populatePlanets(SolarObjectsList list) {
        Sun sun = new Sun(0, 100, 0, "YELLOW");
        Planet mercury = new Planet("MERCURY", 70, 4, 2, "GRAY");
        Planet venus = new Planet("VENUS", 90, 5, -1.6, "ORANGE");
        Planet earth = new Planet("EARTH", 120, 10.5, 1.4, "BLUE");
        Planet mars = new Planet("MARS", 150, 9, 1.2, "RED");
        Planet jupiter = new Planet("JUPITER", 220, 40, 0.8, "ORANGE");
        Planet saturn = new Planet("SATURN", 310, 25.5, 0.6, "ORANGE");
        Planet uranus = new Planet("URANUS", 350, 20, 0.4, "CYAN");
        Planet neptune = new Planet("NEPTUNE", 410, 19.8, 0.3, "BLUE");
        this.list.addSolarObjects(sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune);
	}
	
	public void populateMoons(SolarObjectsList list) {
		for (SolarObjects s: list.getSolarObjectsList()) {
			if (s instanceof Planet) {
	            checkPlanetName((Planet) s);
			}
		}
	}
	
	private void checkPlanetName(Planet p) {
		String name = p.getName();
		switch (name) {
		case "EARTH":
			Moon earthMoon = new Moon(10, 2.835 , p.getVelocity()*5, "WHITE");
			p.addMoon(earthMoon);
			break;
		case "MARS":
			Moon marsMoon1 = new Moon(10, 2.5, p.getVelocity()*5, "WHITE");
			Moon marsMoon2 = new Moon(20, 2.5, p.getVelocity()*3, "WHITE");
			p.addMoon(marsMoon1);
			p.addMoon(marsMoon2);
			break;
		case "JUPITER":
			Moon jupiterMoon1 = new Moon(30, 3.25, p.getVelocity()*5, "WHITE");
			Moon jupiterMoon2 = new Moon(40, 2, p.getVelocity()*4, "WHITE");
			Moon jupiterMoon3 = new Moon(50, 6.25, p.getVelocity()*3, "WHITE");
			Moon jupiterMoon4 = new Moon(60, 4.25, p.getVelocity()*2.5, "WHITE");

			p.addMoon(jupiterMoon1);
			p.addMoon(jupiterMoon2);
			p.addMoon(jupiterMoon3);
			p.addMoon(jupiterMoon4);
			break;
		}	
	}
	
	

	
}
