package org.example.ispwproject.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import org.example.ispwproject.Models.Model;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    public TextField usernameTextField;
    public TextField passwordTextField;
    public Button login_btn;
    public Label errorLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> Model.getInstance().getViewFactory().showClientWindow());
    }
}

