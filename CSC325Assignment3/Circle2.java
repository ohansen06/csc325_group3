public class Circle2 implements Calculable, Drawable{
    private String color;
    private String name;
    public Circle2(String color, String name) {
        this.color = color;
        this.name = name;
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
    @Override
    public boolean isCalculable() {
        return true;
    }
    @Override
    public boolean isDrawable() {
        return true;
    }
}
