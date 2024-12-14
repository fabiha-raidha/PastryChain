package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;

public class SupplierRcontroller
{
    @javafx.fxml.FXML
    private TextField SupplierlistTF;
    @javafx.fxml.FXML
    private TextArea textarea;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;

    @javafx.fxml.FXML
    public void initialize() {
        this.combobox.getItems().addAll(new String[]{"Excellent", "Very Good", "Good", "Bad", "Very Bad"});


    }

    @javafx.fxml.FXML
    public void LogoutOnActionButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void ViewOnActionButton(ActionEvent actionEvent) {
        String Suppliername =this.SupplierlistTF.getText();
        String Report = (String)this.combobox.getValue();
        String SupplierR = "Supplier Report:\nSuppliername: " + Suppliername + "\nReport: " + Report + "\n";
        this.textarea.appendText(SupplierR);


    }
}