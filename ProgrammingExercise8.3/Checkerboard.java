/**
 * Program: Week7ProgrammingExercise8
 * File: Checkerboard.java
 * Summary:
 * Author: James Ray
 * Date: Dec 3, 2017
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox();
        for (int row = 1; row < 9; row++) {
            HBox hbox = new HBox();
            for (int col = 1; col < 9; col++) {
                if (((row & 1) == 0 && (col & 1) == 0) || ((row & 1) != 0 && (col & 1) != 0)) {
                    hbox.getChildren().add(createRectangle(Color.WHITE));
                } else if (((row & 1) == 0 && (col & 1) != 0) || ((row & 1) != 0 && (col & 1) == 0)) {
                    hbox.getChildren().add(createRectangle(Color.BLACK));
                }
            }
            vbox.getChildren().add(hbox);
        }
        StackPane root = new StackPane();
        root.getChildren().add(vbox);

        Scene scene = new Scene(root);

        primaryStage.setTitle("Checkerboard!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Create a rectangle given the color.
     *
     * @param color
     * @return Rectangle
     */
    private Rectangle createRectangle(Color color) {
        Rectangle rectangle = new Rectangle(50, 50, color);
        return rectangle;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
