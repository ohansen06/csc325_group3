public class Rectangle extends Shape{
    public Rectangle(String color, String name) {
        super(color, name);
    }
    @Override
    public double getArea() {
        return 0;
    }   
    @Override
    public void draw() {
        String title = this.getClass().getSimpleName();
        System.err.println("Drawing " + title);
    }
}
