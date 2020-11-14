/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Olebogeng Letlhoyo
 */
public class FXMLHomeSceneController implements Initializable {
    
    @FXML
    private JFXButton bursariesButton;

    @FXML
    private JFXButton aboutButton;

    @FXML
    private JFXButton courseButton;

    @FXML
    private JFXButton essentialsButton;

    @FXML
    private JFXButton residenceButton;

    @FXML
    private JFXButton timetableButton;
    
    @FXML
    private void CourseButton(ActionEvent event) throws IOException {
         //homeScreen.getScene().getWindow().hide();
        Parent root =FXMLLoader.load(getClass().getResource("CourseScene.fxml"));
        Scene scene = new Scene(root);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    private void settings(ActionEvent event2) throws IOException{
        Parent root =FXMLLoader.load(getClass().getResource("FXMLSettings.fxml"));
        Scene scene = new Scene(root);
        Stage window =(Stage)((Node)event2.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    private void bursaries(ActionEvent event3) throws IOException{
        Parent root =FXMLLoader.load(getClass().getResource("FXMLBursaries.fxml"));
        Scene scene = new Scene(root);
        Stage window =(Stage)((Node)event3.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
