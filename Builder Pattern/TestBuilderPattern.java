/**
 * This is the main method.
 * A 'CarBuilder' object of type 'SedanCarBuilder' is created.
 * This causes a private 'Car' object to be created in 'SedanCarBuilder'.
 * Next a 'CarDirector' object is created and the 'CarBuilder' object is passed as a parameter.
 * In 'CarDirector', 'CarBuilder' is assigned to a local 'CarBuilder'.
 * The CarDirector's build method is called which calls all build methods in 'SedanCarBuilder' which calls
 * all setter methods associated with the 'Car' object.
 * The getCar method is called which returns the local 'Car' object in 'SedanCarBuilder' in a 'Car' object
 * in the main method.
 * 'Car' is printed which calls the toString() method, printing data associated with the Car object.
 */

public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		
		CarBuilder newCarBuilder = new SportsCarBuilder();
		CarDirector newDirector = new CarDirector(newCarBuilder);
		newDirector.build();
		car = newCarBuilder.getCar();
		System.out.println(car);
	}
}