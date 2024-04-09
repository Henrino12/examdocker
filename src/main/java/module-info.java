module com.example.examendevops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examendevops to javafx.fxml;
    exports com.example.examendevops;
}