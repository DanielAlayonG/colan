package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class questionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button firstAnswer;

    @FXML
    private Button fourthAnswer;

    @FXML
    private Text question;

    @FXML
    private Button secondAnswer;

    @FXML
    private Button thirdAnswer;

    @FXML
    void firstAnswerClicked(ActionEvent event) {
        System.out.println("Pregunta 1");
    }

    @FXML
    void secondAnswerClicked(ActionEvent event) {
        System.out.println("Pregunta 2");
    }

    @FXML
    void thirdAnswerClicked(ActionEvent event) {
        System.out.println("Pregunta 3");
    }

    @FXML
    void fourthAnswerClicked(ActionEvent event) {
        System.out.println("Pregunta 4");
    }



    @FXML
    void initialize() {
        assert firstAnswer != null : "fx:id=\"firstAnswer\" was not injected: check your FXML file 'jugar.fxml'.";
        assert fourthAnswer != null : "fx:id=\"fourthAnswer\" was not injected: check your FXML file 'jugar.fxml'.";
        assert question != null : "fx:id=\"question\" was not injected: check your FXML file 'jugar.fxml'.";
        assert secondAnswer != null : "fx:id=\"secondAnswer\" was not injected: check your FXML file 'jugar.fxml'.";
        assert thirdAnswer != null : "fx:id=\"thirdAnswer\" was not injected: check your FXML file 'jugar.fxml'.";

        //TODO: Preguntas al azar
        question.setText("¿El sistema de numeración binario esta compuesta por?");
        firstAnswer.setText("0 y 1");
        secondAnswer.setText("1 y 4");
        thirdAnswer.setText("2 y 3");
        fourthAnswer.setText("0 y 2");
    }

}
