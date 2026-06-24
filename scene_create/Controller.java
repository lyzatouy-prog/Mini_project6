package scene_create;

import global.Global;
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

        Global.list.add(name.getText());

        var view_main = getClass().getResource("/scene_main/View.fxml");
        var loader = new FXMLLoader(view_main);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

}
