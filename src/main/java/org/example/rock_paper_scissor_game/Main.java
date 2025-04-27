package org.example.rock_paper_scissor_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
     Parent root=FXMLLoader.load(getClass().getResource("Rock_Paper_Scissor_Game.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Welcome to Rock Paper Scissor Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}