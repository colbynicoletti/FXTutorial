package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLTableView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml_tableview.fxml"));
        primaryStage.setTitle("FXML TableView Example");

        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource
                ("fxml_tableview.fxml"));

        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
