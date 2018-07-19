/**
 * We have a class called 'ShapeIterator' that implements the Iterator interface on our
 * class 'Shape'. Remember, this interface allows us to traverse the Shape object,
 * our container.
 * 
 * It has a private Shape array object called 'shapes' and a variable called 'pos'.
 * It has a constructor that reads in a Shape array object and sets it to the private one
 * in the class.
 * 
 * Next we have a hasNext() method. The purpose is to see if we have reached the end of the
 * array. This is done by checking if the 'pos' is greater than the length of the array or
 * object at element 'pos' is null. True or false is returned.
 * 
 * The next method is called next(). It returns the current object in the array before
 * incrementing 'pos'.
 * 
 * The final method is remove(). It is designed to remove an object from the array. First,
 * it checks if 'pos' is a minus figure and if so it throws an error.
 * 
 */

public class ShapeIterator implements Iterator<Shape>{

    private Shape [] shapes;
    int pos;
    
    public ShapeIterator(Shape []shapes){
        this.shapes = shapes;
    }
    @Override
    public boolean hasNext() {
        if(pos >= shapes.length || shapes[pos] == null)
            return false;
        return true;
    }

    @Override
    public Shape next() {
        return shapes[pos++];
    }

    @Override
    public void remove() {
        if(pos <=0 )
            throw new IllegalStateException("Illegal position");
        if(shapes[pos-1] !=null){
            for (int i= pos-1; i<(shapes.length-1);i++){
                shapes[i] = shapes[i+1];
            }
            shapes[shapes.length-1] = null;
        }
    }
   
    //This method checks to see if array object contains a specific String
    public boolean contains(String shape){       
       for(int i = 0; i < shapes.length; i++){
           if(shape == shapes[i].getName()){
               return true;
           }
       }
       return false;
    }
    
    //This method iterates through a collection in reverse order.
    public Shape prev(){
        return shapes[--pos];
    }
    
    //When moving backwards, if pos hits -1, return false(escape the loop) or if the 
    //element is null.
    public boolean hasPrev(){
        System.out.println("The value of pos is " + pos);
        
        if(pos == 1)
            return false;
        return true;
    }
}