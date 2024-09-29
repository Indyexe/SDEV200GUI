package com.example.sdev200gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BlackJackGame extends Application {


    /* The following code is just a very barebones version of the game I've just set it up so it will be easier to program once
    I get to it. The * indicate the importance of what I need to program
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Blackjack Game");

        // This is the Main layout for the game
        VBox layout = new VBox(15);
        layout.setStyle("-fx-padding: 20;");

        //Label for the games status need to program latter ***
        Label gameLabel = new Label("Welcome to the Blackjack Game!");

        // Start Game button
        Button startButton = new Button("Start Game");

        // THis is the action for the start button will program latter ***
        startButton.setOnAction(event -> {
            gameLabel.setText(" The Game is about to start (loading) I haven't coded the actual game yet");
        });


        layout.getChildren().addAll(gameLabel, startButton);

        // Simply sets up the scene
        Scene scene = new Scene(layout, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}