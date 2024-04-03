module com.example.demo4strukdat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo4strukdat to javafx.fxml;
    exports com.example.demo4strukdat;
}