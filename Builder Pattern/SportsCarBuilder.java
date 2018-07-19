/**
 * Same as SedanCarBuilder but with information in String's changed.
 * 
 */
public class SportsCarBuilder implements CarBuilder
{
    private final Car car = new Car("Sports Car");
    
    @Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 300, " +
				"overall width (inches): 100, overall height (inches): 75, wheelbase (inches): 120," +
				" front track (inches): 80, rear track (inches): 80 and curb to curb turning circle (feet): 50");
	}
	
	@Override
	public void buildPower(){
		car.setPower("500 hp @ 6,500 rpm; 400 ft lb of torque @ 8,000 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("7L Duramax V 8 DOHC");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	@Override
	public void buildSeats() {
		car.setSeats("Front seat center armrest.Rear seat center armrest.Split-folding rear seats");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminated side windows.Fixed rear window with defroster");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 20 MPG city, 35 MPG highway, 30 MPG combined and 500 mi. range");
		
	}
	
	@Override
	public Car getCar(){
		return car;
	}
}