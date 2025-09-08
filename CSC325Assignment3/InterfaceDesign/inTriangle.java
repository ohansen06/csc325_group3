package CSC325Assignment3.InterfaceDesign;

/** Triangle class that implements the Calculable and Drawable interfaces*/
public class inTriangle implements Calculable, Drawable {
private final double base;
private final double height;
private final String color;
private final String name;


/** Constructor that initializes base, height, name, and color */ 
public inTriangle(double base, double height, String name, String color){
    this.base = base;
    this.height = height;
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

/** Method the calculates the area of a triangle
 * @return double
 */
@Override
public double getArea(){
return 0.5 * base * height;
}

/**Method to draw a triangle*/
@Override
public void draw(){
    System.out.println("Drawing a " + color + " triangle");
    
}
}
