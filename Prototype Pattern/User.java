/**
 * This class contains 3 private variables, two Strings and an AccessControl object.
 * The constructor sets these variables some values when instantiated.
 * 
 * There is then a series of getter and setter methods for each of the private variables
 * to override them again. 
 * 
 * Finally, there is a toString() method which when called prints the contents of the
 * variables.
 * 
 */

public class User {
	
	private String userName;
	private String level;
	private AccessControl accessControl;

	public User(String userName,String level, AccessControl accessControl){
		this.userName = userName;
		this.level = level;
		this.accessControl = accessControl;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public AccessControl getAccessControl() {
		return accessControl;
	}
	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}
	
	@Override
	public String toString(){
		return "Name: "+userName+", Level: "+level+", Access Control Level:"+accessControl.getControlLevel()+", Access: "+accessControl.getAccess();
	}
	
}
