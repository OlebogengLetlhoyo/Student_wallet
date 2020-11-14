/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import dbUtil.dbConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Olebogeng Letlhoyo
 */
public class FXMLLoginController implements Initializable {
    
   @FXML
    private JFXTextField usernameField;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXButton createNewAccount;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    @FXML
    public void loginButton(ActionEvent event) throws IOException, SQLException{
         dbConnection connection = new dbConnection();
        Connection conn =connection.getConnection();
        
        try{
            Statement statement =conn.createStatement();
            String sql ="SELECT * FROM createaccount WHERE username ='"+usernameField.getText()+"' AND password ='"+passwordField.getText()+"';";
            ResultSet result =statement.executeQuery(sql);
            
            if (result.next()){
                Parent root =FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
                Scene scene = new Scene(root);
                Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
               //
            }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Look, an Error Dialog");
                alert.setContentText("Wrong username or password!");
                alert.showAndWait();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    @FXML
    public void CreateAccount(ActionEvent ex) throws IOException{
        Parent root2 =FXMLLoader.load(getClass().getResource("FXMLCreateAccount.fxml"));
        Scene scene2 = new Scene(root2);
        Stage window2 =(Stage)((Node)ex.getSource()).getScene().getWindow();
        window2.setScene(scene2);
        window2.show();
    }
     
    
}
