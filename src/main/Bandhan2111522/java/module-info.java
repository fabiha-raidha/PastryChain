module com.chainpastryshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chainpastryshop to javafx.fxml;
    exports com.chainpastryshop;
}