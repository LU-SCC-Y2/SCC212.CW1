import java.util.ArrayList;
/**
 * This a class where it is used to store all the solarObjects. To ensure its extendible, this class can also be used as  
 * storing the lists of comets and asteroids. 
 * @author JIAJUNKK on 13/10/2023
 */
public class SolarObjectsList {
	private ArrayList <SolarObjects> solarObjectsList;
	
	
	public SolarObjectsList() {
		solarObjectsList = new ArrayList <SolarObjects>();
	}

	
	public ArrayList<SolarObjects> getSolarObjectsList() {
		return solarObjectsList;
	}
	

	
	/**
	 * This method can takes in multiple SolarObjects, for instance (earth, mars, .....). In this such way, 
	 * the code looks simpler and cleaner. 
	 * @param objs
	 */
    public void addSolarObjects(SolarObjects... objs) {
        for (SolarObjects s : objs) {
            solarObjectsList.add(s);
        }
    }
    	
}
