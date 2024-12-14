package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;

public class SafetyandScontroller {

    @javafx.fxml.FXML
    private ComboBox<String> Driverscombobox;
    @javafx.fxml.FXML
    private Label ruleslabel;
    @javafx.fxml.FXML
    private TableColumn<SafetyandS, String> Driverscolumn;
    @javafx.fxml.FXML
    private Label driversLabel;
    @javafx.fxml.FXML
    private Label showtextLabel;
    @javafx.fxml.FXML
    private TextField RulesTF;
    @javafx.fxml.FXML
    private TableColumn<SafetyandS, String> Safetycolumn;
    @FXML
    private TableView<SafetyandS> tableview;


    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);

    }
    @FXML
    void initialize(){
        this.Driverscombobox.getItems().addAll(new String[]{"Kamal", "Shahid", "Rubel", "Fahad", "Siam"});
        Driverscolumn.setCellValueFactory(new PropertyValueFactory<SafetyandS, String>("Drivers"));
        Safetycolumn.setCellValueFactory(new PropertyValueFactory<SafetyandS, String>("Safety Rules"));

    }


    @FXML
    public void ViewOnActionButton(ActionEvent actionEvent) {
        String Rules=RulesTF.getText();
        String Drivers = (String)this.Driverscombobox.getValue();


        SafetyandS safetyandS=new SafetyandS(Drivers,Rules);
        this.tableview.getItems().add(safetyandS);


    }

}

