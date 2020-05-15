//No. 2
package izzaa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StudentData extends Application {

    private GridPane grid1;
    private RadioButton klp1, klp2, klp3, klp4, lk, pr;
    private TextField nim, nama;
    private ToggleGroup group, group2;

    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Student Data");
        grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10, 10, 10));
        grid1.setVgap(5);
        grid1.setHgap(8);

        Rectangle leftControl = new Rectangle(50, 100, 315, 150);
        leftControl.setStroke(Color.web("#639a67"));
        leftControl.setStrokeWidth(2);
        leftControl.setFill(Color.TRANSPARENT);

        Rectangle rightControl = new Rectangle(50, 100, 315, 150);
        rightControl.setStroke(Color.web("#639a67"));
        rightControl.setStrokeWidth(2);
        rightControl.setFill(Color.TRANSPARENT);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(leftControl, rightControl);
        hbox.setSpacing(7);
        hbox.setAlignment(Pos.CENTER);

        //Left side
        Label kelompok = new Label("Kelompok");
        kelompok.setTextFill(Color.web("#71bde1"));
        kelompok.setFont(Font.font("Gill Sans", FontWeight.EXTRA_BOLD, 13));
        grid1.add(kelompok, 1, 12);

        group = new ToggleGroup();
        klp1 = new RadioButton("Kelompok 1");
        klp2 = new RadioButton("Kelompok 2");
        klp3 = new RadioButton("Kelompok 3");
        klp4 = new RadioButton("Kelompok 4");
        klp1.setToggleGroup(group);
        klp2.setToggleGroup(group);
        klp3.setToggleGroup(group);
        klp4.setToggleGroup(group);
        klp1.setStyle("-fx-text-fill: #71bde1; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722;");
        klp1.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        klp2.setStyle("-fx-text-fill: #71bde1; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722;");
        klp2.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        klp3.setStyle("-fx-text-fill: #71bde1; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722;");
        klp3.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        klp4.setStyle("-fx-text-fill: #71bde1; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722;");
        klp4.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        grid1.add(klp1, 0, 13);
        grid1.add(klp2, 2, 13);
        grid1.add(klp3, 0, 14);
        grid1.add(klp4, 2, 14);

        //Right side
        Label data = new Label("   Data");
        data.setTextFill(Color.web("#71bde1"));
        data.setFont(Font.font("Gill Sans", FontWeight.EXTRA_BOLD, 13));
        grid1.add(data, 14, 12);

        Label nimLabel = new Label("NIM");
        nim = new TextField();
        nim.setPromptText("Masukkan NIM Anda");
        Label nameLabel = new Label("Nama");
        nama = new TextField();
        nama.setPromptText("Masukkan Nama Anda");
        Label gender = new Label("Jenis Kelamin");
        group2 = new ToggleGroup();
        lk = new RadioButton("Laki - Laki");
        pr = new RadioButton("Perempuan");

        nimLabel.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        nimLabel.setTextFill(Color.web("#71bde1"));
        nameLabel.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        nameLabel.setTextFill(Color.web("#71bde1"));
        gender.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        gender.setTextFill(Color.web("#71bde1"));
        
        nim.setPrefWidth(160);
        nama.setPrefWidth(160);
        nim.setStyle("-fx-text-fill: #65A6C4; -fx-control-inner-background: #DBF0E4; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722; -fx-text-box-border: #538156; ");
        nama.setStyle("-fx-text-fill: #65A6C4; -fx-control-inner-background: #DBF0E4; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722; -fx-text-box-border: #538156; ");
        
        lk.setToggleGroup(group2);
        pr.setToggleGroup(group2);
        lk.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        lk.setStyle("-fx-text-fill: #71bde1; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722;");
        pr.setFont(Font.font("Gill Sans", FontWeight.BOLD, 12));
        pr.setStyle("-fx-text-fill: #71bde1; -fx-focus-color: #639a67; -fx-faint-focus-color: #639a6722;");
        
        grid1.add(nimLabel, 11, 13);
        grid1.add(nim, 14, 13);
        grid1.add(nameLabel, 11, 14);
        grid1.add(nama, 14, 14);
        grid1.add(gender, 11, 15);
        grid1.add(lk, 14, 15);
        grid1.add(pr, 14, 16);

        Button saveBtn = new Button("SAVE");
        saveBtn.setFont(Font.font("Gill Sans", FontWeight.EXTRA_BOLD, 13));
        saveBtn.setStyle(
                "-fx-text-fill: #d1f5d3; -fx-faint-focus-color: #639a6722; -fx-focus-color: #cbe2b0; -fx-body-color: #649d66; -fx-background-color: -fx-faint-focus-color, -fx-focus-color, -fx-body-color; -fx-background-insets: -3, -1.3, 0.1, 0.3; -fx-background-radius: 7, 6, 4, 3;");
        saveBtn.setOnMouseClicked(e -> {
            if (klp1.isSelected() == false && klp2.isSelected() == false && klp3.isSelected() == false
                    && klp4.isSelected() == false || nim.getText().isEmpty() || nama.getText().isEmpty()
                    ||lk.isSelected() == false && pr .isSelected() == false) {
                Alert warningBox = new Alert(AlertType.WARNING);
                warningBox.setHeaderText("Please fill in all of the required fields");
                warningBox.showAndWait();
            } else {
                alertWindow();
            }
        });
        
        BorderPane bPane = new BorderPane();
        BorderPane.setAlignment(saveBtn,Pos.TOP_RIGHT);
        BorderPane.setMargin(grid1, new Insets(20, 20, 20, 20));
        BorderPane.setMargin(saveBtn, new Insets(10, 10, 20, 50));
        bPane.setBottom(saveBtn);
        bPane.setCenter(grid1);

        grid1.setAlignment(Pos.CENTER);
        
        StackPane pane = new StackPane();
        Scene scene = new Scene(pane, 660, 280);
        pane.getChildren().addAll(hbox,bPane);
        pane.setStyle("-fx-background-color: #d2f3e0;");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private void alertWindow() {

        RadioButton selected = (RadioButton) group.getSelectedToggle();
        String selectedGroup = selected.getText();
        String inputNim = nim.getText();
        String inputNama = nama.getText();
        RadioButton selected2 = (RadioButton) group2.getSelectedToggle();
        String selectedGender = selected2.getText();

        Alert alertBox = new Alert(AlertType.INFORMATION);
        alertBox.setTitle("Konfirmasi Data");
        alertBox.setHeaderText(null);
        alertBox.setContentText(String.valueOf(String.format(
                "NIM                   : %s\nNama                : %s\nJenis Kelamin    : %s\nKelompok         : %s",
                inputNim, inputNama, selectedGender, selectedGroup)));
        alertBox.showAndWait();


    }
}
