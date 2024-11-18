package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class CityController {

    @FXML
    ImageView imageView;

    @FXML
    Label locationLabel;

    @FXML
    Label dateLabel;

    @FXML
    Label descriptionLabel;

    @FXML
    Label revisedDescriptionLabel;

    @FXML
    Hyperlink hyperLinkReference;

    public void handleCloseButton(){
        Stage stage = (Stage)imageView.getScene().getWindow();
        stage.close();
    }
    public void initData(Constants.Event eventIndex){
        String[] data = Constants.HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        imageView.setImage(event.getImage());
        locationLabel.setText(event.getLocation());
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDecriptionLabel.setText(event.getRevisedDescription());
        hyperLinkReference.setText(event.getCitation());

    }
}
