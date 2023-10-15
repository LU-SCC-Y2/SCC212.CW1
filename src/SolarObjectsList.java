import java.util.ArrayList;

public class SolarObjectsList {
	private ArrayList <SolarObjects> solarObjectsList;
	
	
	public SolarObjectsList() {
		solarObjectsList = new ArrayList <SolarObjects>();
	}

	
	public ArrayList<SolarObjects> getSolarObjectsList() {
		return solarObjectsList;
	}
	
	public void addSolarObjects(SolarObjects s) {
		solarObjectsList.add(s);
	}
	
    public void addSolarObjects(SolarObjects... objs) {
        for (SolarObjects s : objs) {
            solarObjectsList.add(s);
        }
    }
    	
}
