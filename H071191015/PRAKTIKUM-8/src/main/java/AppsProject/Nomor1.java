package AppsProject;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Nomor1 extends Application {
    double totalHarga = 0;
    double hargaNasgor=0, hargaBakso=0, hargaEsteh=0, hargaCola=0, hargaAyam=0;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Restaurant");

        CheckBox cbNasgor = new CheckBox("Nasi Goreng");
        CheckBox cbBakso = new CheckBox("Bakso");
        CheckBox cbAyam = new CheckBox("Ayam Goreng");
        CheckBox cbEsteh = new CheckBox("Es Teh");
        CheckBox cbCola = new CheckBox("Cola");
=
        TextField tfNasgor = new TextField();
        TextField tfBakso = new TextField();
        TextField tfAyam = new TextField();
        TextField tfEsteh = new TextField();
        TextField tfCola = new TextField();
        tfNasgor.setPromptText("Jumlah");
        tfBakso.setPromptText("Jumlah");
        tfAyam.setPromptText("Jumlah");
        tfEsteh.setPromptText("Jumlah");
        tfCola.setPromptText("Jumlah");
        tfNasgor.setDisable(true);
        tfBakso.setDisable(true);
        tfAyam.setDisable(true);
        tfEsteh.setDisable(true);
        tfCola.setDisable(true);

        Button btnHitung = new Button("Hitung");
        Button btnHapus = new Button("Hapus");
        Label lblHarga = new Label();
        
        HBox hbox = new HBox(btnHitung,btnHapus);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.setSpacing(5);
        

        GridPane root = new GridPane();
        root.setPadding(new Insets(5));
        root.setVgap(10);
        root.setHgap(10);
        root.add(cbNasgor,0,0);
        root.add(cbBakso,0,1);
        root.add(cbAyam,0,2);
        root.add(cbEsteh, 0, 3);
        root.add(cbCola, 0, 4);
        root.add(tfNasgor, 1,0);
        root.add(tfBakso,1,1);
        root.add(tfAyam,1,2);
        root.add(tfEsteh, 1, 3);
        root.add(tfCola, 1, 4);
        root.add(hbox,1,5);
        root.add(lblHarga, 1,6);

        Scene scene = new Scene(root, 250, 230);
        stage.setScene(scene);
        stage.show();

        cbNasgor.setOnAction(e-> {
            if (cbNasgor.isSelected()) {
                hargaNasgor = 12000;
                tfNasgor.setDisable(false);
            } else {
                tfNasgor.setDisable(true);
                hargaNasgor = 0;
            }
        });

        cbBakso.setOnAction(e-> {
            if (cbBakso.isSelected()) {
                hargaBakso = 10000;
                tfBakso.setDisable(false);
            } else {
                tfBakso.setDisable(true);
                hargaBakso = 0;
            }
        });

        cbAyam.setOnAction(e-> {
            if (cbAyam.isSelected()) {
                hargaAyam = 15000;
                tfAyam.setDisable(false);
            } else {
                tfAyam.setDisable(true);
                hargaAyam = 0;
            }
        });

        cbEsteh.setOnAction(e-> {
            if (cbEsteh.isSelected()) {
                hargaEsteh = 5000;
                tfEsteh.setDisable(false);
            } else {
                tfEsteh.setDisable(true);
                hargaEsteh = 0;
            }
        });

        cbCola.setOnAction(e-> {
            if (cbCola.isSelected()) {
                hargaCola = 8000;
                tfCola.setDisable(false);
            } else {
                tfCola.setDisable(true);
                hargaCola = 0;
            }
        });

        btnHitung.setOnAction(e->{
            if (tfNasgor.getText().isEmpty() || tfBakso.getText().isEmpty() || tfEsteh.getText().isEmpty() || tfCola.getText().isEmpty() || tfAyam.getText().isEmpty()) {
                tfNasgor.setText("0");
                tfBakso.setText("0");
                tfAyam.setText("0");
                tfEsteh.setText("0");
                tfCola.setText("0");

                totalHarga = (hargaNasgor*Double.valueOf(tfNasgor.getText())) + (hargaBakso*Double.valueOf(tfBakso.getText()) + 
                (hargaEsteh*Double.valueOf(tfEsteh.getText())) + (hargaCola*Double.valueOf(tfCola.getText())) + (hargaAyam*Double.valueOf(tfAyam.getText())));
            } else {
                totalHarga = (hargaNasgor*Double.valueOf(tfNasgor.getText())) + (hargaBakso*Double.valueOf(tfBakso.getText()) + 
                (hargaEsteh*Double.valueOf(tfEsteh.getText())) + (hargaCola*Double.valueOf(tfCola.getText())) + (hargaAyam*Double.valueOf(tfAyam.getText())));
                //format Rp
                DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
                
                formatRp.setCurrencySymbol("Rp. ");
                formatRp.setMonetaryDecimalSeparator('.');
                formatRp.setGroupingSeparator('.');
                kursIndo.setDecimalFormatSymbols(formatRp);

                String string = kursIndo.format(totalHarga);
                lblHarga.setText(string);
            }
        });

        btnHapus.setOnAction(e->{
            tfNasgor.clear();
            tfBakso.clear();
            tfAyam.clear();
            tfEsteh.clear();
            tfCola.clear();
            lblHarga.setText("");
            hargaNasgor = 0;
            hargaBakso = 0;
            hargaAyam = 0;
            hargaEsteh=0;
            hargaCola=0;
            totalHarga = 0;
        });
    }

    public static void main(String[] args) {
        launch();
    }

}