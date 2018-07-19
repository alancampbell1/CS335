/**
 * This class extends the abstract class PizzaDecorator(), which implements the Pizza interface.
 * It must supply a body for the interface's getPrice() method or an error will be thrown.
 * It does not need to supply a body for the getDesc() because the abstract class does so already.
 * However, it does give getDesc() a body which overrides the method body in the abstract class.
 * 
 * This class also creates a private Pizza object (remember: the decorator pattern means there are
 * plenty of small objects).
 * There is also a constructor that reads in an Pizza object and sets it to the local private Pizza
 * object.
 * 
 * What makes each class unique is the values their getDesc() and getPrice() methods are returning.
 * 
 */

public class Meat extends PizzaDecorator{

	private final Pizza pizza;
	
	public Meat(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Meat (14.25)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+14.25;
	}

}