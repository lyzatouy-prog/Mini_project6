package scene_update;

import global.Global;
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
    void initialize() {
        if (Global.selected_index >= 0 && Global.selected_index < Global.list.size()) {
            name.setText(Global.list.get(Global.selected_index));
        }
    }

    @FXML
    void on_save(ActionEvent event) {
        System.out.println("scene_update.Controller.on_save called");
        if (Global.selected_index >= 0 && Global.selected_index < Global.list.size()) {
            Global.list.set(Global.selected_index, name.getText());
            Global.selected_index = -1;
        }

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
