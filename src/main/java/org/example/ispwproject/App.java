package org.example.ispwproject;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.ispwproject.Models.Model;


public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
