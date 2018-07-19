import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * This is the main method. 
 * DecimalFormat is a concrete subclass of NumberFormat that formats decimal numbers
 * 
 */

public class TestDecoratorPattern {
    
    public static void main(String[] args) {
        
        //Object created of type DecimalFormat (imported above)
        DecimalFormat dformat = new DecimalFormat("#.##");
        
        //Pizza object of type reference SimpleVegPizza
        Pizza pizza = new SimplyVegPizza();
        
        /*
         * A SimplyVegPizza is passed into RomaTomatoes. A local Pizza object is set to SimplyVegPizza.
         * A SimplyVegPizza is passed into GreenOlives. A local Pizza object is set to SimplyVegPizza.
         * A SimplyVegPizza is passed into Spinach. A local Pizza object is set to SimplyVegPizza.
         */
        pizza = new RomaTomatoes(pizza);
        pizza = new GreenOlives(pizza);
        pizza = new Spinach(pizza);
        
        /*
         * When pizza.getDesc() is called, it calls the getDesc() method in the SimplyVegPizza, then
         * in the classes, RomaTomatoes, GreenOlives and Spinach. Failure to include return pizza.getDesc()
         * in the return statements of each of the three classes results in SimplyVegPizza not being printed
         * or included.
         */
        
        System.out.println("Desc: "+pizza.getDesc());
        
        //We use dformat to add all the returned pizza prices and this is printed to the screen
        System.out.println("Price: "+dformat.format(pizza.getPrice()));
        
        //Same process but for different toppings. Small objects are created.
        pizza = new SimplyNonVegPizza();
        
        pizza = new Meat(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);
        
        System.out.println("Desc: "+pizza.getDesc());
        System.out.println("Price: "+dformat.format(pizza.getPrice()));
        
        System.out.println("#####################");
        
        System.out.println("***Meal Deals***");
        MealDeals mealDeal1 = new TexasGrillPizza();
        MealDeals mealDeal2 = new VegetarianDelight();
        MealDeals mealDeal3 = new NapoliPizza();
        
        System.out.println("Texas Grill Pizza Description: " + mealDeal1.getPizza().getDesc()); 
        System.out.println("Texas Grill Pizza Price: " + mealDeal1.getPizza().getPrice());
        
        System.out.println("Vegetarian Delight Pizza Description: " + mealDeal2.getPizza().getDesc());
        System.out.println("Vegetarian Delight Pizza Price: " + (mealDeal2.getPizza().getPrice()) * 0.8);   //20% off
        
        System.out.println("Napoli Pizza Description: " + mealDeal3.getPizza().getDesc());
        System.out.println("Napoli Pizza Pizza Price: " + (mealDeal3.getPizza().getPrice()) * 0.8);         //20% off       
    }

}