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
    private TextField name;

    @FXML
    private Button save;

    @FXML
    void on_save(ActionEvent event) {
        System.out.println("scene_update.Controller.on_save called");
        try {
            var stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            var view_main = getClass().getResource("/scene_main/View.fxml");
            System.out.println("scene_update: view_main URL = " + view_main);
            var loader = new FXMLLoader(view_main);
            var scene = new Scene(loader.load());
            System.out.println("scene_update: main FXML loaded");
            stage.setScene(scene);
            stage.show();
            System.out.println("scene_update: switched to main scene");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
