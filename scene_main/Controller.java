package scene_main;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.ResourceBundle;

import global.Global;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label label_status;

    @FXML
    private ListView<String> list_view;

    @FXML
    void on_create(ActionEvent event) throws Exception {
        var node = (Node) event.getSource();
        var stage = (Stage) label_status.getScene().getWindow();
        var view_create = getClass().getResource("/scene_create/View.fxml");

        var controller_create = new scene_create.Controller();
        var loader = new FXMLLoader();
        loader.setController(controller_create);
        loader.setLocation(view_create);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    void on_delete(ActionEvent event) throws Exception {

        var selected_index = list_view.getSelectionModel().getSelectedItem();
        System.out.println("selected index: " + selected_index);

        if (selected_index == -1) {
            return;
        }
        // var node = (Node) event.getSource();
        // var stage = (Stage) label_status.getScene().getWindow();
        // var view_create = getClass().getResource("/scene_delete/View.fxml");

        // var controller_delete = new scene_delete.Controller();
        // var loader = new FXMLLoader();
        // loader.setController(controller_delete);
        // loader.setLocation(view_create);

        // var scene = new Scene(loader.load());

        // stage.setScene(scene);
        // stage.show();
        
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
        };

        list_view.getItems().addAll(data);

    }

    @FXML
    void on_update(ActionEvent event) {

        System.out.println("scene_main.Controller.on_update called");

        try {
            var stage = (Stage) label_status.getScene().getWindow();

            var view_update = getClass().getResource("/scene_update/View.fxml");
            System.out.println("view_update URL: " + view_update);
            var loader = new FXMLLoader(view_update);

            var scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void initialize() {

        list_view.getItems().addAll(Global.list);

    }

}
