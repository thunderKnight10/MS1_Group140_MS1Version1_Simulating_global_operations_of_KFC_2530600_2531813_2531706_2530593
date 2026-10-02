package com.example.ms1_group140_ms1version1_simulating_global_operations_of_kfc_2530600_2531813_2531706_2530593;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
