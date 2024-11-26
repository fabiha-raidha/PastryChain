package oop.projectwork_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StoreManager {

    @FXML
    void onFeedbackButtonClick(ActionEvent event) {

    }

    @FXML
    void onHygieneButtonClick(ActionEvent event) {

    }

    @FXML
    protected void onLogoutButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogIn.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);

    }

    @FXML
    void onManpowerButtonClick(ActionEvent event) {

    }

    @FXML
    void onMarketingButtonClick(ActionEvent event) {

    }

    @FXML
    void onSalesButtonClick(ActionEvent event) {

    }

    @FXML
    void onStockButtonClick(ActionEvent event) {

    }

}
