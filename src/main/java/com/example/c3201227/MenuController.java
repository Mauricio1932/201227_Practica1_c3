package com.example.c3201227;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MenuController {
ArrayList<Numero>listaNumeros = new ArrayList<>();
    @FXML
    private Button BtnAñadir;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnSumar;

    @FXML
    private TextArea txtArLista;

    @FXML
    private TextField txtNumero;

    @FXML
    void BtnAñadirOnMouseClicked(MouseEvent event) {
        int numero= Integer.parseInt(this.txtNumero.getText());
        listaNumeros.add(new Numero(numero));
        txtArLista.setText("");
        for (Numero numeros:listaNumeros) {
            txtArLista.appendText(String.valueOf(numeros.getNumero()) + "\n");

        }


    }
    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {System.exit(1);}
    @FXML
    void btnSumarOnMouseClicked(MouseEvent event) {
       int resultado=0;
        for (Numero numeros:listaNumeros) {
           resultado+=numeros.getNumero();
        }

        txtArLista.setText(String.valueOf(resultado));
        listaNumeros=new ArrayList<>();
    }

}

