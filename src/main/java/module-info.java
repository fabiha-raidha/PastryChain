module oop.projectwork_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.projectwork_oop to javafx.fxml;
    exports oop.projectwork_oop;
}