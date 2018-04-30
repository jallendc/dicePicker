package dicePicker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    private ObservableList<numFaces> dieChoiceList = FXCollections
            .observableArrayList(new numFaces(4), new numFaces(6), new numFaces(8),
                    new numFaces(10), new numFaces(12), new numFaces(20), new numFaces(100));

    private class numFaces
    {
        int amount;

        @Override
        public String toString()
        {
            return "d" + amount;
        }

        private numFaces(int amount)
        {
            this.amount = amount;
        }
    }

    @FXML
    private ChoiceBox<numFaces> dieChoiceBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dieChoiceBox.setItems(dieChoiceList);

    }

    @FXML
    private Text actiontarget;

    @FXML
    protected void handleRollButtonAction(ActionEvent event) {
        actiontarget.setText("Roll is " + roll((dieChoiceBox.getValue()).amount));
    }


    private int roll(int faces) {
        return 1 + new Random().nextInt(faces);
    }

    @FXML
    private TextField pickles;

    @FXML
    private Text pickletarget;

    @FXML
    protected void handlePickleButtonAction(ActionEvent event) {
        pickletarget.setText(pickles.getText());

        System.out.println(pickletarget);
    }



}


