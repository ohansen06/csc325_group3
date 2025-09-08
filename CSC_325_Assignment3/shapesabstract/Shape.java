package CSC_325_Assignment3.shapesabstract;

abstract class Shape
{
    //private properties of shapes
    private String name;
    private String color;
    //constructor for shape objects, both circles and rectangles
    public Shape(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    //returns color property of shape
    public String getColor()
    {
        return color;
    }
    //returns name property of shape
    public String getName()
    {
        return name;
    }
    //modifies color property of shape
    public void setColor(String color)
    {
        this.color = color;
    }
    //modfies name property of shape
    public void setName(String name)
    {
        this.name = name;
    }
    //abstract methods
    abstract void getArea();
    abstract void draw();
}
