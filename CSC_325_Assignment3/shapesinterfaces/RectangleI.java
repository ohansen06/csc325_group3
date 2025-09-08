package CSC_325_Assignment3.shapesinterfaces;

public class RectangleI implements Drawable, Calculable, Describable
{
    //properties for RectangleI obj.
    private String color;
    private String name;
    //constructor for RectangleI obj.
    public RectangleI(String color, String name)
    {
        this.color = color;
        this.name = name;
    }
    //returns color property of rectangleI obj.
    public String getColor()
    {
        return color;
    }
    //returns name property of rectangleI obj.
    public String getName()
    {
        return name;
    }
    //draws rectangle
    public void draw()
    {
        System.out.println("[]");
    }
    //prints formula of a rectangle
    public void getArea()
    {
        System.out.println("w * h");
    }
    //demonstrates methods, creates a rectangleI obj.
    public static void main(String[] args)
    {
        RectangleI rectangle = new RectangleI("Yellow", "Rectangle");
        System.out.println("Name: " + rectangle.getName() + ", Color: " + rectangle.getColor());
        rectangle.draw();
        rectangle.getArea();
    }
}

