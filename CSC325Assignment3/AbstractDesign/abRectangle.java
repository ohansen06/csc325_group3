package CSC325Assignment3.AbstractDesign;


/** Rectangle class that extends the Shape class */
public class abRectangle extends Shape  {
private final double length;
private final double width;

/**Constructor for the Rectangle class that initializes length and width
 */
public abRectangle(double length, double width){
    this.length = length;
    this.width = width;
}
/**Constructor for the Rectangle class that initializes length, width, name, and color
 */
public abRectangle(double length, double width, String name, String color){
    this.length = length;
    this.width = width;
    this.name = name;
    this.color = color;
}


/** Area method to calculate area of a rectangle 
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
System.out.println("Drawing a " + color + " rectangle :D.");

}

}
