package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import oop.projectwork_oop.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class TrainingSchedulecontroller {


    @javafx.fxml.FXML
    private ComboBox<String> drivercombobox;
    @javafx.fxml.FXML
    private Label trainingscheduleLabel;
    @javafx.fxml.FXML
    private TextArea textarea;
    @javafx.fxml.FXML
    private Label driverLabel;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private Label Datelabel;

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
        this.drivercombobox.getItems().addAll(new String[]{"Kamal", "Shahid", "Rubel", "Fahad", "Siam"});


    }

    @javafx.fxml.FXML
    public void scheduletrainingOnActionButton(ActionEvent actionEvent) {
        String Driver = (String)this.drivercombobox.getValue();
        String Date = ((LocalDate)this.datepicker.getValue()).toString();
        String TrainingSchedule= "Training Schedule:\n Drivers: " + Driver + "\n Dates" +Date+ "\n";
        this.textarea.appendText(TrainingSchedule);
    }
}
