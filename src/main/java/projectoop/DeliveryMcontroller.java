package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class DeliveryMcontroller {

    @javafx.fxml.FXML
    private Label DrivernameLabel;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private Label DriverscontactLabel;
    @javafx.fxml.FXML
    private Label DelayedDeliveryLabel;
    @FXML
    private TextField drivernameTF;
    @FXML
    private TextField ordercodeTF;

    @FXML
    public void initialize(){


    }

    @javafx.fxml.FXML
    public void RerouteOnActionButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Reroute.fxml"));
        Parent root = loader.load();

        // Get the current stage
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        // Set the new scene
        stage.setScene(new Scene(root));
        stage.setTitle("Reroute");
        stage.show();
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);


    }

    @FXML
    public void DelayedOnActionButton(ActionEvent actionEvent) {
        String DriverName= this.drivernameTF.getText();
        String OrderCode= this.ordercodeTF.getText();

    }
}
