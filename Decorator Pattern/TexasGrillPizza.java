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
 * 
 */

public class TexasGrillPizza extends MealDeals {
private Pizza pizza;
	
	public TexasGrillPizza(){
		buildPizza();
	}
	
	private void buildPizza(){
		pizza = new SimplyNonVegPizza();
		pizza = new Meat(pizza);
		pizza = new Ham(pizza);
		pizza = new RomaTomatoes(pizza);
		pizza = new Mushrooms(pizza);
	}
	
	@Override
	public Pizza getPizza(){return pizza;};
}
