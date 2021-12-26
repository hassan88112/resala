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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class Tbr3dmController implements Initializable {
    
    
    @FXML
    private ComboBox c1 ;
    @FXML
    private CheckBox yesbox,nobox ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        ObservableList <String> list = FXCollections.observableArrayList("A+","A-","B+" ,"B-","AB+","AB-","O+","O-");
        c1.setItems(list);
    }
    
    
    @FXML
    private void yes(ActionEvent event) {
        if (yesbox.isSelected()){
            nobox.setSelected(false);
        }
    }

    
    @FXML
    private void no(ActionEvent event) {
        if (nobox.isSelected()){
            yesbox.setSelected(false);
        }
    }
    
    
    @FXML
    private void backbtn(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        Stage window = (Stage) btn.getScene().getWindow();
        window.close();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
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
