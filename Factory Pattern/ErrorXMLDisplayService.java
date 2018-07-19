/**
 * This class extends the abstract class DisplayService. It gives a body to the abstract method getParser()
 * which returns a new object of type ErrorXMLParser.
 * 
 */

public class ErrorXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }

}