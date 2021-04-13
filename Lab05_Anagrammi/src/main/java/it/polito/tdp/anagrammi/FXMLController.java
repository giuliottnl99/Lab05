package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField parola;

    @FXML
    private TextArea anagrammiCorretti;

    @FXML
    private TextArea anagrammiErrati;

    @FXML
    void calcola(ActionEvent event) {
    	System.out.println("Clicked");
    	Anagramma a = new Anagramma(parola.getText());
    	//Modifica temporanea per vedere se funziona
    	anagrammiCorretti.setText(a.anagrammiInStringa());
    	

    }

    @FXML
    void reset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert parola != null : "fx:id=\"parola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert anagrammiCorretti != null : "fx:id=\"anagrammiCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert anagrammiErrati != null : "fx:id=\"anagrammiErrati\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
