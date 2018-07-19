/**
 * This class extends the DisplayService Abstract class. It gives a body to the getParser() abstract method.
 * The method returns a new object of type FeedbackXML();
 */
public class FeedbackXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new FeedbackXML();
    }

}