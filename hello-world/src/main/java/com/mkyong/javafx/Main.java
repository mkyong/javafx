package com.mkyong.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        // Starts JavaFX application
        launch();
    }

    @Override
    public void start(Stage mainStage) throws Exception {

        // Get Java version
        String javaVersion = System.getProperty("java.version");

        // Get JavaFX version
        String javafxVersion = System.getProperty("javafx.version");

        Label label = new Label("Hello, JavaFX " + javafxVersion
                + ", running on Java " + javaVersion + ".");

        StackPane stackPane = new StackPane(label);

        Scene scene = new Scene(stackPane, 640, 480);

        // attached the scene to main mainStage.
        mainStage.setScene(scene);

        // Set Windows's title
        mainStage.setTitle("Hello World JavaFX");

        mainStage.show();

    }
}
