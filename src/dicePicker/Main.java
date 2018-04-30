package dicePicker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("dicePicker.fxml"));

        stage.setTitle("Simple Dice Roller");
        Scene scene = new Scene (root, 300, 275);
        stage.setScene(scene);
        stage.show();
    }

}
