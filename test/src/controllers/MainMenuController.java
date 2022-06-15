package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnJugar;

    @FXML
    private Button btnReglas;

    @FXML
    private ImageView img;

    @FXML
    void btnJugarClicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../jugar.fxml"));
            Stage stage = (Stage) btnJugar.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML
    void btnReglasClicked(ActionEvent event) {
        System.out.println("Reglas");
    }

    @FXML
    void initialize() {
        assert btnJugar != null : "fx:id=\"btnJugar\" was not injected: check your FXML file 'main.fxml'.";
        assert btnReglas != null : "fx:id=\"btnReglas\" was not injected: check your FXML file 'main.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'main.fxml'.";
    }

}
