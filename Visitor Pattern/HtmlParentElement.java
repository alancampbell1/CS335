/**
 * This is a class that extends 'HtmlTag' so it must give a body to the abstract classes
 * in 'HtmlTag' and the method in the interface 'Element'.
 * 
 * It also has a number of private variables that get instantiated when the constructor
 * is called when an object of the class is created.
 * 
 * The majority of the methods here are getter/setter methods for the private variables.
 * There is also methods to add, remove and get the elements in the private list array.
 * 
 * The method accept() reads in an object of type visitor. It calls its visit() method
 * and passes the current object to this method.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

	private String tagName;
	private String startTag; 
	private String endTag;
	private List<HtmlTag>childrenTag;
	
	public HtmlParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
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
	public void addChildTag(HtmlTag htmlTag){
		childrenTag.add(htmlTag);
	}
	
	@Override
	public void removeChildTag(HtmlTag htmlTag){
		childrenTag.remove(htmlTag);
	}
	
	@Override
	public List<HtmlTag>getChildren(){
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
