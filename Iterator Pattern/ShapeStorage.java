/**
 * This is a ShapeStorage class. A private object array of type Shape is created with 5 elements.
 * There is also an index variable.
 * 
 * There is a addShape() method that reads in a String variable. Every time addShape is called,
 * local variable i is incremented, starting from zero. The Shape object in corresponding array
 * is given an id value of zero and up and name is assigned from formal parameter.
 * 
 * There is also a getShapes() method. This returns the entire object array of type Shape to where
 * it was called.
 * 
 */
public class ShapeStorage {
	
	private Shape []shapes = new Shape[5];
	private int index;
	
	public void addShape(String name){
		int i = index++;
		shapes[i] = new Shape(i,name);
	}
	
	public Shape[] getShapes(){
		return shapes;
	}
}