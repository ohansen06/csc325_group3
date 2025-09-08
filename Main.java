
public class Main {
    public static void main(String[] args) {
        Circle dish = new Circle("Red", "Plate");
        Rectangle Box = new Rectangle("Blue", "Cardboard Box");

        dish.draw();
        
        Box.draw();

        Circle2 ball = new Circle2("Green", "Soccer Ball");
        ball.draw();

        System.out.println("Is ball calculable? " + ball.isCalculable());
        System.out.println("Is ball drawable? " + ball.isDrawable());

        Rectangle2 board = new Rectangle2("White", "Whiteboard");
        board.draw();   
        System.out.println("Is board calculable? " + board.isCalculable());
        System.out.println("Is board drawable? " + board.isDrawable());
    }
}