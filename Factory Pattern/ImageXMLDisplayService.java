
/**
 * Write a description of class ImageXMLDisplayService here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImageXMLDisplayService extends DisplayService
{
    @Override
    public XMLParser getParser() {
        return new ImageXMLParser();
    }
}
