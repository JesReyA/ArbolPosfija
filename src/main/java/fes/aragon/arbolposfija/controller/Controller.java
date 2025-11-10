package fes.aragon.arbolposfija.controller;

import fes.aragon.arbolposfija.inicio.InterfijaAPostfija;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    TextField operacionPosfija;
    TextArea resultadoPosfija;

    public void evaluarOperacion(ActionEvent event) {
        InterfijaAPostfija arbolPosfija = new InterfijaAPostfija(operacionPosfija.getText());
        arbolPosfija.construirArbol();
        resultadoPosfija.setText(Double.toString(arbolPosfija.evaluarExpresion()));
    }
}
