package CSC_325_Assignment3.shapesabstract;

public class RectangleA extends Shape
{
    //constructor in super since both rectangle and circle
    //use the same properties
    //initializes all rectangleA objects with null properties
    public RectangleA()
    {
        super("null", "null");
    }
    //prints out formula for area of a rectangle
    @Override
    public void getArea()
    {
        System.out.println("w * h");
    }
    //prints out a "drawing" of a rectangle
    @Override
    public void draw()
    {
        System.out.println("[]");
    }
    //demonstrates methods, creates and modifies a rectangleA obj.
     public static void main(String[] args)
    {
        RectangleA rectangle = new RectangleA();
        rectangle.setColor("Yellow");
        rectangle.setName("Rectangle");
        System.out.println("Name: " + rectangle.getName() + ", Color: " + rectangle.getColor());
        rectangle.draw();
        rectangle.getArea();
    }
}
