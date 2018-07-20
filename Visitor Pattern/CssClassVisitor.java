/**
 * This is a class that implements the 'Visitor' interface meaning it must give a body to the
 * two methods found in 'Visitor'.
 * In the first method, it reads in an object of type HtmlElement and calls its setStartTag().
 * This then gets the startTag String and replaces ">" with "class='visitor'>".
 * 
 * In the second method, it reads in an object of type HtmlParentElement and calls it setStartTag().
 * This then gets the startTag() and replaces ">" with "class='visitor'>".
 * 
 */

public class CssClassVisitor implements Visitor{

	@Override
	public void visit(HtmlElement element) {
		element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
		
	}

	@Override
	public void visit(HtmlParentElement parentElement) {
		parentElement.setStartTag(parentElement.getStartTag().replace(">", " class='visitor'>"));
	}

}
