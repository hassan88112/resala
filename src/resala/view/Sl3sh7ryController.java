package resala.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class Sl3sh7ryController implements Initializable {

    @FXML
    ComboBox c1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        ObservableList <String> list = FXCollections.observableArrayList("رز","مكرونة","شعرية" ,"سكر","زيت","سمنة","فاصوليا","لوبيا","فول");
        c1.setItems(list);
    }
    
    
    @FXML
    private void madysh7ry(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        Stage window = (Stage) btn.getScene().getWindow();
        window.close();
        Parent root = FXMLLoader.load(getClass().getResource("madysh7ry.fxml"));
        Scene scene = new Scene(root,650,700);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    
    @FXML
    private void backbtn(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        Stage window = (Stage) btn.getScene().getWindow();
        window.close();
        Parent root = FXMLLoader.load(getClass().getResource("tbr3sh7ry.fxml"));
        Scene scene = new Scene(root,650,700);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    private void closebtn(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        Stage window = (Stage) btn.getScene().getWindow();
        window.close();
    }
}