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

public class CustomerScontroller {


    @javafx.fxml.FXML
    private TextArea customercomplaintTextArea;
    @javafx.fxml.FXML
    private TextField complaintsTF;
    @javafx.fxml.FXML
    private Label customercomplaintsLabel;

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viewcomplaintsOnActionButton(ActionEvent actionEvent) {
        String Complaints=this.complaintsTF.getText();
        String CustomerS = "Customer complaints:\n complains: " + Complaints + "\n";
        this.customercomplaintTextArea.appendText(CustomerS);
    }
}
