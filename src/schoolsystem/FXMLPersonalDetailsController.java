/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Olebogeng Letlhoyo
 */
public class FXMLPersonalDetailsController implements Initializable {

    @FXML
    private TextField genderField;

    @FXML
    private ChoiceBox choiceboxCourse;

    @FXML
    private ChoiceBox choiceboxAcadem;

    @FXML
    private TextField codeField;

    @FXML
    private JFXButton saveButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceboxAcadem.getItems().add("FIRST YEAR");
        choiceboxAcadem.getItems().add("SECOND YEAR");
        choiceboxAcadem.getItems().add("THIRD YEAR");
        choiceboxAcadem.getItems().add("FOURTH YEAR");
        choiceboxAcadem.setValue("FIRST YEAR"); 
        
        choiceboxCourse.getItems().add("Comp.Science and Math");
        choiceboxCourse.getItems().add("Comp.Science and Electro");
        choiceboxCourse.getItems().add("Comp.Science and Physics");
        choiceboxCourse.setValue("Comp.Science and Math");
        
        
        
    }    
    
}
