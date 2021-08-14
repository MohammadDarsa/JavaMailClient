package com.test;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent parent = null;
        try {
             parent = FXMLLoader.load(getClass().getResource("view/first.fxml"));
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }

        Scene scene = new Scene(parent, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
