/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abhishek
 */
public class StageController implements Initializable {
    public AnchorPane Rooms, Cf_Halls, Tables , Invoice;
    public JFXButton btn_Rooms, btn_Conference_Halls, btn_Tables, btn_Invoice;
    public Label label_heading, label_roomName, label_Cost, label_Desc;
    public ImageView Iv;
    
    
    /**
     * Initializes the controller class.
     * @throws java.io.IOException
     */
    public void LogOut() throws IOException{
        Parent Root = FXMLLoader.load(getClass().getResource("Stage.fxml"));
        Scene X = new Scene(Root);
        Stage OldStage = (Stage)(Rooms.getScene().getWindow());
        OldStage.setScene(X);
        OldStage.show();
        
    }
    public void RoomClick(){
        // Function Executes when room button is clicked
       // use the below commented code when you have inserted your data from the data base , now I am not running it so i can show you the general layout
        /* label_Cost.setText(null);
        label_Desc.setText(null);
        label_roomName.setText(null);
        Iv.setVisible(false);*/
        StVisible(1);
        label_heading.setText("Rooms");
        
    }
    public void ConfernceClick(){
        // Function called when Conference hall is clicked, used to display conference hall page
        
        StVisible(2);
        label_heading.setText("Conference Halls");
    }
    public void TablesClick(){
        // Function called when Tables is clicked , used to display tables page
        StVisible(3);
        label_heading.setText("Tables");
    }
    public void InvoiceClick(){
        // Function called when invoice is clikced , used to display invoice page
        StVisible(4);
        label_heading.setText("Invoice");
    }
    private void StVisible(int X){
        Rooms.setVisible(false);
        Cf_Halls.setVisible(false);
        Tables.setVisible(false);
        Invoice.setVisible(false);
        switch(X){
                case 1: Rooms.setVisible(true);
                    break;
                case 2: Cf_Halls.setVisible(true);
                break;
                case 3: Tables.setVisible(true);
                break;
                case 4:Invoice.setVisible(true);
                break;
                default:
                    break;
        }
    }
    // ROOMS PAGE Controller
    public void CBox(){
        // Used for the combo box which selects ROOM TYPE
        //label_roomName is the label which displays room name
        // label_Cost is the label which displays cost
        // label_Desc is the label for Description
        // Iv is the Image View variable
        // For changing the Labels use the setText method as shown label_name.setText("Your text goes here")
        
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
