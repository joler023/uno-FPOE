package org.example.eiscuno.model.Alert;

import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;

public class AlertWinner implements IAlertWinner {
    @Override
public void showMessageWinner(String title, String header, String content) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);

    // Customizing the alert dialog
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #ff0000, #ffa500); -fx-font-weight: bold; -fx-font-size: 16px; -fx-text-fill: white; -fx-alignment: center;");

    alert.showAndWait();
}
}


