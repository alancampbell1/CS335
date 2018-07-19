/**
 * This class implements the interface XMLParser. It also gives a body to parse() method within it
 * by printing a statement and returning a piece of text as a String.
 * 
 */
public class ResponseXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }

}