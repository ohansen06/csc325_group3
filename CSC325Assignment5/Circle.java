package CSC325Assignment5;

import javafx.scene.canvas.GraphicsContext;

public class Circle implements DrawableShape {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
    }
	
}
