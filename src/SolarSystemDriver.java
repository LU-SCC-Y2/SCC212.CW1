public class SolarSystemDriver {

	public static void main(String[] args) {
		SolarObjectsList  objList = new SolarObjectsList();
		SolarSystemObjectsPopulator populator = new SolarSystemObjectsPopulator(objList);
		
		populator.populatePlanets(objList);
		populator.populateMoons(objList);
		populator.populateAsteroidRing(objList, 450);
		
		SolarSystemPainter painter = new SolarSystemPainter(objList);        
		painter.paintSolarSystem();
	}
}



