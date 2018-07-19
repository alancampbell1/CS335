import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the main method. 
 * It first creates an object of type 'DisplayService' (the abstract class) of reference 'FeedbackXMLDisplayService()'.
 * It then calls the 'display()' method of this object which comes from the abstract class 'DisplayService'.
 * In 'display()', it calls 'getParser()' in the class 'FeedbackXMLDisplayService' which returns a 'FeedbackXML'
 * object as an XMLParser object in 'display()'.
 * It can do this because 'FeedbackXML' is a sub-class of interface 'XMLParser'.
 * The 'parse()' method of the XMLParser object is called which goes to the parse() method in 'FeedbackXML'
 * Here, it prints 'Parsing feedback XML...' and returns a separate piece of text into String msg in 'display()'.
 * This is then printed to the screen, 'Feedback XML Message'.
 * 
 * This is then repeated but it goes to the 'ErrorXMLDisplayService' class on 'getParser()' and returns an
 * object of type 'ErrorXMLParser' instead. Printing different text.
 * 
 * This is then repeated but it goes to the 'OrderXMLDisplayService' class on 'getParser()' and returns an
 * object of type 'OrderXMLParser' instead. Printing different text.
 * 
 * This is then repeated but it goes to the 'ResponseXMLDisplayService' class on 'getParser()' and returns an
 * object of type 'ResponseXMLParser' instead. Printing different text.
 * 
 */

public class TestFactoryMethodPattern {

    public static void main(String[] args) {
        //Using ArrayList as alternative to print values in quick succession.
        List<DisplayService> services = new ArrayList<DisplayService>();
        
        DisplayService service = new FeedbackXMLDisplayService();
        //service.display();
        services.add(service);
        
        
        service = new ErrorXMLDisplayService();
        //service.display();
        services.add(service);
        
        service = new OrderXMLDisplayService();
        //service.display();
        services.add(service);
        
        service = new ResponseXMLDisplayService();
        //service.display();
        services.add(service);
        
        service = new ImageXMLDisplayService();
        //service.display();
        services.add(service);
        
        for(DisplayService s: services){
            s.display();
            System.out.println(id());
        }
        
    }
    
    public static String id(){
        UUID one = UUID.randomUUID();
        String id = "" + one;
        return id;
    }
}
