//No. 3
package izzaa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class TextReader extends Application {

    private Stage stage;
    BufferedReader reader;
    FileReader file;
    TextArea txtArea;
    Button selectBtn;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Read Text File");

        VBox vbox = new VBox();
       
        selectBtn = new Button("Select First File");
        selectBtn.setFont(Font.font("Kai", FontWeight.BOLD, 13));
        selectBtn.setStyle(
                "-fx-text-fill: #F4D7BE; -fx-faint-focus-color: #E8C8AC22; -fx-focus-color: #E8C8AC; -fx-body-color: #956C47; -fx-background-color: -fx-faint-focus-color, -fx-focus-color, -fx-body-color; -fx-background-insets: -3, -1.3, 0.1, 0.3; -fx-background-radius: 7, 6, 4, 3;");
        txtArea = new TextArea();
        txtArea.setMinSize(100, 500);
        txtArea.setEditable(false);
        txtArea.setStyle(
                "-fx-text-fill: #2F1906; -fx-control-inner-background: #F8E1CD; -fx-focus-color: #E8C8AC; -fx-faint-focus-color: #E8C8AC22; -fx-text-box-border: #875B35; ");
        
        selectBtn.setOnAction(e -> fileChooser());
        vbox.getChildren().addAll(selectBtn, txtArea);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.setSpacing(15);


        Pane pane = new Pane();
        pane.getChildren().add(vbox);
        pane.setStyle("-fx-background-color: #D2B092;");
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private void fileChooser() {
        selectBtn.setDisable(true);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resume");
        fileChooser.setInitialDirectory(new File("."));
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            try {
                file = new FileReader(selectedFile);
                reader = new BufferedReader(file);

            } catch (IOException ioe) {
                errorMessage(ioe.getMessage());
            }
        } else {
            Alert warningBox = new Alert(AlertType.WARNING);
            warningBox.setTitle("Error loading file");
            warningBox.setHeaderText(null);
            warningBox.setContentText("Please select a file");
            warningBox.showAndWait();
            selectBtn.setDisable(false);
            
        }

        txtArea.setText("");
      
        try {
            String s1;
            while ((s1 = reader.readLine()) != null) {
                // String output = s1;
                // System.out.println(s1);
                txtArea.appendText(s1 + "\n");
                selectBtn.setDisable(false);
            }


        } catch (IOException ioe) {
            errorMessage(ioe.getMessage());
        }

        
    }

    private void errorMessage(String msg) {
        Alert alertBox = new Alert(AlertType.ERROR);
        alertBox.setTitle("Error");
        alertBox.setHeaderText(null);
        alertBox.setContentText(msg);
        alertBox.showAndWait();
    }

}