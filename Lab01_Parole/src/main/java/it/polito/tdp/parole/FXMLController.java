package it.polito.tdp.parole;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.ParoleArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Parole elencoList;
	private ParoleArray elencoArray;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextArea txtTimes;

    @FXML
    private Button btnReset;

    
    @FXML
    void doCancella(ActionEvent event) {
    		String daCancellare = txtResult.getSelectedText();
    		//elencoList.cancella(daCancellare);
    		//String risultato = elencoList.toString();
    		elencoArray.cancella(daCancellare);
    		String risultato = elencoArray.toString();
    		txtResult.setText(risultato);
    		String time = txtTimes.getText()+"\n"+System.nanoTime();
    		txtTimes.setText(time);
    }

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	String parola = txtParola.getText();
    	if(!parola.equals("")) {
    		//elencoList.addParola(parola);
    		//LinkedList<String> elencoParole = elencoList.getElenco();
    		//String risultato = elencoList.toString();
    		elencoArray.addParola(parola);
    		ArrayList<String> elencoParole = elencoArray.getElenco();
    		String risultato = elencoArray.toString();
    		txtResult.setText(risultato);
    		txtParola.setText("");
    		String time = txtTimes.getText()+"\n"+System.nanoTime();
    		txtTimes.setText(time);
    		
    	}
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	//elencoList.reset();
    	elencoArray.reset();
    	txtResult.setText("");
    	txtTimes.setText("");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTimes != null : "fx:id=\"txtTimes\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elencoList = new Parole();
        elencoArray = new ParoleArray();
    }
}
