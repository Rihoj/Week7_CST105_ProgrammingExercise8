/**
 * Program: Week7ProgrammingExercise8
 * File: DisplayCards.java
 * Summary: Displays three cards in a javaFX scene.
 * Author: James Ray
 * Date: Dec 3, 2017
 */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DisplayCards extends Application {

    //Array list of drawn cards to not draw the same card twice
    private final ArrayList<Integer> drawnCards = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        HBox hand = new HBox(getRandomCard(), getRandomCard(), getRandomCard());
        StackPane root = new StackPane();
        root.getChildren().add(hand);

        Scene scene = new Scene(root);

        primaryStage.setTitle("Display Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Get an ImageView of a random card Image.
     *
     * @return ImageView
     */
    private ImageView getRandomCard() {
        int randomCardInt = ThreadLocalRandom.current().nextInt(1, 53);
        if (!drawnCards.contains(randomCardInt)) {
            Image randomCardImage = new Image("card/" + Integer.toString(randomCardInt) + ".png");
            ImageView randomCardImageView = new ImageView(randomCardImage);
            randomCardImageView.setPreserveRatio(true);
            drawnCards.add(randomCardInt);
            return randomCardImageView;
        } else {
            return getRandomCard();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
