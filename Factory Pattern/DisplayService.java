/**
 * This is an abstract class with two methods: 
 * - display(): which has an object of type of XMLParser 
 *              A String which holds the return contents of parser.parse()
 *              A print statement
 * - getParser() which is an abstract method that returns an object of type XMLParser.
 * 
 */

public abstract class DisplayService {
    
    public void display(){
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }
    
    protected abstract XMLParser getParser();

}