package CSC325Assignment5;
import javafx.scene.canvas.GraphicsContext;

public class Rectangle {
    private double x;
    private double y;   
    private double width;
    private double height;
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void draw(GraphicsContext gc) {
        gc.strokeRect(x, y, width, height);
    }
}
