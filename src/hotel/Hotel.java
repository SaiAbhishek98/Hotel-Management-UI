/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Abhishek
 */
public class Hotel extends Application {
    public Label label_title,label_message;
    public Button sign_in,sign_up;
    public TextField user;
    public PasswordField pass;
    public GridPane pane_signin, pane_signup;
  
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent Root = FXMLLoader.load(getClass().getResource("Stage.fxml")); 
        Scene scene = new Scene(Root);
        primaryStage.setTitle("Hotel Management");
       // primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void Logged_in(){
     // This Function used for the sign in button, It will automatically get called when the button is pressed
     String u_input = user.getText();    //Takes the input given in the user id text field by the user
     String p_input = pass.getText();    // Takes the input given in the password field by the user
     
     System.out.println("The user name is : "+ u_input+ "\nThe password is" + p_input); // Just to test whether the usernames and pass words are taken or not
     
     if(true/*<condition?>*/){  // Condition ie. if the username and password are correct 
         label_message.setVisible(false);
         // Don't Edit this try catch block, this is used to move from one screen to another
         try {
             Parent Toor = FXMLLoader.load(getClass().getResource("MainStage.fxml"));
             Scene X = new Scene(Toor);
             Stage newStage = (Stage)(label_message.getScene().getWindow());
             newStage.setScene(X);
             newStage.show();
         } catch (IOException ex) {
             System.out.println("Loading Error");
         } 
     }
     else{ 
         // If the username and password were incorrect 
         label_message.setVisible(true);
         user.setText(null);
         pass.setText(null);
     }  
    }
    
    public void Signing_up(){
        // Function used when sign up button is pressed , changes the page to signup No need to edit this function
        label_title.setText("Sign up");
        pane_signin.setVisible(false);
        pane_signup.setVisible(true);
    }
    
    public void Back(){
        // Back button in the sign up page , used to go back to the login page , do not edit this function
        label_title.setText("Login");
        pane_signup.setVisible(false);
        pane_signin.setVisible(true);
    }
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
