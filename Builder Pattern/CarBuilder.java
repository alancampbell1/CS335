/**
 * CarBuilder is an interface. It has a number of methods with no body that must be instantiated when
 * implemented else where.
 * 
 * 
 */
public interface CarBuilder {
	
	public void buildBodyStyle();
	public void buildPower();
	public void buildEngine();
	public void buildBreaks();
	public void buildSeats();
	public void buildWindows();
	public void buildFuelType();
	public Car getCar();
}
