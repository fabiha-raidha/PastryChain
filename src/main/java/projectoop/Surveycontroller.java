package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;

public class Surveycontroller {

    @javafx.fxml.FXML
    private Label showmessageLabel;
    @javafx.fxml.FXML
    private TextField textfield;
    @javafx.fxml.FXML
    private TextArea textarea;

    @javafx.fxml.FXML
    protected void SendsurveyOnActionButton(ActionEvent actionEvent) {
        showmessageLabel.setText("Send to the Customer");
    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("projectoop/Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void createsurveyOnActionButton(ActionEvent actionEvent) {
        String Questions=this.textfield.getText();
        String Survey = "Create Survey:\nQuestions: " + Questions + "\n";
        this.textarea.appendText(Survey);
    }
}
