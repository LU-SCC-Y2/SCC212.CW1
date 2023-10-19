/**
 * This class is a child class from the SolarObjects class, but the method from the super class is being 
 * overridden, as the moon is supposed to change it's velocity more frequent than the planet
 * @author JIAJUNKK on 19/10/2023
 */
public class Moon extends SolarObjects{	
	public Moon(double distance, double diameter, double velocity, String color) {
		super(distance, diameter, velocity, color);
	}
	
	@Override
	public void updatePos() {
		angle += velocity * 2;
	}
}