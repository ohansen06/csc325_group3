package csc325assignment5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class that contains the start method and main method
 */

public class MainApp extends Application {
        DrawController contr = new DrawController();

    @Override
    public void start(Stage stage) {

        stage.setTitle("Drawable Shapes Application");
        Scene scene = new Scene(contr.getRoot(), 600, 400);

        
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
