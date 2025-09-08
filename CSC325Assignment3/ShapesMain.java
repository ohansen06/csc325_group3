package CSC325Assignment3;
import CSC325Assignment3.AbstractDesign.*;
import CSC325Assignment3.InterfaceDesign.*;


public class ShapesMain {
    public static void main(String[] args) {
       

       //abstract design
        Shape[] shapes1 = {
            new abCircle(5.0, "jimmy", "Pink" ),
            new abRectangle(6.0,7.0, "chuck", "Chartreuse"),
            new abTriangle(8.0,9.0,"bud", "Lime")
        };
        
        for(Shape s: shapes1){
            System.out.println("Area of shape: " + s.getArea());
           System.out.println("Name of shape: " + s.getName());
            System.out.println("Color of shape: " + s.getColor());
           s.draw();
        }

        //interface design 
        Calculable[] shapes2 = {
            new inCircle(5, "c1", "Red"),
            new inRectangle(6,7, "r1", "Blue"),
            new inTriangle(8,9, "t1", "orple")
        };

        for(Calculable c: shapes2){
            System.out.println("Area of shape: " + c.getArea()); 
            if(c instanceof inCircle circle){
                System.out.println("Name of shape: " + circle.getName());
            }
            else if(c instanceof inRectangle rectangle){
                System.out.println("Name of shape: " + rectangle.getName());
            }
            else if(c instanceof inTriangle triangle){
                System.out.println("Name of shape: " + triangle.getName());
               
            }
            if(c instanceof inCircle circle){
                System.out.println("Color of shape: " + circle.getColor());
            }
            else if(c instanceof inRectangle rectangle){
                System.out.println("Color of shape: " + rectangle.getColor());
            }
            else if(c instanceof inTriangle triangle){
                System.out.println("Color of shape: " + triangle.getColor());
               
            }
            if (c instanceof Drawable d){
                d.draw();
            }
       
        }

    }
}
