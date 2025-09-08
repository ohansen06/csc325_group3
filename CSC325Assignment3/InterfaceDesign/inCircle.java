package CSC325Assignment3.InterfaceDesign;

/** Circle class that implements the Calculable and Drawable interfaces*/
public class inCircle implements Calculable, Drawable {
private final double radius;
private final String name;
private final String color;

/** Constructor that initializes radius, name, and color */ 
public inCircle(double radius, String name, String color){
    this.radius = radius;
    this.name = name;
    this.color = color;

}

/** Method that returns the color
 * @return String
 */
public String getColor(){
return color;
}

/** Method that returns the name
 * @return String
 */
public String getName(){
return name;
}

/** Method the calculates the area of a circle
 * @return double
 */
@Override
public double getArea(){
return radius*radius*Math.PI;
}

/**Method to draw the circle */
@Override
public void draw(){
  System.out.println("Drawing a " + color + " circle!!!!");
}
}
