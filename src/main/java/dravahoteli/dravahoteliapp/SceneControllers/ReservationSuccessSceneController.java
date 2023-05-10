package dravahoteli.dravahoteliapp.SceneControllers;

import dravahoteli.dravahoteliapp.Entities.Stranka;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservationSuccessSceneController {

    @FXML
    private BorderPane paneHotelListView;
    private Stranka currentUser;

    @FXML
    void checkReceipt(ActionEvent event) {

    }

    @FXML
    public void switchToMainMenuScene(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenuScene.fxml"));
        Parent root = loader.load();

        MainMenuSceneController mainMenuSceneController = loader.getController();
        // Pass current signed-in user to the next controller (keeping track of the session user)
        mainMenuSceneController.onSwitchScene(currentUser);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("dravahoteli/dravahoteliapp/css/style.css");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void userHelp(ActionEvent event) {

    }

    public void onSwitchScene(Stranka currentUser) {
        this.currentUser = currentUser;
    }

    public void switchToLoginScene(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScene.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("dravahoteli/dravahoteliapp/css/style.css");
        stage.setScene(scene);
        stage.show();
    }
}
