
public class Moon extends SolarObjects{	
	public Moon(double distance, double diameter, double velocity, String color) {
		super(distance, diameter, velocity, color);
	}
	
	@Override
	public void updatePos() {
		angle += velocity * 2;
	}
}