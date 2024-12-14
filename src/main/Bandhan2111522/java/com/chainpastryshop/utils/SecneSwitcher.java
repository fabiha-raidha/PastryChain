package com.chainpastryshop.utils;

import com.chainpastryshop.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneSwitcher {
    public static void switchScene(String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(SceneSwitcher.class.getResource("/fxml/Register.fxml , Checkout.fxml, " + fxmlFile)));
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
