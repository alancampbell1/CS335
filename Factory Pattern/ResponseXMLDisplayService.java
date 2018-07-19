/**
 * This class extends the DisplayService Abstract class. It gives a body to the getParser() abstract method.
 * The method returns a new object of type ResponseXMLParser();
 * 
 */
public class ResponseXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }

}