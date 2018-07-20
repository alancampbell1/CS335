/**
 * This is a class that extends the abstract class HtmlTag. Because of this it must give a body to the abstract
 * methods found in HtmlTag. 
 * It has a number of local private variables that are set when the constructor is called when an object of the 
 * class is created.
 * The majority of classes here are getter/setter methods. 
 * The accept() method comes originally from the Element interface and it reads in a Visitor object and calls its
 * visit method, passing the current instance of the HtmlElement object.
 * 
 * 
 */

public class HtmlElement extends HtmlTag{

	private String tagName;
	private String startTag; 
	private String endTag;
	private String tagBody;
	
	public HtmlElement(String tagName){
		this.tagName = tagName;
		this.tagBody = "";
		this.startTag = "";
		this.endTag = "";
	}
	
	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	
	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	@Override
	public String getStartTag() {
		return startTag;
	}
	
	@Override
	public String getEndTag() {
		return endTag;
	}
	
	@Override
	public void setTagBody(String tagBody){
		this.tagBody = tagBody;
	}
	
	@Override
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}

