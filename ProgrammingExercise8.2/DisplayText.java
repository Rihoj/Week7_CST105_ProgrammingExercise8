/**
 * Program: Week7ProgrammingExercise8
 * File: DisplayText.java
 * Summary: Displays 5 texts vertically with random color and opacity for each.
 *      Font: Times Roman, bold, italic, 22 pixels
 * Author: James Ray
 * Date: Dec 3, 2017
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayText extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox texts = new HBox(generateText(), generateText(), generateText(), generateText(), generateText());
        texts.setPadding(new Insets(30));
        StackPane root = new StackPane();
        root.getChildren().add(texts);

        Scene scene = new Scene(root);

        primaryStage.setTitle("Display Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Generate the word Java in a text node
     *
     * @return Text
     */
    private Text generateText() {
        Text text = new Text("Java");
        text.setRotate(90);
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text.setOpacity(Math.random());
        text.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        return text;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
