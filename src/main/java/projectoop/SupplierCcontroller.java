package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class SupplierCcontroller {
    @javafx.fxml.FXML
    private Label pricingLabel;
    @javafx.fxml.FXML
    private Label suppliernameLabel;
    @javafx.fxml.FXML
    private TextArea textarea;
    @javafx.fxml.FXML
    private TextField pricingtextfield;
    @javafx.fxml.FXML
    private Label ExpirydateLabel;
    @javafx.fxml.FXML
    private DatePicker Datepicker;
    @javafx.fxml.FXML
    private TextField suppliernametextfield;

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viewactivecontractsOnActionButton(ActionEvent actionEvent) throws IOException{
        String UserSname =this.suppliernametextfield.getText();
        String Pricing =this.pricingtextfield.getText();
        String Expirydate = ((LocalDate)this.Datepicker.getValue()).toString();
        String SupplierC = "Supplier Contracts:\nUser Supplier Name: " + UserSname + "\nPricing: " + Pricing + "\nExpiryDate" +Expirydate+"\n";
        this.textarea.appendText(SupplierC);



    }
}
