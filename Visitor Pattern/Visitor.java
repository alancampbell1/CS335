/**
 * This is an interface with two methods entitled visit. They are overloaded, meaning they
 * have the same name, return type but accept different objects as parameters.
 * They both must be given a body when the interface is implemented by a class.
 * 
 */

public interface Visitor {
	public void visit(HtmlElement element);
	public void visit(HtmlParentElement parentElement);
}
