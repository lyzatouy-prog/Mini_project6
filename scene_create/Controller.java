package scene_create;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextField name;

    @FXML
    private Button save;

    @FXML
    void on_save(ActionEvent event) throws Exception{
        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();

        var view_main = getClass().getResource("/scene_main/View.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(view_main);
        loader.setController(controller_main);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

}
