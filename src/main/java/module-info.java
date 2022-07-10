module com.example.c3201227 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.c3201227 to javafx.fxml;
    exports com.example.c3201227;
}