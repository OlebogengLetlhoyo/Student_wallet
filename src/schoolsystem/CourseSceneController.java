/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import schoolsystem.module;

/**
 * FXML Controller class
 *
 * @author Olebogeng Letlhoyo
 */
public class CourseSceneController implements Initializable {
    
    
   @FXML
    private JFXButton DistinctionID;
   
    @FXML
    private JFXHamburger draweControl;
    
    @FXML
    private JFXDrawer drawer;



    @FXML
    private TableColumn<module, String> moduleCode;
    
    @FXML
    private ChoiceBox choicebox;
    
    @FXML
    private JFXButton updateButton;
    
    @FXML
    private TableView<module> table;

    @FXML
    private TableColumn<module, String> Semester;

    @FXML
    private PieChart piechartID;
    
    @FXML
    private void totalModules(ActionEvent event){
        ObservableList<PieChart.Data> pieChartData
                =FXCollections.observableArrayList(
                        new PieChart.Data("MTHS",2),
                        new PieChart.Data("CMPG",2),
                        new PieChart.Data("ALDE",2),
                        new PieChart.Data("NPHY",2),
                        new PieChart.Data("APPM",2));
        piechartID.setData(pieChartData);
        piechartID.setStartAngle(90);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    @FXML
    private void results(ActionEvent event) throws IOException{
        
        ObservableList<PieChart.Data> pieChartData
                =FXCollections.observableArrayList(
                        new PieChart.Data("MTHS",4),
                        new PieChart.Data("CMPG",4),
                        new PieChart.Data("WVNS",1),
                        new PieChart.Data("APPM",3));
        piechartID.setData(pieChartData);
        piechartID.setStartAngle(180);
    }
    @FXML
    private void homeButton(ActionEvent event) throws IOException {
         //homeScreen.getScene().getWindow().hide();
        Parent root =FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
        Scene scene = new Scene(root);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void totalCredits(ActionEvent event){
        
        ObservableList<PieChart.Data> pieChartData
                =FXCollections.observableArrayList(
                        new PieChart.Data("MTHS",104),
                        new PieChart.Data("CMPG",120),
                        new PieChart.Data("ALDE",24),
                        new PieChart.Data("NPHY",24),
                        new PieChart.Data("APPM",56),
                        new PieChart.Data("WVNS",24));
        piechartID.setData(pieChartData);
        piechartID.setStartAngle(90);
    }
    
     @FXML
    private void coreModule(ActionEvent event){
          
        ObservableList<PieChart.Data> pieChartData
                =FXCollections.observableArrayList(
                        new PieChart.Data("MTHS",10),
                        new PieChart.Data("CMPG",9),
                        new PieChart.Data("APPM",1));
        piechartID.setData(pieChartData);
        piechartID.setStartAngle(90);
    }
    
    
}
