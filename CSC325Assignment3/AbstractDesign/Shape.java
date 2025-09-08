package CSC325Assignment3.AbstractDesign;
import java.util.Scanner;


public abstract class Shape {
Scanner scn = new Scanner(System.in);
protected String name;
protected String color;

/** Concrete method that sets the name of the Shape */
public void setName(){
System.out.println("What will this shapes name be?");
String n = scn.nextLine();
name = n;
}

/** Concrete method that gets the name of the Shape
 * @return String
 */
public String getName(){
return name;
}

/** Concrete method that sets the color of the Shape */
public void setColor(){
System.out.println("What will this shapes color be?");
String c = scn.nextLine();
color = c;
}

/** Concrete method that gets the name of the Shape
 * @return String
 */
public String getColor(){
return color;
}

public abstract double getArea();
public abstract void draw();
}
