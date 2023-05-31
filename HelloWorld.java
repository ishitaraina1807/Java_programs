import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label with "Hello, World!" text
        Label helloLabel = new Label("Hello, World!");

        // Create a stack pane and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(helloLabel);

        // Create a scene with the stack pane as its root and set its size
        Scene scene = new Scene(root, 300, 200);

        // Set the title of the window
        primaryStage.setTitle("Hello, JavaFX!");

        // Set the scene of the window and show it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
