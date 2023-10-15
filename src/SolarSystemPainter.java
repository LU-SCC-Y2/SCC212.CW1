
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
	

	private void drawSolarObjs(SolarObjects s) {
		solarSystem.drawSolarObject(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColor());
        s.updatePos();
	    if (s instanceof Planet) {    
	    		drawMoons((Planet)s);
	        }
	    }
	
	
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

