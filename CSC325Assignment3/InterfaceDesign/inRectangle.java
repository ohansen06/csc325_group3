package CSC325Assignment3.InterfaceDesign;


/** Rectangle class that implements the Calculable and Drawable interfaces*/
public class inRectangle implements Calculable, Drawable {
private final double length;
private final double width;
private final String name;
private final String color;

/** Constructor that initializes length, width, name, color */ 
public inRectangle(double length, double width, String name, String color){
    this.length = length;
    this.width = width;
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

/** Method the calculates the area of a rectangle
 * @return double
 */
@Override
public double getArea(){
return length * width;
}

/**Draw method to draw rectangle
 */
@Override
public void draw(){
System.out.println("Drawing a " + color + " rectangle :DDD.");

}


}
