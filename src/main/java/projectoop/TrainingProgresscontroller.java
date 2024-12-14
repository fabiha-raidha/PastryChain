package projectoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class TrainingProgresscontroller {

    @javafx.fxml.FXML
    private TableColumn<TrainingProgress,String> DriverNcolumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgress,String> Attendancecolumn;
    @javafx.fxml.FXML
    private TableView<TrainingProgress> tableview;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;
    @javafx.fxml.FXML
    private TextField DriversNTF;

    @javafx.fxml.FXML
    public void LogoutOnActionButton(ActionEvent actionEvent)throws IOException {

    }
    @FXML
    void initialize(){
        this.combobox.getItems().addAll(new String[]{"yes","No"});
        DriverNcolumn.setCellValueFactory(new PropertyValueFactory<TrainingProgress, String>("Drivers Name"));
        Attendancecolumn.setCellValueFactory(new PropertyValueFactory<TrainingProgress, String>("Attendance"));

    }

    @javafx.fxml.FXML
    public void viewprogressOnActionButton(ActionEvent actionEvent) {

        String DriversName = DriversNTF.getText();
        String Attendance=combobox.getValue();

        TrainingProgress trainingProgress = new TrainingProgress(DriversName, Attendance);
        this.tableview.getItems().add(trainingProgress);



    }
}
