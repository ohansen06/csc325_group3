package CSC_325_Assignment3.shapesinterfaces;

public class CircleI implements Describable, Drawable, Calculable
{
    //properties for CircleI obj.
    private String color;
    private String name;
    //constructor for CircleI obj.
    public CircleI(String color, String name)
    {
        this.color = color;
        this.name = name;
    }
    //returns color property of circleI obj.
    public String getColor()
    {
        return color;
    }
    //returns name property of circleI obj.
    public String getName()
    {
        return name;
    }
    //draws rectangle
    public void draw()
    {
        System.out.println("o");
    }
    //prints formula of a circle
    public void getArea()
    {
        System.out.println("PI * r^2");
    }
    //demonstrates methods, creates a circleI obj.
    public static void main(String[] args)
    {
        CircleI circle = new CircleI("Yellow", "Circle");
        System.out.println("Name: " + circle.getName() + ", Color: " + circle.getColor());
        circle.draw();
        circle.getArea();
    }
}

