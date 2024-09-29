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

        /* This just adds some style to make the font look better I used this stackoveflow
        page to help me wit this
        https://stackoverflow.com/questions/21385117/using-both-css-and-setstyle
         */
        userLabel.setStyle("-fx-font-size: 14px;");
        passLabel.setStyle("-fx-font-size: 14px;");
        loginButton.setStyle("-fx-background-color: #db8535; -fx-text-fill: white;");

        /* This is still a work in progress as I'm still to figure out the code for input validation and
        I don't have my sign-up process completed but this code below is my first event which simply tells the user
        to input both a username and passowrd. I've set up some structure for getting to the next page.
        I used the following stackoverflow page to help me with this section: https://stackoverflow.com/questions/44147153/javafx-validation-user-input-username-password

         */
        loginButton.setOnAction(event -> {
            String username = userField.getText().trim();
            String password = passField.getText().trim();

            //Checks if the username is empty and the user try's to log in
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Please enter both username and password.");
            } else {
                    // I'm going to eventaully implement more logic in this portion to actually login
                System.out.printf("Attempting to log in with username: %s%n", username);

            }
        });

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