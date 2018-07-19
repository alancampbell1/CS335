/**
 * This class creates a specifc Pizza instead of doing it in the main method. It saves time calling each
 * individual topping class to create a specific pizza. 
 * You make one call and get one pizza back with a set number of toppings.
 * 
 * A private Pizza object is created.
 * A constructor is created which calls the buildPizza() method, saves making the call after the object
 * is created in the main method.
 * 
 * The buildPizza() method creates a specific Pizza.
 * 
 * This specific pizza is then returned to the main method through the getPizza() method. A method
 * which came from the abstract superclass.
 * 
 */

public class NapoliPizza extends MealDeals {
	private Pizza pizza;
	
	public NapoliPizza(){
		buildPizza();
	}
	
	private void buildPizza(){
		pizza = new SimplyVegPizza();
		pizza = new FetaCheese(pizza);
		pizza = new Spinach(pizza);
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
	}
	
	@Override
	public Pizza getPizza(){return pizza;};
}