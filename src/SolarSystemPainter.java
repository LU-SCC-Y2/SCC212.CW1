/**
 * This class is used to paint and display the solar system model to the user
 * @author JIAJUNKK on 13/10/2023
 */
public class SolarSystemPainter extends SolarObjectsList{
	private SolarSystem solarSystem; 
	private SolarObjectsList SolarObjectList;
	
	
	public SolarSystemPainter(SolarObjectsList SolarObjectsList) {
		solarSystem = new SolarSystem(1000, 820);
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
}

