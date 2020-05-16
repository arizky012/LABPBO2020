package AppsProject;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Nomor2 extends Application {
    String kelompok=null, jenisKelamin=null;
    TextField tfNim;
    TextField tfNama;
    StringBuilder sb = new StringBuilder();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Tugas Praktikum 2");
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setHgap(25);
        root.setVgap(15);
        
        Label labelTitle = new Label("Kelompok");
        GridPane.setHalignment(labelTitle, HPos.CENTER);
        Label labelTitle2 = new Label("Data");
        root.add(labelTitle,0,0,2,1);
        root.add(labelTitle2,5,0,2,1);
        root.setAlignment(Pos.CENTER);

        RadioButton btn = new RadioButton("Kelompok 1");
        RadioButton btn2 = new RadioButton("Kelompok 2");
        RadioButton btn3 = new RadioButton("Kelompok 3");
        RadioButton btn4 = new RadioButton("Kelompok 4");
        root.add(btn,0,1);
        root.add(btn2,1,1);
        root.add(btn3,0,2);
        root.add(btn4,1,2);

        tfNim = new TextField();
        tfNim.setPromptText("Masukkan NIM");
        Label nimLabel = new Label("NIM");
        nimLabel.setLabelFor(tfNim);
        root.add(nimLabel, 4, 1);
        root.add(tfNim,5,1);

        tfNama = new TextField();
        tfNama.setPromptText("Masukkan Nama");
        Label namaLabel = new Label("Nama");
        namaLabel.setLabelFor(tfNama);
        root.add(namaLabel, 4, 2);
        root.add(tfNama,5,2);

        Label jkLabel = new Label("Jenis Kelamin");
        RadioButton lk = new RadioButton("Laki-laki");
        RadioButton pr = new RadioButton("Perempuan");
        root.add(jkLabel, 4, 3);
        root.add(lk,5,3);
        root.add(pr,5,4);
        
        Button btnButton = new Button("SAVE");
        GridPane.setHalignment(btnButton, HPos.RIGHT);
        root.add(btnButton,5,5);

        Scene scene = new Scene(root, 560, 220);
        stage.setScene(scene);
        stage.show();

        btnButton.setOnAction(e->{
            handleOptions(btn, btn2, btn3, btn4, lk, pr);

            if (tfNama.getText().isEmpty() || tfNim.getText().isEmpty()) {
                showErrorAlert();
            } else {
                showInformationAlert();
            }
        });
        
    }

    private void handleOptions(RadioButton btn, RadioButton btn2, RadioButton btn3, RadioButton btn4, RadioButton lk, RadioButton pr){
        if (btn.isSelected()) {
            kelompok = "Kelompok 1";
        } else if (btn2.isSelected()) {
            kelompok = "Kelompok 2";
        } else if (btn3.isSelected()) {
            kelompok = "Kelompok 3";
        } else if (btn4.isSelected()){
            kelompok = "Kelompok 4";
        }

        if(lk.isSelected()){
            jenisKelamin = "Laki-Laki";
        } else if (pr.isSelected()) {
            jenisKelamin = "Perempuan";
        }
    }

    private void showInformationAlert(){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informasi");
        alert.setHeaderText("Data: ");

        sb.append("\nNama : ");
        sb.append(tfNama.getText());
        sb.append("\nNIM : ");
        sb.append(tfNim.getText());
        sb.append("\nJenis Kelamin : ");
        sb.append(jenisKelamin);
        sb.append("\nKelompok : ");
        sb.append(kelompok);

        alert.setContentText(sb.toString());

        alert.showAndWait();
    }

    private void showErrorAlert(){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Alert");
        alert.setHeaderText(null);
        alert.setContentText("Data Tidak Lengkap");

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}