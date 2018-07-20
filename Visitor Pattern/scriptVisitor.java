/**
 * This is a class that implements the 'Visitor' interface meaning it must give a body to the
 * two methods found in 'Visitor'.
 * When the visit() methods are called, the HtmlElement one updates the local variables accordingly.
 * The HtmlParentElement creates a new HtmlElement object, sets the variables of these object and adds it to the
 * private List on the parentElement read in.
 * 
 */
public class scriptVisitor implements Visitor
{
    @Override
	public void visit(HtmlElement element) {
		element.setStartTag("<Script>");
		element.setTagBody("alert( Hello Visitor Pattern );");
		element.setEndTag("</Script>");
		
	}

	@Override
	public void visit(HtmlParentElement parentElement) {
		HtmlElement script = new HtmlElement("Script");
		script.setStartTag("<Script>");
		script.setTagBody("alert( Hello Visitor Pattern! );");
		script.setEndTag("</Script>");
		parentElement.addChildTag(script);
	}
}
