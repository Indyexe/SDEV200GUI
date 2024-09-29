package com.example.sdev200gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreenCasino extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Casino Showdown - User Login");

        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setStyle("-fx-padding: 20;");


        /* I used the following youtube video to help me with this login screen
        https://www.youtube.com/watch?v=Savju4HzkYo
         */
        Label userLabel = new Label("Enter Username:");
        TextField userField = new TextField();
        Label passLabel = new Label("Enter Password:");
        PasswordField passField = new PasswordField();
        Button loginButton = new Button("Log In");

        /* This just adds some style to make the font look better I used the following stackoveflow
        page to help me wit this
        https://stackoverflow.com/questions/21385117/using-both-css-and-setstyle
         */
        userLabel.setStyle("-fx-font-size: 14px;");
        passLabel.setStyle("-fx-font-size: 14px;");
        loginButton.setStyle("-fx-background-color: #db8535; -fx-text-fill: white;");

        //Sets the userlabels in place
        grid.add(userLabel, 0, 0);
        grid.add(userField, 1, 0);
        grid.add(passLabel, 0, 1);
        grid.add(passField, 1, 1);
        grid.add(loginButton, 1, 2);

        //Creates new scene for the loginscreen
        Scene scene = new Scene(grid, 350, 220);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}