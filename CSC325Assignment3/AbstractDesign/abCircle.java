package CSC325Assignment3.AbstractDesign;

/** Circle class that extends the Shape class */
public class abCircle extends Shape  {
private final double radius;

/**Constructor that intializes radius
 */
public abCircle(double radius){
    this.radius = radius;
}

/**Overload Constructor to initializes radius, name, and color
 */
public abCircle(double radius, String name, String color){
    this.radius = radius;
    this.name = name;
    this.color = color;
}

/** Method to calculate the area of the circle
 * @return double
 */
@Override
public double getArea(){
return radius*radius*Math.PI;
}

/**Method to draw circle
*/
@Override
public void draw(){
System.out.println("Drawing a " + color + " circle :3.");
}
}
