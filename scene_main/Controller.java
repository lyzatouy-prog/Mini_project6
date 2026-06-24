package scene_main;

import java.nio.file.Files;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label label_status;

    @FXML
    private ListView<String> list_view;

    @FXML
    void on_create(ActionEvent event) {
        
    }

    @FXML
    void on_delete(ActionEvent event) throws Exception {

        var stage = (Stage) label_status.getScene().getWindow();

        var view_delete = getClass().getResource("/scene_delete/View.fxml");
        var controller_delete = new scene_delete.Controller();

        var loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(view_delete);
        loader.setController(controller_delete);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void on_read(ActionEvent event) throws Exception {

        // object that help to choose file

        var stage = (Stage) label_status.getScene().getWindow();
        var  file_chooser = new javafx.stage.FileChooser();
        var file = file_chooser.showOpenDialog(stage);


        var data = new ArrayList<String>();
        for (var line : Files.readAllLines(file.toPath())) {
            data.add((String) line);
        }

        list_view.getItems().addAll(data);

    }

    @FXML
    void on_update(ActionEvent event) {

    }

    @FXML
    void initialize() {

        var data = new ArrayList<String>();
        // add data to list view
        list_view.getItems().addAll(data);

    }

}
