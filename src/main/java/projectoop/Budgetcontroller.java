package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class Budgetcontroller {

    @javafx.fxml.FXML

    private TextField materialstextfield;
    @javafx.fxml.FXML
    private TableColumn<Budget,Integer> budgetcolumn;
    @javafx.fxml.FXML
    private TextField Budgettextfield;
    @javafx.fxml.FXML
    private TableColumn<Budget,String> materialscolumn;
    @javafx.fxml.FXML
    private TableView<Budget> tableview;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;
    @javafx.fxml.FXML
    private TableColumn<Budget,String> timeframecolumn;

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent)throws IOException {

    }
    @FXML
    void initialize(){
        this.combobox.getItems().addAll(new String[]{"Monthly","Quataerly","Yearly"});
        materialscolumn.setCellValueFactory(new PropertyValueFactory<Budget, String>("Materials"));
        budgetcolumn.setCellValueFactory(new PropertyValueFactory<Budget,Integer>("Budget"));
        timeframecolumn.setCellValueFactory(new PropertyValueFactory<Budget, String>("Timeframe"));

    }

    @javafx.fxml.FXML
    public void showreportOnActionButton(ActionEvent actionEvent) {
        String Materials = this.materialstextfield.getText();
        Integer Budget = Integer.valueOf(this.Budgettextfield.getText());
        String Timeframe = (String) this.combobox.getValue();
        Budget budget= new Budget(Materials,Budget,Timeframe);
        this.tableview.getItems().add(budget);
    }
}