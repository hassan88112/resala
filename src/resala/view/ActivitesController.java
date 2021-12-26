package resala.view;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ActivitesController implements Initializable {
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    
    @FXML
    private void backbtn(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        Stage window = (Stage) btn.getScene().getWindow();
        window.close();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root,560,760);
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