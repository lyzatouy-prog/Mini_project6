package scene_main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label label_status;

    @FXML
    private ListView<?> list_view;

    @FXML
    void on_create(ActionEvent event) {

    }

    @FXML
    void on_delete(ActionEvent event) {

    }

    @FXML
    void on_read(ActionEvent event) {
        // object that help to choose file
        var stage = (Stage) label_status.getScene().getWindow();
        var  file_chooser = new javafx.stage.FileChooser();
        var file = file_chooser.showOpenDialog(stage);
    }

    @FXML
    void on_update(ActionEvent event) {

    }

}
