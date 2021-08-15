package com.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent parent = null;
        try {
             parent = FXMLLoader.load(getClass().getResource("view/MainWindow.fxml"));
        } catch (IOException e) {
            e.getMessage();
        }

        Scene scene = new Scene(parent, 500, 405);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
