package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

/**
 * Main class which contains all GUI realization and actions.
 *
 * @author Valentin Studenichnik
 */
public class Main extends Application {

    /**
     * Font size of text in text fields.
     */
    private static final int TEXT_FIELD_FONT_SIZE = 14;
/*    /**
     * Maximum text length that you can input.

    private static final int INPUT_FIELD_MAX_TEXT_LENGTH = 55;*/

    /**
     * Font size of text in buttons.
     */
    private static final int BUTTON_FONT_SIZE = 16;
    /**
     * Minimum size of button (square).
     */
    private static final int BUTTON_MIN_SIZE = 35;
    /**
     * Size of image from resources (square).
     */
    private static final int IMAGE_SIZE = 25;
    /**
     * Spacing between labels and text fields inside vBox.
     */
    private static final int INTERNAL_VBOX_SPACING = 3;
    /**
     * Spacing between vBox (labels and text fields)
     * and border pane with buttons.
     */
    private static final int MAIN_VBOX_SPACING = 15;
    /**
     * Maximum width of the main vBox which contains all elements.
     */
    private static final int MAIN_VBOX_MAX_WIDTH = 600;
    /**
     * Maximum height of the main vBox.
     */
    private static final int MAIN_VBOX_MAX_HEIGHT = 50;
    /**
     * Margins of mane pane (root).
     */
    private static final int BORDER_PANE_MARGINS = 10;
    /**
     * Start width of the window.
     */
    private static final int PRIMARY_STAGE_START_WIDTH = 350;
    /**
     * Start height of the window.
     */
    private static final int PRIMARY_STAGE_START_HEIGHT = 250;
    /**
     * Minimum width of the window.
     */
    private static final int PRIMARY_STAGE_MIN_WIDTH = 300;
    /**
     * Minimum height of the window.
     */
    private static final int PRIMARY_STAGE_MIN_HEIGHT = 230;

    /**
     * Start method.
     *
     * @param primaryStage base of the application's window
     */
    @Override
    public final void start(final Stage primaryStage) {

        BorderPane root = new BorderPane();
        primaryStage.setTitle("ReverString");

        VBox vBox1 = new VBox();

        Label inputLabel = new Label("Your string:");
        TextField inputTextField = new TextField();
        inputTextField.setFont(Font.font(TEXT_FIELD_FONT_SIZE));
        Label outputLabel = new Label("Reversed string:");
        TextField outputTextField = new TextField();
        outputTextField.setFont(Font.font(TEXT_FIELD_FONT_SIZE));
        outputTextField.setEditable(false);

        vBox1.setSpacing(INTERNAL_VBOX_SPACING);
        vBox1.getChildren().addAll(inputLabel, inputTextField,
                outputLabel, outputTextField);

        BorderPane borderPane1 = new BorderPane();

        Button reverseButton = new Button("Reverse");
        reverseButton.setMinSize(BUTTON_MIN_SIZE, BUTTON_MIN_SIZE);
        reverseButton.setFont(Font.font(BUTTON_FONT_SIZE));
        Button cleanButton = new Button();
        ImageView cleanIcon = new ImageView(("File:res/clean.png"));
        cleanIcon.setFitHeight(IMAGE_SIZE);
        cleanIcon.setFitWidth(IMAGE_SIZE);
        cleanButton.setMinSize(BUTTON_MIN_SIZE, BUTTON_MIN_SIZE);
        cleanButton.setGraphic(cleanIcon);

        borderPane1.setCenter(reverseButton);
        borderPane1.setRight(cleanButton);

        VBox vBoxMain = new VBox();
        vBoxMain.getChildren().addAll(vBox1, borderPane1);
        vBoxMain.setSpacing(MAIN_VBOX_SPACING);
        vBoxMain.setMaxSize(MAIN_VBOX_MAX_WIDTH, MAIN_VBOX_MAX_HEIGHT);
        BorderPane.setMargin(vBoxMain, new Insets(BORDER_PANE_MARGINS));

        root.setCenter(vBoxMain);

        reverseButton.setOnAction(event ->
                outputTextField.setText(
                        ReverString.reverse(inputTextField.getText())));

        cleanButton.setOnAction(event -> {
            inputTextField.setText(null);
            outputTextField.setText(null);
        });

        inputTextField.setOnMouseClicked(event ->
                inputTextField.selectAll());

        inputTextField.setOnKeyReleased(event -> outputTextField.setText(
                ReverString.reverse(inputTextField.getText())));

        /*inputTextField.setOnKeyPressed(event -> {
            //outputTextField.setText(null);
            outputTextField.setText(
                    ReverString.reverse(inputTextField.getText()));
        });*/

        primaryStage.setScene(new Scene(root, PRIMARY_STAGE_START_WIDTH,
                                              PRIMARY_STAGE_START_HEIGHT));
        primaryStage.setMinWidth(PRIMARY_STAGE_MIN_WIDTH);
        primaryStage.setMinHeight(PRIMARY_STAGE_MIN_HEIGHT);
        primaryStage.show();
    }

    /**
     * Main method. Start the program.
     *
     * @param args arguments for launching
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
