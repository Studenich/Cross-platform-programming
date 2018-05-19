package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Main class which contains all GUI realization and actions.
 *
 * @author Valentin Studenichnik
 */
public class Main extends Application {

    /**
     * Maximum width of button.
     */
    private static final int MAX_BUTTON_WIDTH = 100;

    /**
     * Start method.
     *
     * @param primaryStage base of the application's window
     */
    @Override
    public void start(final Stage primaryStage) {
        Company company = new Company();
        BorderPane root = new BorderPane();
        primaryStage.setTitle("Successful IT Company");

        //Company
        Button addDirector = new Button("Add director");
        addDirector.setMinWidth(MAX_BUTTON_WIDTH);
        Button addCoder = new Button("Add coder");
        addCoder.setMinWidth(MAX_BUTTON_WIDTH);
        Button addCleaner = new Button("Add cleaner");
        addCleaner.setMinWidth(MAX_BUTTON_WIDTH);
        Button paySalary = new Button("Pay salary");
        paySalary.setDisable(true);
        paySalary.setMinWidth(MAX_BUTTON_WIDTH);
        VBox companyVBox1 = new VBox();
        companyVBox1.setSpacing(10);
        companyVBox1.getChildren().addAll(addDirector, addCoder,
                addCleaner, paySalary);

        Label companyLabel = new Label("Company");
        companyLabel.setFont(Font.font("Arial", 18));
        VBox companyVBox2 = new VBox();
        companyVBox2.setSpacing(25);
        companyVBox2.setMaxSize(100, 200);
        companyVBox2.getChildren().addAll(companyLabel, companyVBox1);
        BorderPane companyBorderPane = new BorderPane();
        companyBorderPane.setMinSize(140, 220);
        companyBorderPane.setStyle("-fx-border-color: #BBBBBB;");
        companyBorderPane.setCenter(companyVBox2);

        //Director
        Button addProblem = new Button("Add problem");
        addProblem.setDisable(true);
        addProblem.setMinWidth(MAX_BUTTON_WIDTH);
        Button rewardCoder = new Button("Reward coder");
        rewardCoder.setDisable(true);
        rewardCoder.setMinWidth(MAX_BUTTON_WIDTH);
        Label directorCash = new Label("Director cash:");
        Label directorCashValue = new Label("0");
        HBox directorCashHBox = new HBox();
        directorCashHBox.setSpacing(3);
        directorCashHBox.getChildren().addAll(directorCash, directorCashValue);
        VBox directorVBox1 = new VBox();
        directorVBox1.setSpacing(10);
        directorVBox1.getChildren().addAll(addProblem, rewardCoder, directorCashHBox);

        Label directorLabel = new Label("Director " + "[" + String.valueOf(Company.DEFAULT_DIRECTOR_SALARY) + "]");
        directorLabel.setFont(Font.font("Arial", 18));
        VBox directorVBox2 = new VBox();
        directorVBox2.setSpacing(25);
        directorVBox2.setMaxSize(100, 200);
        directorVBox2.getChildren().addAll(directorLabel, directorVBox1);
        BorderPane directorBorderPane = new BorderPane();
        directorBorderPane.setMinSize(140, 220);
        directorBorderPane.setStyle("-fx-border-color: #BBBBBB;");
        directorBorderPane.setCenter(directorVBox2);

        //Coder
        Button solveProblem = new Button("Solve problem");
        solveProblem.setDisable(true);
        solveProblem.setMinWidth(MAX_BUTTON_WIDTH);
        Button askForRaise = new Button("Ask for a raise");
        askForRaise.setDisable(true);
        askForRaise.setMinWidth(MAX_BUTTON_WIDTH);
        Label coderCash = new Label("Coder cash:");
        Label coderCashValue = new Label("0");
        HBox coderCashHBox = new HBox();
        coderCashHBox.setSpacing(3);
        coderCashHBox.getChildren().addAll(coderCash, coderCashValue);
        Label solvedProblems = new Label("Solved:");
        Label solvedProblemsValue = new Label("0");
        HBox solvedProblemsHBox = new HBox();
        solvedProblemsHBox.setSpacing(3);
        solvedProblemsHBox.getChildren().addAll(solvedProblems, solvedProblemsValue);
        VBox coderVBox1 = new VBox();
        coderVBox1.setSpacing(10);
        coderVBox1.getChildren().addAll(solveProblem, askForRaise, coderCashHBox, solvedProblemsHBox);

        Label coderLabel = new Label("Coder " + "[" + String.valueOf(Company.DEFAULT_CODER_SALARY) + "]");
        coderLabel.setFont(Font.font("Arial", 18));
        VBox coderVBox2 = new VBox();
        coderVBox2.setSpacing(25);
        coderVBox2.setMaxSize(100, 200);
        coderVBox2.getChildren().addAll(coderLabel, coderVBox1);
        BorderPane coderBorderPane = new BorderPane();
        coderBorderPane.setMinSize(140, 220);
        coderBorderPane.setStyle("-fx-border-color: #BBBBBB;");
        coderBorderPane.setCenter(coderVBox2);

        //Cleaner
        Button clean = new Button("Clean");
        clean.setDisable(true);
        clean.setMinWidth(MAX_BUTTON_WIDTH);
        Label cleanerCash = new Label("Cleaner cash:");
        Label cleanerCashValue = new Label("0");
        HBox cleanerCashHBox = new HBox();
        cleanerCashHBox.setSpacing(3);
        cleanerCashHBox.getChildren().addAll(cleanerCash, cleanerCashValue);
        VBox cleanerVBox1 = new VBox();
        cleanerVBox1.setSpacing(10);
        cleanerVBox1.getChildren().addAll(clean, cleanerCashHBox);

        Label cleanerLabel = new Label("Cleaner " + "[" + String.valueOf(Company.DEFAULT_CLEANER_SALARY) + "]");
        cleanerLabel.setFont(Font.font("Arial", 18));
        VBox cleanerVBox2 = new VBox();
        cleanerVBox2.setSpacing(25);
        cleanerVBox2.setMaxSize(100, 200);
        cleanerVBox2.getChildren().addAll(cleanerLabel, cleanerVBox1);
        BorderPane cleanerBorderPane = new BorderPane();
        cleanerBorderPane.setMinSize(140, 220);
        cleanerBorderPane.setStyle("-fx-border-color: #BBBBBB;");
        cleanerBorderPane.setCenter(cleanerVBox2);

        HBox mainHBox = new HBox();
        mainHBox.setSpacing(35);
        mainHBox.setMaxSize(450, 400);
        mainHBox.getChildren().addAll(companyBorderPane, directorBorderPane,
                                      coderBorderPane, cleanerBorderPane);
        BorderPane botBorderPane = new BorderPane();
        botBorderPane.setCenter(mainHBox);

        Label problemCountText = new Label("Count of problems:");
        problemCountText.setFont(Font.font(20));
        Label problemCountInt = new Label("0");
        problemCountInt.setFont(Font.font(20));
        HBox problemHBox = new HBox();
        problemHBox.setSpacing(15);
        problemHBox.getChildren().addAll(problemCountText, problemCountInt);

        Label companyName = new Label("Successful IT Company");
        companyName.setFont(Font.font(35));
        VBox topVBox = new VBox();
        topVBox.setSpacing(5);
        topVBox.getChildren().addAll(companyName, problemHBox);
        topVBox.setMaxSize(370, 200);
        BorderPane topBorderPane = new BorderPane();
        topBorderPane.setCenter(topVBox);

        VBox mainVBox = new VBox();
        mainVBox.setSpacing(30);
        mainVBox.getChildren().addAll(topBorderPane, botBorderPane);
        mainVBox.setMaxSize(800, 200);

        addDirector.setOnAction(event -> {
            addProblem.setDisable(false);
            rewardCoder.setDisable(false);
            paySalary.setDisable(false);
            company.addDirector();
            addDirector.setDisable(true);
        });

        addCoder.setOnAction(event -> {
            askForRaise.setDisable(false);
            paySalary.setDisable(false);
            company.addCoder();
            addCoder.setDisable(true);
        });

        addCleaner.setOnAction(event -> {
            clean.setDisable(false);
            paySalary.setDisable(false);
            company.addCleaner();
            addCleaner.setDisable(true);
        });

        addProblem.setOnAction(event -> {
            company.addProblem();
            solveProblem.setDisable(false);
            problemCountInt.setText(company.problemCount());
        });

        solveProblem.setOnAction(event -> {
            if (company.solveProblem() == 0) {
                solveProblem.setDisable(true);
            }
            solvedProblemsValue.setText(String.valueOf(company.getCoderSolvedProblems()));
            problemCountInt.setText(company.problemCount());
        });

        askForRaise.setOnAction(event -> {
            int newSalary = company.increaseCoderSalary();
            coderLabel.setText("Coder " + "[" + String.valueOf(newSalary) + "]");
            solvedProblemsValue.setText("0");
        });

        paySalary.setOnAction(event -> {
            int oldDirectorCash = Integer.parseInt(directorCashValue.getText());
            directorCashValue.setText(String.valueOf(oldDirectorCash + company.getDirectorSalary()));
            int oldCoderCash = Integer.parseInt(coderCashValue.getText());
            coderCashValue.setText(String.valueOf(oldCoderCash + company.getCoderSalary()));
            int oldCleanerCash = Integer.parseInt(cleanerCashValue.getText());
            cleanerCashValue.setText(String.valueOf(oldCleanerCash + company.getCleanerSalary()));
        });

        rewardCoder.setOnAction(event -> {
            int oldCoderCash = Integer.parseInt(coderCashValue.getText());
            coderCashValue.setText(String.valueOf(oldCoderCash + company.DEFAULT_AWARD));
        });

        clean.setOnAction(event -> company.clean());

        root.setCenter(mainVBox);
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.setMinWidth(720);
        primaryStage.setMinHeight(390);
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
