package csc325assignment5;
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

/**Controller class that allows the user to draw shapes to the screen 
 */
public class DrawController {

    private final Group root = new Group();
    private final Canvas canvas = new Canvas(600, 400);
    private final GraphicsContext gc = canvas.getGraphicsContext2D();
    private final ObservableList<DrawableShape> shapes = FXCollections.observableArrayList();
    private RadioButton rectBtn;
    private RadioButton circBtn;
    private Button clearBtn;
    IntegerProperty count = new SimpleIntegerProperty(0);

    /**
     * Constructor method that calls the layout() and eventHandling() methods
     */
    public DrawController() {
        layout();
        eventHandling();
    }

    /**
     * Method that returns the root that is created when a DrawController object is created
     */
    public Group getRoot() {
        return root;
            }

    /**Method that creates the HBox and it's buttons, labels, and tooltips
     * 
    */
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
        //LVL 2
        Label shapesInfo = new Label();
        shapesInfo.textProperty().bind(count.asString("Shape Count: %d"));
        hbox.getChildren().add(shapesInfo);

        Tooltip r = new Tooltip("A rectangle");
        Tooltip.install(rectBtn, r);
        Tooltip c = new Tooltip("A circle");
        Tooltip.install(circBtn, c);

        //LVL 3, allows keyboard input without needing the scene
        canvas.setFocusTraversable(true);
    }
    
    /**Method that handles events like mouse being clicked or buttons being pressed
     * 
     */
   private void eventHandling() {
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
   });
      //LVL 3
   canvas.setOnKeyPressed(e -> {
    KeyCode key = e.getCode();
    if(key == KeyCode.C) {
        clearBtn.fire();
    } else if(key == KeyCode.R) {
        rectBtn.setSelected(true);
    } else if(key == KeyCode.O) {
        circBtn.setSelected(true);
    }
   });
   }
    
        
   }
