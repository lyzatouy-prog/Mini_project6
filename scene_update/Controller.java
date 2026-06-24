package scene_update;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    void on_update(ActionEvent event) throws Exception {

        var node = (Button) event.getSource();
        var stage = (Stage) node.getScene().getWindow();


        var view_update = getClass().getResource("scene_update/View.fxml");
        var controller_update = new Controller();
        var loader = new FXMLLoader();

        loader.setLocation(view_update);
        loader.setController(controller_update);
        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();   

    }

    @FXML
    private TextField name;

    @FXML
    private Button save;

    @FXML
    void on_save(ActionEvent event) {

    }

}
