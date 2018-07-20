/**
 * This class contains the main method.
 * 
 */

public class TestVisitorPattern {
    
    public static void main(String[] args) {
        
        System.out.println("Before visitor......... \n");
        
        /*
         * An object is created of type HtmlTag and reference HtmlParentElement. "<html>" is passed
         * to its constructor where it is set to the local tagName variable.
         * Next, the setStartTag() and setEndTag() methods are called passing variables. These methods
         * set passed text to local variables.
         */
        
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        
        /*
         * A second object is created and the same methods are called but different text is sent as
         * parameters.
         */
        
        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        
        /*
         * The second object is added to the first object's local List.
         */
        
        parentTag.addChildTag(p1);
        
        /*
         * A object of type HtmlTag and reference HtmlElement is created that passes "<p>" to its constructor
         * where it is set to a local variable.
         * Setter methods are then called to populate other local variables in HtmlElement.
         * Finally, the object is saved as an element to the local list in the p1 object like the object before it.
         */
        
        HtmlTag child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);
        
        /*
         * This is then repeated with new data into the existing object memory and saved as a new element
         * to the local list in the first object.
         */
        
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);
        
        /*
         * This method call prints the contents of the local List in the first object.
         */
        
        parentTag.generateHtml();
        
        System.out.println("\nAfter visitor....... \n");
        
        /*
         * Two objects are created both of type Visitor (which is an interface) but one references CssClassVisitor
         * and the other references StyleVisitor.
         * 
         */
        
        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();
        
        Visitor ScriptVisitor = new scriptVisitor();
        
        /*
         * A new HtmlParentElement object is created that overrides the original.
         * It also has new StartTag and EndTag local variables. 
         * The accept() method is called which passes the 'style' object. There it is read in as a Visitor
         * object and its visit() method is called passing 'parentTag' object as a parameter. This then goes
         * to the visit() method in 'StyleVisitor' to the one that reads in an object of type 'HtmlParentElement'.
         * There is finds ">" in the object's start tag and replaces it with " style='width:46px;'>".
         * The same process is then repeated with the 'cssClass' object being passed to the accept() method.
         * However, it goes to the CssClassVisitor class and into its visit() method that
         * reads in a 'HtmlParentElement' object.
         * 
         */
        
        parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        parentTag.accept(style);
        parentTag.accept(cssClass);
        //added by me
		parentTag.accept(ScriptVisitor);
        
        /*
         * This is the same proceedure as the above code to update the 'p1' object. Once updated it is added to the
         * private List in the 'parentTag' object
         */
        
        p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        p1.accept(style);
        p1.accept(cssClass);
        p1.accept(ScriptVisitor);
        
        parentTag.addChildTag(p1);
        
        /*
         * The following repeats the steps above to update the objects before being added to the parentTag's
         * private List variable.
         * 
         */
        
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        child1.accept(style);
        child1.accept(cssClass);
        child1.accept(ScriptVisitor);
        
        p1.addChildTag(child1);
        
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        child1.accept(style);
        child1.accept(cssClass);
        child1.accept(ScriptVisitor);
        
        p1.addChildTag(child1);
        
        /*
         * The contents of the list are then printed to the screen.
         */
        
        parentTag.generateHtml();
    }

}
