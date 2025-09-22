package CSC325Assignment5;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
public class DrawConroller {
	private Group root = new Group();
    private Canvas canvas = new Canvas(800, 600);
    private GraphicsContext gc = canvas.getGraphicsContext2D();
    private ObservableList<DrawableShape> shapes = FXCollections.observableArrayList();
    private RadioButton rectBtn;
    private RadioButton circBtn;
    private Button clearBtn;
    IntegerProperty count = new SimpleIntegerProperty(0);
    
    public DrawConroller() {
        layout();
        eventHandle();
    }
    private void layout() {
        root.getChildren().add(canvas);
        HBox hbox = new HBox(10);
      
        root.getChildren().add(hbox);

        ToggleGroup shapeToggleGroup = new ToggleGroup();
            rectBtn = new RadioButton("Draw Rectangle");
            rectBtn.setToggleGroup(shapeToggleGroup);
            circBtn = new RadioButton("Draw Circle");
            circBtn.setToggleGroup(shapeToggleGroup);
            clearBtn = new Button("Clear Canvas");
        hbox.getChildren().addAll(circBtn, rectBtn, clearBtn);
    }
    private void eventHandle() {
        canvas.setOnMouseClicked( e -> {
        double x = e.getX();
        double y = e.getY();
        DrawableShape shape;
        if (rectBtn.isSelected()) {
            shape = new Rectangle(x,y);
            shapes.add(shape);
            shape.draw(gc);
                
        }else if(circBtn.isSelected()) {
            shape = new Circle(x,y);
            shapes.add(shape);
            shape.draw(gc);
            
        }
        count.set(shapes.size());
        
        });
        clearBtn.setOnAction(e -> {
            shapes.clear();
            count.set(0);
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }


    