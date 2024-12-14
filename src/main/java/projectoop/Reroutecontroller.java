package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;

public class Reroutecontroller {


    @FXML
    private TableColumn<Reroute, String> currentroutecolumn;
    @FXML
    private TextField othersrouteTextfield;
    @FXML
    private TextField currentrouteTextfield;
    @FXML
    private Label currentrouteLabel;
    @FXML
    private TableColumn<Reroute, String> othersroutecolomn;
    @FXML
    private TableView<Reroute> tableview;
    @FXML
    private Label othersrouteLabel;

    @FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryOM.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    public void initialize() {

        currentroutecolumn.setCellValueFactory(new PropertyValueFactory<Reroute, String>("Current Route"));
        othersroutecolomn.setCellValueFactory(new PropertyValueFactory<Reroute, String>("Others Route"));


    }

    @FXML
    public void viewroutesOnActionButton(ActionEvent actionEvent) {

        String CurrentRoute = currentrouteTextfield.getText();
        String otherRoute = othersrouteTextfield.getText();

        Reroute reroute = new Reroute(CurrentRoute, otherRoute);
        this.tableview.getItems().add(reroute);


    }
}
