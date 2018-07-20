/**
 * This is an abstract class that implements the interface Element. It does not need to
 * give a body to the Element's methods but any class that extends HtmlTag must.
 * 
 * It also has a mixture of abstract methods with no body and concrete methods with a
 * body.
 * 
 */

import java.util.List;

public abstract class HtmlTag implements Element{
	
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract String getStartTag();
	public abstract String getEndTag();
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void addChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void removeChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public List<HtmlTag>getChildren(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public abstract void generateHtml();

}