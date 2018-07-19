/**
 * - This is the car class. It has a number of private String variables detailing specific parts of the
 * car.
 * - Below is a parameterised constructor that reads in a variable and assigns it to the carType String.
 * - Below this is a series of getter and setter methods. Give users the ability to set the values
 * of the private variables and obtain their values through method calls.
 * - There is also a toString() method, that creates a StringBuilder object called 'sb'.
 * - A series of text is appended to it and then returned to where it was called.
 * 
 */
public class Car {
	
	private String bodyStyle;
	private String power;
	private String engine;
	private String breaks;
	private String seats;
	private String windows;
	private String fuelType;
	private String carType;
	
	public Car (String carType){
		this.carType = carType;
	}
	
	public String getBodyStyle() {
		return bodyStyle;
	}
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getBreaks() {
		return breaks;
	}
	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getWindows() {
		return windows;
	}
	public void setWindows(String windows) {
		this.windows = windows;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("--------------"+carType+"--------------------- \n");
		sb.append(" Body: ");
		sb.append(bodyStyle);
		sb.append("\n Power: ");
		sb.append(power);
		sb.append("\n Engine: ");
		sb.append(engine);
		sb.append("\n Breaks: ");
		sb.append(breaks);
		sb.append("\n Seats: ");
		sb.append(seats);
		sb.append("\n Windows: ");
		sb.append(windows);
		sb.append("\n Fuel Type: ");
		sb.append(fuelType);
		
		return sb.toString();
	}
}