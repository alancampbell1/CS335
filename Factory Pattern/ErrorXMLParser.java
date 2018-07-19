/**
 * This method implements the interface XMLParser and gives its method a body, printing a statement
 * and returning a String.
 * 
 */

public class ErrorXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing error XML...");
        return "Error XML Message";
    }

}