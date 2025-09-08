package CSC_325_Assignment3.shapesinterfaces;

public class TriangleI
{
    //properties for TriangleI obj.
    private String color;
    private String name;
    //constructor for TriangleI obj.
    public TriangleI(String color, String name)
    {
        this.color = color;
        this.name = name;
    }
    //returns color property of triangleI obj.
    public String getColor()
    {
        return color;
    }
    //returns name property of triangleI obj.
    public String getName()
    {
        return name;
    }
    //draws triangle
    public void draw()
    {
        System.out.println("^");
    }
    //prints formula of a triangle
    public void getArea()
    {
        System.out.println("1/2 * b * h");
    }
    //demonstrates methods, creates a triangleI obj.
    public static void main(String[] args)
    {
        TriangleI triangle = new TriangleI("Yellow", "Triangle");
        System.out.println("Name: " + triangle.getName() + ", Color: " + triangle.getColor());
        triangle.draw();
        triangle.getArea();
    }
}
