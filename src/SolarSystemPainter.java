/**
 * This class is used to paint and display the solar system model to the user
 * @author JIAJUNKK on 13/10/2023
 */
public class SolarSystemPainter extends SolarObjectsList{
	private AdjustableSolarSystem solarSystem;
	private SolarObjectsList SolarObjectList;
	
	
	public SolarSystemPainter(SolarObjectsList SolarObjectsList) {
		solarSystem = new AdjustableSolarSystem(1400, 900);
	    
		this.SolarObjectList = SolarObjectsList;		
	}
		
	
	public void paintSolarSystem() {
        while (true) {
            for (SolarObjects s : SolarObjectList.getSolarObjectsList()){
            	drawSolarObjs(s);
            }
            solarSystem.finishedDrawing();
        }
    }
	
	/**
	 * This method is used to draw out all of the SolarObjects that is in the list of SolarObjects.<br>
	 * Then if the SolarObject s is a Planet, it draws out the associated moons in the moon list.
	 * @param s
	 * 
	 * where s is the solarObjects, which has subclasses of Sun, Planet and Moon.<br>
	 */
	private void drawSolarObjs(SolarObjects s) {
		solarSystem.drawSolarObject(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColor());
        s.updatePos();
	    if (s instanceof Planet) {    
	    	drawMoons((Planet)s);
	    	
	    	if (s.getName().equals("SATURN")){
	    		drawRing((Planet)s);
	    	}
	    }
	}
	
	
	/**
	 * This method is used to draw out the moons that are associated to the planets. This drawMoons method takes in the 
	 * Planet as a parameter, then it loops through the moonList of the planet to draw every single moon in the list. 
	 * See SolarSystem class for more info for .drawSolarObjectAbout() method. 
	 * @param p
	 */
	private void drawMoons(Planet p) {
        for (Moon m : ((Planet) p).getMoonList()) {
			solarSystem.drawSolarObjectAbout(
					m.getDistance(), m.getAngle(), m.getDiameter(), m.getColor(), 
					p.getDistance(), p.getAngle()
			);
			m.updatePos();
        }
	}
	
	/**
	 * This method is used to draw out the ring of the planet, which is kind of similar to drawing the moon around the planet.
	 * But adding another method to this is to ensure the extensibility of this program as in the future, ring can be added to 
	 * uranus by simply calling this method. 
	 * @param p
	 */
	private void drawRing(Planet p) {
		for (PlanetRing pr : ((Planet) p).getRingList()) {
			solarSystem.drawSolarObjectAbout(
					pr.getDistance(), pr.getAngle(), pr.getDiameter(),
					pr.getColor(), p.getDistance(), p.getAngle()-0.5
			);
			pr.updatePos();
		}
	}
}

