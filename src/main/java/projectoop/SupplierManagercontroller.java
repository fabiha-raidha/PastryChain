package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class SupplierManagercontroller {
    @javafx.fxml.FXML

    private TableColumn<SupplierManager,String> newpricecolumn;
    @javafx.fxml.FXML
    private ComboBox<String> Materialscombobox;
    @javafx.fxml.FXML
    private ComboBox<String> Pricingcombobox;
    @javafx.fxml.FXML
    private TableColumn<SupplierManager,String> pricingcolumn;
    @javafx.fxml.FXML
    private TableView<SupplierManager> tableview;
    @javafx.fxml.FXML
    private Label proposenewpriveLabel;
    @javafx.fxml.FXML
    private TableColumn<SupplierManager,String> Materialscolumn;
    @javafx.fxml.FXML
    private ComboBox<String> Proposecombobox;

    @javafx.fxml.FXML
    public void logoutOnActionButton(ActionEvent actionEvent) throws IOException {
    }
    @FXML
    void initialize(){
        this.Materialscombobox.getItems().addAll(new String[]{"Flour", "Sugar", "Chocolate", "Butter","Milk","Eggs"});
        this.Pricingcombobox.getItems().addAll(new String[]{"1000", "2000", "3000", "4000","5000","6000"});
        this.Proposecombobox.getItems().addAll(new String[]{"1000", "1500", "2800", "3850","4900","5700"});
        Materialscolumn.setCellValueFactory(new PropertyValueFactory<SupplierManager, String>("Materials"));
        pricingcolumn.setCellValueFactory(new PropertyValueFactory<SupplierManager, String>("Pricing"));
        newpricecolumn.setCellValueFactory(new PropertyValueFactory<SupplierManager, String>("Newprice"));


    }

    @javafx.fxml.FXML
    public void sendproposalOnActionButton(ActionEvent actionEvent) throws IOException{

        String Materialsname = (String)this.Materialscombobox.getValue();
        String Pricing = (String)this.Pricingcombobox.getValue();
        String Newprice = (String)this.Proposecombobox.getValue();
        SupplierManager supplierManager= new SupplierManager(Materialsname,Pricing,Newprice);
        this.tableview.getItems().add(supplierManager);
    }
}
