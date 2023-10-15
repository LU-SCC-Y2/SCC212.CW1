public class SolarObjects {
	private String name;
	private double distance;
	private double angle;
	private double diameter;
	private double velocity; 
	private String color;
	
	

	public SolarObjects(double distance, double diameter, double velocity, String color) {
		this.distance = distance;
		this.diameter = diameter;
		this.velocity = velocity;
		this.color = color;
	}
	public SolarObjects(String name, double distance, double diameter, double velocity, String color) {
		this.name = name;
		this.distance = distance;
		this.diameter = diameter;
		this.velocity = velocity;
		this.color = color;
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
