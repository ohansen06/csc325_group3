package CSC_325_Assignment3.shapesabstract;
 
public class TriangleA extends Shape
{
    //constructor in super since both rectangle and circle
    //use the same properties
    //initializes all circleA objects with null properties
    public TriangleA()
    {
        super("null", "null");
    }
    //prints out the formula for triangle area
    @Override
    public void getArea()
    {
        System.out.println("1/2 * b * h");
    }
    //prints out a "drawing" of a triangle
    @Override
    public void draw()
    {
        System.out.println("^");
    }
    //demonstrates methods, creates and modifies a triangleA obj.
    public static void main(String[] args)
    {
        TriangleA triangle = new TriangleA();
        triangle.setColor("Yellow");
        triangle.setName("Triangle");
        System.out.println("Name: " + triangle.getName() + ", Color: " + triangle.getColor());
        triangle.draw();
        triangle.getArea();
    }
}
