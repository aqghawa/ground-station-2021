package com.java;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainApp extends Application {

  @Override
  public void start(Stage stage) throws Exception{
      String javaVersion = System.getProperty("java.version");
      String javafxVersion = System.getProperty("javafx.version");
      Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
      Parent root = FXMLLoader.load(getClass().getResource("MainApp.fxml"));
      Scene scene = new Scene(root, 640, 480);



      stage.setScene(scene);
      stage.show();
  }

  public static void main(String[] args) {
      launch();
  }

}