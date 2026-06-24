import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
        var view_create = getClass().getResource("../scene_create/View.fxml");
        
        var controller_create = new scene_create.Controller();
        var loader = new FXMLLoader();
        loader.setController(controller_create);
        loader.setLocation(view_create);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

}
