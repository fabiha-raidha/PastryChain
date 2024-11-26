package oop.projectwork_oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SchedulerController {

    @FXML
    private ComboBox<Integer> lineNumCB;

    @FXML
    private TableColumn<Employees, String> categoryCol;

    @FXML
    private ComboBox<String> itemCategoryCB;

    @FXML
    private ComboBox<String> itemNameCB;

    @FXML
    private TableColumn<?, String> itemNameCol;

    @FXML
    private TableColumn<?, String> lineCol;

    @FXML
    private TableColumn<?, Double> quantityCol;

    @FXML
    private Button onUpdateButtonClick;

    @FXML
    private TableView<String> schedulerTable;


    @FXML
    private TextField quantityTF;


    @FXML
    public void initialize() {
        lineNumCB.getItems().addAll(1, 2, 3, 4, 5);
        lineNumCB.setValue(Integer.valueOf("--Select--"));
        itemCategoryCB.getItems().addAll("Cake", "Biscuit", "Bread", "Chocolate", "Spicy");
        itemCategoryCB.setValue("--Select--");
        itemNameCB.getItems().addAll("Cupcake", "Plain cake", "Fruit cake", "Cookies", "Toast", "White Bread", "Brown Bread", "Burger Bun", "Chocolate bar", "Chicken roll", "Sandwich", "Pizza slice");
        itemNameCB.setValue("--Select--");
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Head Chef.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);

    }

    @FXML
    protected void onLogoutButtonClick(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LogIn.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }


    @FXML
    void onUpdateButtonClick(ActionEvent event) {

    }
}
