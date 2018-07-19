/**
 * - The CarDirector object, creates an object of type CarBuilder, which is an interface.
 * - It has a constructor that reads in an object of CarBuilder and assigns it to the private local one.
 * - Finally, it has a build() method which calls each method associated with the interface.
 * 
 */
public class CarDirector {
	
	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}

	public void build(){
		carBuilder.buildBodyStyle();
		carBuilder.buildPower();
		carBuilder.buildEngine();
		carBuilder.buildBreaks();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
	}
}