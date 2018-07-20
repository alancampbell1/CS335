/**
 * This is an interface with a single method entitled 'clone()'.
 * This interface also extends the 'Cloneable' interface, available in Java.
 * This is one way to copy an object in order to create a new one. Java provides the
 * 'clone()' method which an object inherits from the Object class. The 'clone()' method
 * needs to be overriden according to the user's needs.
 * 
 */

public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
