/**
 * This is an abstract class that implements the Pizza interface. It gives a body to the
 * getDesc() method but not the getPrice().
 * 
 */

public abstract class PizzaDecorator implements Pizza {
    
    @Override
    public String getDesc() {
        return "Toppings";
    }

}