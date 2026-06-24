
package scene_delete;


import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    void on_no(ActionEvent event) {

    }

    @FXML
    void on_yes(ActionEvent event) throws Exception {

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
