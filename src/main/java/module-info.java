module com.example.lab3javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab3javafx to javafx.fxml;
    exports com.example.lab3javafx;
    exports com.example.lab3javafx.controllers;
    opens com.example.lab3javafx.controllers to javafx.fxml;
}