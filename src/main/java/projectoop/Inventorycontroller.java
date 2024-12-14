package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;
import java.util.EventObject;

public class Inventorycontroller {

    @javafx.fxml.FXML
    private TextField Quantitytextfield;
    @javafx.fxml.FXML
    private TextArea Textarea;
    @javafx.fxml.FXML
    private ComboBox<String> Combobox;
    @javafx.fxml.FXML
    private Label rawmaterialsLabel;
    @javafx.fxml.FXML
    private TableView<Inventory> Tableview;
    @javafx.fxml.FXML
    private TextField productstextfield;
    @javafx.fxml.FXML
    private Label quantityLabel;
    @javafx.fxml.FXML
    private TableColumn<Inventory, String> tablecolumn;
    @javafx.fxml.FXML
    private Label productsLabel;

    @javafx.fxml.FXML
    public void initialize() {
        this.Combobox.getItems().addAll(new String[]{"flour", "chocolate", "butter", "eggs", "sugar"});

    }

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryOM.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }


    @Deprecated
    public void ordermaterialsOnActionButton(ActionEvent actionEvent) {
        String RawMaterials = (String)this.Combobox.getValue();
        Inventory inventory=new Inventory(RawMaterials);
        this.Tableview.getItems().add(inventory);


    }

    @Deprecated
    public void updateOnActionButton(ActionEvent actionEvent) {
        String products= this.productstextfield.getText();
        String quantity=this.Quantitytextfield.getText();
        String RawMaterials = (String)this.Combobox.getValue();
        String Inventory = "Update details:\nProducts: " + products + "\nQuantity: " + quantity + "\nRawMaterials: " + RawMaterials + "\n";
        this.Textarea.appendText(Inventory);

    }



}
