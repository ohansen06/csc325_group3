package CSC_325_Assignment3.shapesabstract;
 
public class CircleA extends Shape
{
    //constructor in super since both rectangle and circle
    //use the same properties
    //initializes all circleA objects with null properties
    public CircleA()
    {
        super("null", "null");
    }
    //prints out the formula for circle area
    @Override
    public void getArea()
    {
        System.out.println("PI * r^2");
    }
    //prints out a "drawing" of a circle
    @Override
    public void draw()
    {
        System.out.println("o");
    }
    //demonstrates methods, creates and modifies a CircleA obj.
    public static void main(String[] args)
    {
        CircleA circle = new CircleA();
        circle.setColor("Yellow");
        circle.setName("Circle");
        System.out.println("Name: " + circle.getName() + ", Color: " + circle.getColor());
        circle.draw();
        circle.getArea();
    }
}
