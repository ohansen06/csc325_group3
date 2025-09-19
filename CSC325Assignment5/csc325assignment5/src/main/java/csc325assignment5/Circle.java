package csc325assignment5;

import javafx.scene.canvas.GraphicsContext;
/**
 * Circle class that implements DrawableShape interface
 */
public class Circle implements DrawableShape {
    private final double x;
    private final double y;
    private final double radius = 50;
    
    /**Constructor Method for the Circle class
     * @param x coordinate
     * @param y coordinate
     */
    public Circle(double x, double y)
    {
        this.x = x;
        this.y = y;
       
    }
    /** Method that draws a circle onto the canvas
     * @param gc \
     */
    @Override
    public void draw(GraphicsContext gc) {
      //x and y set up to draw circle from the middle
      gc.strokeOval(x - radius, y - radius,radius*2,radius*2);
    }

    
    
}
