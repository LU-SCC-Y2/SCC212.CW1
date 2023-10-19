/**
 * This class is used to populate the planets, moons, and maybe the asteroid belt (if capable :])
 * @author JIAJUNKK on 13/10/2023
 */
public class SolarSystemObjectsPopulator {
	private SolarObjectsList list;
	public SolarSystemObjectsPopulator(SolarObjectsList list){
		this.list = list;
	}
	
	/**
	 * This is used to populate the planets, by setting up the parameters and passing in the 
	 * SolarObjectss list, see SolarObjectsList class for more information.
	 * @param list which contains an empty SoblarObjectsList. <br>
	 * <b>See SolarObjectsList class for parameters of SolarObjects such as Planet and Sun<b>.  
	 */
	public void populatePlanets(SolarObjectsList list) {
        Sun sun = new Sun("SUN", 0, 100, 0, "YELLOW");
        Planet mercury = new Planet("MERCURY", 70, 4, 2, "GRAY");
        Planet venus = new Planet("VENUS", 90, 5, 1.6, "ORANGE");
        Planet earth = new Planet("EARTH", 120, 10.5, 1.4, "BLUE");
        Planet mars = new Planet("MARS", 150, 9, 1.2, "RED");
        Planet jupiter = new Planet("JUPITER", 350, 40, 0.8, "ORANGE");
        Planet saturn = new Planet("SATURN", 445, 25.5, 0.6, "ORANGE");
        Planet uranus = new Planet("URANUS", 480, 20, 0.4, "CYAN");
        Planet neptune = new Planet("NEPTUNE", 540, 19.8, 0.3, "BLUE");
        this.list.addSolarObjects(sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune);
	}
	
	/**
	 * This method populates the moon to their associated planets.
	 * @param list which contains a list of SolarObjects<br>
	 * If the SolarObject is an instance of Planet, then it will start checking the name of the planet and 
	 * add the associated moon(s) <br>
	 * <b>See checkPlanetName method for more details<b>.
	 */
	public void populateMoons(SolarObjectsList list) {
		for (SolarObjects s: list.getSolarObjectsList()) {
			if (s instanceof Planet) {
	            checkPlanetName((Planet) s);
			}
		}
	}
	/**
	 * This method is used to populate the asteroid belt. 
	 * @param list is used to add the asteroid into the solarObjectsList
	 * @param AsteroidNum is used to specify the number of asteroids wanted. There are 700k asteroids in our solar system
	 * 					  so users can adjust the number of the asteroids in the belt. I have put 500 asteroids in the belt for 
	 * 					  illustration purpose.
	 */
	public void populateAsteroidRing(SolarObjectsList list, int AsteroidNum) {
		for (int i = 0; i < AsteroidNum; i++) {
			Asteroid a = new Asteroid(0, 0, 0, "WHITE");	
			a.setDistance(a.calcSpacing());
			a.setDiameter(a.calcDiameter());
			a.setVelocity(a.calcVelocity());
			list.addSolarObjects(a);
		}
	}
	
	/**
	 * This method checks the name of the planets to add their associated moons to the moonList of 
	 * each planet. See more <b>details about moonList in the Planet class<b>.
	 * @param p, where p is the Planet, which is a subclass of SolarObjects.
	 */
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
			Moon jupiterMoon1 = new Moon(30, 3.25, p.getVelocity()*10, "WHITE");
			Moon jupiterMoon2 = new Moon(40, 2, p.getVelocity()*9, "WHITE");
			Moon jupiterMoon3 = new Moon(50, 6.25, p.getVelocity()*8, "WHITE");
			Moon jupiterMoon4 = new Moon(60, 4.25, p.getVelocity()*7.5, "WHITE");
			
			p.addMoon(jupiterMoon1);
			p.addMoon(jupiterMoon2);
			p.addMoon(jupiterMoon3);
			p.addMoon(jupiterMoon4);
			break;
		
		case "SATURN":
			Moon saturnMoon =  new Moon(30, 3.25, p.getVelocity()*5, "WHITE");
			p.addMoon(saturnMoon);
			
			PlanetRing ring = new PlanetRing("SaturnRing", 20, 2, 1, "ORANGE");
			ring.setRingNUm(400);
			
			for (int i = 0; i < ring.getRingNUm(); i++) {
				p.addRing(ring);
			}
		}	
	}
	
	

	
}
