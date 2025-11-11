package fes.aragon.arbolposfija.controller;

import fes.aragon.arbolposfija.inicio.InterfijaAPostfija;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    TextField operacionPosfija, resultadoPosfija;

    @FXML
    private TextArea txtArbolPosfija;


    public void evaluarOperacion(ActionEvent event) {
        try{
            if (!operacionPosfija.getText().isEmpty()){
                InterfijaAPostfija arbolPosfija = new InterfijaAPostfija(operacionPosfija.getText());
                arbolPosfija.construirArbol();
                resultadoPosfija.setText(String.valueOf(arbolPosfija.evaluarExpresion()));
                String impresion=arbolPosfija.imprimirArbol();
                txtArbolPosfija.setText(impresion);}
            else {
                mostrarAlerta(Alert.AlertType.ERROR, "Advertencia","La entrada no cumple el formato \n Revisela y vuelva a intentar.");
            }
        }catch (NumberFormatException e){
            mostrarAlerta(Alert.AlertType.ERROR, "Advertencia de formato", "La entrada solo admite números y signos \n Revise la entrada y vuela a intentar.");
        }

    }
    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje){
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
