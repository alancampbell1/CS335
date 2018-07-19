/**
 * This class implements the interface XMLParser. It also gives a body to parse() method within it
 * by printing a statement and returning a piece of text as a String.
 * 
 */

public class FeedbackXML implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }

}
