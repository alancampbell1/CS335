/**
 * This is a Shape object. It has two private variables that are set through the constructor.
 * It also has corresponding setter and getter methods to set and return the values of the
 * private variables.
 * There is also a toString method that returns the private variables as a String to print.
 * 
 */
public class Shape {

	private int id;
	private String name;
	
	public Shape(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "ID: "+id+" Shape: "+name;
	}	
}