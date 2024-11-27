module org.example.ispwproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ispwproject to javafx.fxml;
    exports org.example.ispwproject;
    exports org.example.ispwproject.Controllers;
    exports org.example.ispwproject.Controllers.Client;
    exports org.example.ispwproject.Models;
    exports org.example.ispwproject.Views;


}