package com.example.javafxstudying;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static AnchorPane animationPane;
    public static Animation.Status animStatus = Animation.Status.STOPPED;
    public static Animacje config;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        SplitPane root = fxmlLoader.load();
        animationPane = (AnchorPane) root.getItems().get(1);
        Scene scene = new Scene(root);
        stage.setTitle("Kontrola stadionowa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}