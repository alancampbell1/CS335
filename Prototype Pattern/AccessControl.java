/**
 * This class implements the Prototype interface which means it must override the clone()
 * method which it does. 
 * This method returns an object after it was downcasted to an AccessControl type.
 * 
 * There are two private String variables and these are assigned values through the 
 * constructor's parameters.
 * 
 * There is a setAccess() method that reads in a String and sets it to the private String
 * variable access.
 * There is a getControlLevel() and a getAccess() methods which return the String values
 * to where they were called.
 * 
 */

public class AccessControl implements Prototype{
	
	private final String controlLevel;
	private String access;
	
	public AccessControl(String controlLevel,String access){
		this.controlLevel = controlLevel;
		this.access = access;
	}
	
	@Override
	public AccessControl clone(){
		try {
			return (AccessControl) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getControlLevel(){
		return controlLevel;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}
	
}