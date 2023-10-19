/**
 * This is the parent class for all SolarObjects, such as Sun, Planets, Moon and Asteroids.
 * @author JIAJUNKK
 */

public class SolarObjects {
	private String name;
	private double distance;
	protected double angle;
	private double diameter;
	protected double velocity; 
	private String color;
	
	/**
	 * 
	 * @param name the name of the planet, easier identification in the future if we need to specify what the planet needs to do in 
	 * and if else statement when looping through the SolarObjectsList. 
	 * @param distance the distance of the SolarObjects from the Sun
	 * @param diameter this determines how big the SolarObject is
	 * @param velocity this determines how fast it goes
	 * @param color this determines the color of the SolarObjects. 
	 */
	public SolarObjects(String name, double distance, double diameter, double velocity, String color) {
		this.name = name;
		this.distance = distance;
		this.diameter = diameter;
		this.velocity = velocity;
		this.color = color;
	}
	
	public SolarObjects(double distance, double diameter, double velocity, String color) {
		this.distance = distance;
		this.diameter = diameter;
		this.velocity = velocity;
		this.color = color;
	}
	
	
	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getDistance() {
		return distance;
	}

	public double getAngle() {
		return angle;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getVelocity() {
		return velocity;
	}

	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void updatePos() {
		angle += velocity;
		
	}
	
	

	
	
	
}
