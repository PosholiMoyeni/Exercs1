package com.example.exercise1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label value;
    int variable;
    @FXML
    void ADD(ActionEvent event) {
        variable+=1;
        value.setText(String.valueOf(variable));
    }

    @FXML
    void SUBTRACT(ActionEvent event) {
        variable-=1;
        value.setText(String.valueOf(variable));
    }
}