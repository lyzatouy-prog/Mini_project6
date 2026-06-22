
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scene_main.Controller;

public class Main extends Application {
    @Override
    public void start(Stage Stage) throws Exception{
        var view_main = getClass().getResource("scene_main/View.fxml");
        var loader = new FXMLLoader();
        loader.setLocation(view_main);

        var scene = new Scene(loader.load());

        Stage.setScene(scene);
        Stage.show();
    }
}
