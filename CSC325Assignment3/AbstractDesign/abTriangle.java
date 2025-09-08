package CSC325Assignment3.AbstractDesign;

/** Triangle class that extends the Shape class */
public class abTriangle extends Shape {
private final double base;
private final double height;

/**
 * Constructor that initializes base and height
 */
public abTriangle(double base, double height){
    this.base = base;
    this.height = height;
}
/** Constructor that initializes base, height, name, and color */ 
public abTriangle(double base, double height, String name, String color){
    this.base = base;
    this.height = height;
    this.name = name;
    this.color = color;
}
/**Method to calculate the area of a triangle
 * @return double
*/
@Override
public double getArea(){
return 0.5 * base * height;
}

/** Method to draw a Triangle */
@Override
public void draw(){
    System.out.println("Drawing a " + color + " Triangle.");
}
}