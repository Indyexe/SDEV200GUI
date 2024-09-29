package com.example.sdev200gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WelcomeScreenCasino extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome to Casino Showdown!");

        VBox vbox = new VBox(15);
        vbox.setStyle("-fx-padding: 20;");
        //Gives users instruction on what to do when they enter the Blackjack game
        Label welcomeLabel = new Label("Welcome to Casino Showdown!");
        Label instructionLabel = new Label("Are You Ready to Play? Click the Button Below to Go to the Blackjack Game!");

        Button playButton = new Button("Blackjack Game");

        // This is my second technical event it transfers the user to the blackjack game after pressing the Blackjack Game button
        playButton.setOnAction(event -> {
            // the following creates a new instance of the blackjackgame
            BlackJackGame blackjackGame = new BlackJackGame();

             /* The code below uses a catch to identify if there is any errors while trying to get into the blackjack game
                I watched this video to give me a better idea of how this process works https://www.youtube.com/watch?v=osEjmECD8bI
                 */
            try {
                Stage gameStage = new Stage();
                blackjackGame.start(gameStage);
                primaryStage.close(); // Close the welcome screen

            } catch (Exception e) {
                System.err.println("An error occurred while starting the Blackjack game: " + e.getMessage());
                e.printStackTrace();
            }
        });

        //building the main stage user interface
        vbox.getChildren().addAll(welcomeLabel, instructionLabel, playButton);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}