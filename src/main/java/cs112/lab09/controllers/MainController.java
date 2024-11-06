package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MainController {
    @FXML
    Label titleLabel;

    @FXML
    Label subtitleLabel;

    @FXML
    Label descriptionLabel;

    @FXML
    ImageView imageView;
    public void handleStartButton(){
    }

    public void handleExitButton(){
        System.exit(0);
    }

    public void initialize(){
        titleLabel.setText(MAIN_TITLE);
        subtitleLabel.setText(MAIN_SUBTITLE);
        descriptionLabel.setText(MAIN_DESCRIPTION);
        imageView.setImage(new Image(REDSUMMER_IMAGE_PATH));

    }
}