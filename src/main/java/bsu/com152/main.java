package bsu.com152;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        var loc = getClass().getResource("main.fxml");
        try {
            root = FXMLLoader.load(loc);

        }catch (IOException e){
            System.out.println("Couldn't find FXML file!!!!");
        }
        Scene windowContent = new Scene(root,300,400);
        primaryStage.setScene(windowContent);
        primaryStage.setTitle("Showing Web Data");
        primaryStage.show();


    }
}
