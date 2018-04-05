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
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        primaryStage.setTitle("ReverString");

        VBox vBox1 = new VBox();

        Label inputLabel = new Label("Your string:");
        TextField inputTextField = new TextField();
        inputTextField.setFont(Font.font(14));
        Label outputLabel = new Label("Reversed string:");
        TextField outputTextField = new TextField();
        outputTextField.setFont(Font.font(14));
        outputTextField.setEditable(false);

        vBox1.setSpacing(3);
        vBox1.getChildren().addAll(inputLabel, inputTextField, outputLabel, outputTextField);

        BorderPane borderPane1 = new BorderPane();

        Button reverseButton = new Button("Reverse");
        reverseButton.setMinSize(35,35);
        reverseButton.setFont(Font.font(16));
        Button cleanButton = new Button();
        //Image image = new Image(getClass().getResourceAsStream("File:res/clean.png"));
        //ImageView cleanIcon = new ImageView(getClass().getResourceAsStream("File:res/clean.png"));
        cleanButton.setMinSize(35,35);

        borderPane1.setCenter(reverseButton);
        borderPane1.setRight(cleanButton);

        VBox vBoxMain = new VBox();
        vBoxMain.getChildren().addAll(vBox1, borderPane1);
        vBoxMain.setSpacing(15);
        vBoxMain.setMaxSize(600, 50);
        BorderPane.setMargin(vBoxMain, new Insets(10,10,10,10));

        root.setCenter(vBoxMain);

        reverseButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                outputTextField.setText(new StringBuilder(inputTextField.getText()).reverse().toString());
            }
        });

        cleanButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputTextField.setText(null);
                outputTextField.setText(null);
            }
        });

        inputTextField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                inputTextField.selectAll();
            }
        });

        inputTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                outputTextField.setText(null);
            }
        });

        primaryStage.setScene(new Scene(root, 350, 250));
        primaryStage.setMinHeight(230);
        primaryStage.setMinWidth(300);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
