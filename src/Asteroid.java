import java.util.Random;
/**
 * This class is one of the sub classes of SolarObjects, which is used to create the asteroids. 
 * @author JIAJUNKK on 14/10/2023
 */
public class Asteroid extends SolarObjects{
	private Random random;
	private double asteroidDistance;
	private double asteroidDiameter;
	private double asteroidVelocity;
	
	public Asteroid(double distance, double diameter, double velocity, String color) {
		super(distance, diameter, velocity, color);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method below is used to calculate/generate the distance between each of the asteroids, to create some sort of gap. 
	 * It utilizes the Random class to generate random spacing between the asteroids, so that the asteroid belt doesn't 
	 * look like a solid circle. 
	 * @return the distance between each asteroids
	 */
	public double calcSpacing() {
		random = new Random();
		asteroidDistance = 200 + (random.nextDouble() * (220 - 200));
		return asteroidDistance;
	}
	
	/**
	 * This method is used to calculate/generate the random size of asteroids, to create a more realistic asteroid belt. It utilizes 
	 * the Random class to generate random sizes as well. 
	 * @return the diameter of the asteroid. 
	 */
	public double calcDiameter() {
		random = new Random();
        asteroidDiameter = 4 + (random.nextDouble() * (5 - 4)); 
        return asteroidDiameter;
	}
	
	/**
	 * This method is used to calculate/generate random velocity of asteroids, as some of them move faster than the others. It utilizes 
	 * the Random class to generate random velocity as well. 
	 * @return the velocity of the asteroid. 
	 */
	public double calcVelocity() {
		random = new Random();
        asteroidVelocity = 1.4 + (random.nextDouble() * (5 - 1.4)); 
        return asteroidVelocity;
	}
}
