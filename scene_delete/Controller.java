
package scene_delete;

import global.Global;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    void on_no(ActionEvent event) throws Exception {
      System.out.println("scene_delete.Controller.on_no called");
      var node = (Node) event.getSource();
      var stage = (Stage) node.getScene().getWindow();

      var view_main = getClass().getResource("/scene_main/View.fxml");

      var loader = new javafx.fxml.FXMLLoader();
      loader.setLocation(view_main);

      var scene = new Scene(loader.load());
      stage.setScene(scene);
      stage.show();

    }

    @FXML
    void on_yes(ActionEvent event) throws Exception {
        System.out.println("scene_delete.Controller.on_yes called");

        if (Global.selected_index >= 0 && Global.selected_index < Global.list.size()) {
            Global.list.remove(Global.selected_index);
            Global.selected_index = -1;
        }

        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();

        var view_main = getClass().getResource("/scene_main/View.fxml");

        var loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(view_main);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

}
