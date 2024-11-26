package oop.projectwork_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HeadChefController {

    @FXML
    private TextField safetyCompletionTF;

    @FXML
    private TextField totalEmployeeTF;

    @FXML
    private TextField totalRecipeTF;

    @FXML
    void onAttendanceStatusButtonClick(ActionEvent event) {

    }

    @FXML
    void onHygieneButtonClick(ActionEvent event) {

    }

    @FXML
    void onInventoryButtonClick(ActionEvent event) {

    }

    @FXML
    void onInventoryStatusButtonClick(ActionEvent event) {

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
    void onRecipeButtonClick(ActionEvent event) {

    }

    @FXML
    void onSchedulerButtonClick(ActionEvent event) {

    }

    @FXML
    void onViewScheduleButtonClick(ActionEvent event) {

    }



}
