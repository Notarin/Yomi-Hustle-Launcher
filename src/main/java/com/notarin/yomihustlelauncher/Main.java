package com.notarin.yomihustlelauncher;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Boiler plate");

        Label label = new Label("Boiler plate");
        label.setAlignment(Pos.CENTER);

        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);

        stage.show();
    }
}
