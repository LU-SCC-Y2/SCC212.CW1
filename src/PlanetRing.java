/**
 * This class is the child class of the planet, because only planet has rings, but not all solar objects. <br> 
 * The ringNum can be set using the setter, so that in the future, I can make the ring looks thicker and more 
 * complete. 
 * @author JIAJUNKK on 19/10/2023
 */
public class PlanetRing extends Planet{
	private int ringNUm;
	
	
	public PlanetRing(String name, double distance, double diameter, double velocity, String color) {
		super(name, distance, diameter, velocity, color);
		// TODO Auto-generated constructor stub
	}

	public int getRingNUm() {
		return ringNUm;
	}

	public void setRingNUm(int ringNUm) {
		this.ringNUm = ringNUm;
	}
	
	
	/**
	 * This method overrides the method of the grand parent class, because the speed of the object in the ring 
	 * needs to be faster, so that it looks like a full circle. 
	 */
	@Override
	public void updatePos() {
		angle += velocity*4;
	}
	
	
	
	
	
	
	
}
