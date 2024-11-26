package oop.projectwork_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {

    @FXML
    private TextField employeeIDTF;

    @FXML
    private TextField passwordTF;

    @FXML
    protected void onLogInButtonClick(ActionEvent event) throws IOException {
        String userid = employeeIDTF.getText();
        String password = passwordTF.getText();


    }

}