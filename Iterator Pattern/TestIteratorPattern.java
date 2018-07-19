/**
 * This is the main method. We have an object created of type ShapeStorage. This contains the
 * object array from which we want its contents.
 * Each element/object is then populated with a String and a digit, aka pos is incremented.
 * 
 * A 'ShapeIterator' object is created and our 'Shape' object is passed into it. Remember,
 * ShapeIterator contains our ability to traverse through the array objects.
 * 
 * We call the 'hasNext()' method associated with 'ShapeIterator' and with each iteration,
 * we print the contents of it.
 * 
 * We then create a new 'ShapeIterator' object that replaces the old one. Again, we loop
 * through each element but we print the current one and delete the next one, causing a
 * 0, 2, 4 effect before the loop ends.
 * 
 */
public class TestIteratorPattern {

    public static void main(String[] args) {
        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Circle");
        storage.addShape("Rectangle");
        storage.addShape("Square");
        
        ShapeIterator iterator = new ShapeIterator(storage.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //To check if array object contains a Circle object
        boolean contains = iterator.contains("Circle");
        System.out.println("The array object contains a Circle: " + contains);
        
        System.out.println("The array backwards is: ");
        //This moves through the array backwards
        while(iterator.hasPrev()){
                System.out.println(iterator.prev());
        }
        
        System.out.println("Apply removing while iterating...");
        iterator = new ShapeIterator(storage.getShapes());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}