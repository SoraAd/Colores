package org.example.interfazbase;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import org.w3c.dom.Text;

public class HelloController {

    @FXML
    private TextField textColor;

    @FXML
    private Circle circle;
    @FXML
    private Label textError;


    @FXML
    protected void chargerColor(){new HelloApplication().chargetColor(textColor,circle,textError);}
}