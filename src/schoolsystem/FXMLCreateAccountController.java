/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import com.jfoenix.controls.JFXButton;
import dbUtil.dbConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Olebogeng Letlhoyo
 */
public class FXMLCreateAccountController implements Initializable {

    @FXML
    private TextField firstnameField;

    @FXML
    private TextField surnameField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private JFXButton proceedButton;

    @FXML
    private ChoiceBox choiceboxCourse;

    @FXML
    private ChoiceBox choiceboxAcadem;

    @FXML
    private TextField genderField;

    @FXML
    private TextField codeField;

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
    PreparedStatement preparedStatement;
    public void PersonalDetails(ActionEvent ex) throws IOException, SQLException{
        dbConnection connection = new dbConnection();
        Connection conn =connection.getConnection();
        
        String pass1 = passwordField.getText();
        String pass2 = confirmPasswordField.getText();
        
        if(pass1.equals(pass2)){
            
            try{
                Statement statement =conn.createStatement();
            
                String sql ="INSERT INTO createaccount ( firstName, Surname, username, password,gender,code,academicYear,course) VALUES (?,?,?,?,?,?,?,?)";
                preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, firstnameField.getText());
                preparedStatement.setString(2, surnameField.getText());
                preparedStatement.setString(3,usernameField.getText());
                preparedStatement.setString(4,passwordField.getText());
                preparedStatement.setString(5,genderField.getText());
                preparedStatement.setString(6,codeField.getText());
                preparedStatement.setString(7, (String) choiceboxAcadem.getValue());
                preparedStatement.setString(8,(String)choiceboxCourse.getValue());
                preparedStatement.executeUpdate();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
        
            Parent root =FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
            Scene scene = new Scene(root);
            Stage window =(Stage)((Node)ex.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Look, an Error Dialog");
            alert.setContentText("Password Do Not Match!");
            alert.showAndWait();
        }
        
    }
}
