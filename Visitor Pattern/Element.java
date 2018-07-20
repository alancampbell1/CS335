/**
 * This is an interface with a single method that must be given a body when implemented by a
 * concrete class. This method must accept an object of type Visitor.
 * 
 * 
 */
public interface Element {
	
	public void accept(Visitor visitor);
}

