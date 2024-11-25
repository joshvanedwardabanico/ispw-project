module org.example.ispwproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ispwproject to javafx.fxml;
    exports org.example.ispwproject;
}