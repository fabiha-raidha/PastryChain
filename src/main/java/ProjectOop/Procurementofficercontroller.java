import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;


@FXML
        private Label Labelforshowingmcg;

        @FXML
        private Label ProcurementOfficerLabel;

        @FXML
        private void BudgetOnActionButton(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Budget.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.setTitle("Budget");
            stage.show();
        }



        @FXML
        private void InventoryOnActionButton(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inventory.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.setTitle("Inventory");
            stage.show();
        }


        @FXML
        private void SupplierAuditOnActionButton(ActionEvent event)throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SupplierAudit.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.setTitle("Audit");
            stage.show();
        }


        @FXML
        private void SupplierManagementOnActionButton(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SupplierManagement.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.setTitle("Management");
            stage.show();
        }


        @FXML
        private void SupplierOnActionButton(ActionEvent event) throws IOException{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Supplier.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.setTitle("Supplier");
            stage.show();
        }


        @FXML
        private void logoutOnActionButton(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
        }

public void main() {
}




