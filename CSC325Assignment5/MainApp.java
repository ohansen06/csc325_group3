package CSC325Assignment5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    DrawConroller controller = new DrawConroller();
    
    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(controller.createContent());
        
        primaryStage.setTitle("Drawing Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
	
}
