public abstract class Shape {
    private String color;
    private String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }


    public abstract double getArea();
    public abstract void draw();
}

