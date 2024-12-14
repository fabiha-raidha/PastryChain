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
import java.time.LocalDate;

public class SupplierAcontroller {

    @javafx.fxml.FXML
    private Label SuppliernameLabel;
    @javafx.fxml.FXML
    private TableColumn<SupplierA,String>suppliercolumn;
    @javafx.fxml.FXML
    private Label SupplierlistLabel;
    @javafx.fxml.FXML
    private Label AuditDateLabel;
    @javafx.fxml.FXML
    private TableColumn<SupplierA,String> auditdatecolumn;
    @javafx.fxml.FXML
    private TextArea textarea;
    @javafx.fxml.FXML
    private TextField Textfield;
    @javafx.fxml.FXML
    private TableView<SupplierA> tableview;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void LogoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
    @FXML
    void initialize(){
        this.combobox.getItems().addAll(new String[]{"ABC company", "JKH corporation", "xyz industries", "gih company"});
        suppliercolumn.setCellValueFactory(new PropertyValueFactory<SupplierA, String>("Supplier"));
        auditdatecolumn.setCellValueFactory(new PropertyValueFactory<SupplierA, String>("Audit Date"));



    }

    @javafx.fxml.FXML
    public void scheduleauditOnActionButton(ActionEvent actionEvent) {
        String Suppliername = (String)this.combobox.getValue();
        String Auditdate = ((LocalDate)this.datepicker.getValue()).toString();
        SupplierA supplierA = new SupplierA( Suppliername,Auditdate);
        this.tableview.getItems().add(supplierA);
    }



}
