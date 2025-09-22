package csc325assignment5;

import javafx.scene.canvas.GraphicsContext;
/**
 * Rectangle class that implements DrawableShape interface
 */
public class Rectangle implements DrawableShape {
    private final double x;
    private final double y;
    private final double width = 100;
    private final double height = 50;

    /**Constructor Method for the Rectangle class
     * @param x coordinate
     * @param y coordinate
     */
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

     /** Method that draws a rectangleonto the canvas
     * @param gc
     */
    @Override
    public void draw(GraphicsContext gc) {
        //x y set up to draw rectangle from the middle
        gc.strokeRect(x - (width/2), y - (height/2), width, height);
    }

}
