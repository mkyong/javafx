package com.mkyong.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

public class TransformationApp extends Application {

    public static void main(String[] args) {
        // Starts JavaFX application
        launch();
    }

    private void transform(Rectangle box) {

        // Translate
        // translate means moves,
        // below moves the box 100 pixels to the right and 150 pixels down.
        box.setTranslateX(100);
        box.setTranslateY(150);

        // Rotate
        // Rotate rotate = new Rotate(45, box.getWidth() / 2, box.getHeight() / 2);
        // box.getTransforms().add(rotate);

        // Let’s rotate the box by 45 degrees.
        // box.setRotate(45);

        // Scale
        // box.setScaleX(1.5);
        // box.setScaleY(1.5);

        // Shear
        // slants a box
        //box.getTransforms().add(new Shear(0,0.5));

        // combining transformations
        box.getTransforms().addAll(
                new Rotate(90, box.getWidth() / 2, box.getHeight() / 2),
                new Scale(1.2, 1.2),
                new Shear(0.5, 0));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // box with 200 width and 100 height, in color red
        Rectangle box = new Rectangle(200, 100, Color.RED);

        transform(box);

        Scene scene = new Scene(new Pane(box), 640, 480, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Transformations examples");
        primaryStage.show();

    }


}