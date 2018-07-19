/**
 * This class is different to the others as it implements the interface Pizza directly. This means it
 * must supply a body for both the getDesc() and getPrice() methods.
 * 
 */

public class SimplyVegPizza implements Pizza{

    @Override
    public String getDesc() {
        return "SimplyVegPizza (230)";
    }
    
    @Override
    public double getPrice() {
        return 230;
    }
}