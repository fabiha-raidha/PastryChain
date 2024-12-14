package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

public class FleetOVcontroller {

    @FXML
    private Label brokenvehicleLabel;
    @FXML
    private TextField newvehiclesTextfield;
    @FXML
    private TextField brokenvehicleTextfield;
    @FXML
    private TableColumn<FleetOV, String> Brokenvehiclescolumn;
    @FXML
    private TableColumn<FleetOV, String> newvehiclescolumn;
    @FXML
    private TableView<FleetOV> tableview;
    @FXML
    private Label addnewvehiclesLabel;
    @FXML
    private Label vehiclenameLabel;
    @FXML
    private TextField vehiclenameTextfield;
    @FXML
    private TableColumn<FleetOV, String> allvehiclecolomn;
    @FXML
    public void initialize(){
        allvehiclecolomn.setCellValueFactory(new PropertyValueFactory<FleetOV, String>("All vehicles"));
        Brokenvehiclescolumn.setCellValueFactory(new PropertyValueFactory<FleetOV, String>("Broken vehicles"));
        newvehiclescolumn.setCellValueFactory(new PropertyValueFactory<FleetOV, String>("new vehicles"));



    }



    @FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("projectoop/Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);

    }



    @FXML
    public void addnewvehicleOnActionButton(ActionEvent actionEvent) {
        String Vehiclename=vehiclenameTextfield.getText();
        String Newvehicle=newvehiclesTextfield.getText();
        String Brokenvehicle=brokenvehicleTextfield.getText();
        FleetOV fleetov=new FleetOV(Vehiclename,Newvehicle,Brokenvehicle);
        this.tableview.getItems().add(fleetov);


    }

}





