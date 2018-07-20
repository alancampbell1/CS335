/**
 * This is a class that implements the 'Visitor' interface meaning it must give a body to the
 * two methods found in 'Visitor'.
 * In the first method, it reads in an object of type HtmlElement and calls its setStartTag().
 * This then gets the startTag String and replaces ">" with "style='width:46px;'>".
 * 
 * In the second method, it reads in an object of type HtmlParentElement and calls it setStartTag().
 * This then gets the startTag() and replaces ">" with "style='width:58px;'>'>".
 *
 */
public class StyleVisitor implements Visitor {

	@Override
	public void visit(HtmlElement element) {
		element.setStartTag(element.getStartTag().replace(">", " style='color:red;'>"));
		
	}

	@Override
	public void visit(HtmlParentElement parentElement) {
		parentElement.setStartTag(parentElement.getStartTag().replace(">", " style='color:red;'>"));
	}

}
