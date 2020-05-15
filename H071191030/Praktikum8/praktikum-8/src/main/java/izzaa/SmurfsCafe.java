//No. 1
package izzaa;

import java.io.FileInputStream;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class SmurfsCafe extends Application {

    private Stage stage;
    private Label price1, price2, price3, price4, price5, price6;
    private CheckBox menu1, menu2, menu3, menu4, menu5, menu6;
    private GridPane grid1, grid2;
    private TextField amt1, amt2, amt3, amt4, amt5, amt6;
    private Button submitBtn, proceedBtn, clearBtn;
    private FileInputStream input2;
    private Image image2;
    private ImageView iv2;
    private Scene scene;

    @Override
    public void start(Stage window) throws Exception {
        stage = window; 

        VBox titleBox = new VBox();
        VBox vbox = new VBox();

        grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10, 10, 10));
        grid1.setVgap(6);
        grid1.setHgap(20);

        Label restaurantName = new Label("Smurf's Cafe");
        restaurantName.setFont(Font.font("Century Gothic", FontWeight.EXTRA_BOLD, 30));
        // restaurantName.setStyle("-fx-base: rgb(136, 204, 255)");
        restaurantName.setTextFill(Color.web("#62cdfd"));
        titleBox.getChildren().add(restaurantName);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setStyle("-fx-background-color: #ceebfd;");

        Label menuItem = new Label("Menu Item");
        menuItem.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        menuItem.setTextFill(Color.web("#43a2e6"));
        grid1.add(menuItem, 0, 1);
   

        Label amount = new Label("Qnt:   ");
        amount.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amount.setTextFill(Color.web("#43a2e6"));
        grid1.add(amount, 2, 1);

        Label price = new Label("Price");
        price.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        price.setTextFill(Color.web("#43a2e6"));
        grid1.add(price, 4, 1);

        menu1 = new CheckBox("Smurfette's Pumpkin Cake");
        amt1 = new TextField();
        price1 = new Label("Rp. 300.000.00,-");
        menu1.setStyle("-fx-text-fill: #2fabed; -fx-mark-color: #62cdfd; -fx-outer-border: #2fabed; ");
        menu1.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        amt1.setStyle(
                "-fx-focus-color: #a4e9e6; -fx-faint-focus-color: #039ed322; -fx-text-fill: #43a2e6; -fx-control-inner-background: #EEF7FB; -fx-text-box-border: #2fabed; ");
        amt1.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt1.setPrefWidth(1);
        price1.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        price1.setTextFill(Color.web("#2fabed"));
        grid1.add(menu1, 0, 2);
        grid1.add(amt1, 2, 2);
        grid1.add(price1, 4, 2);

        amt1.setDisable(true);
        menu1.setOnAction(e -> {
            amt1.setEditable(true);
            amt1.setDisable(false);
        });

        menu2 = new CheckBox("Smurfberry Pie");
        amt2 = new TextField();
        price2 = new Label("Rp. 450.000.00,-");
        menu2.setStyle("-fx-text-fill: #2fabed; -fx-mark-color: #62cdfd; -fx-outer-border: #2fabed; ");
        menu2.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        amt2.setStyle(
                "-fx-focus-color: #a4e9e6; -fx-faint-focus-color: #039ed322; -fx-text-fill: #43a2e6; -fx-control-inner-background: #EEF7FB; -fx-text-box-border: #2fabed;");
        amt2.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt2.setPrefSize(1, 1);
        price2.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        price2.setTextFill(Color.web("#2fabed"));
        grid1.add(menu2, 0, 3);
        grid1.add(amt2, 2, 3);
        grid1.add(price2, 4, 3);

        amt2.setDisable(true);
        menu2.setOnAction(e -> {
            amt2.setEditable(true);
            amt2.setDisable(false);
        });

        menu3 = new CheckBox("Sarsaparilla Pizza");
        amt3 = new TextField();
        price3 = new Label("Rp. 800.000.00,-");
        menu3.setStyle("-fx-text-fill: #2fabed; -fx-mark-color: #62cdfd; -fx-outer-border: #2fabed;");
        menu3.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        amt3.setStyle(
                "-fx-focus-color: #a4e9e6; -fx-faint-focus-color: #039ed322; -fx-text-fill: #43a2e6; -fx-control-inner-background: #EEF7FB; -fx-text-box-border: #2fabed;");
        amt3.setPrefSize(1, 1);
        amt3.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        price3.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        price3.setTextFill(Color.web("#2fabed"));
        grid1.add(menu3, 0, 4);
        grid1.add(amt3, 2, 4);
        grid1.add(price3, 4, 4);

        amt3.setDisable(true);
        menu3.setOnAction(e -> {
            amt3.setEditable(true);
            amt3.setDisable(false);
        });

        menu4 = new CheckBox("Clumsy's Hotdog");
        amt4 = new TextField();
        price4 = new Label("Rp. 250.000.00,-");
        menu4.setStyle("-fx-text-fill: #2fabed; -fx-mark-color: #62cdfd;-fx-outer-border: #2fabed; ");
        menu4.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        amt4.setStyle(
                "-fx-focus-color: #a4e9e6; -fx-faint-focus-color: #039ed322; -fx-text-fill: #43a2e6; -fx-control-inner-background: #EEF7FB; -fx-text-box-border: #2fabed;");
        amt4.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt4.setPrefSize(1, 1);
        price4.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        price4.setTextFill(Color.web("#2fabed"));
        grid1.add(menu4, 0, 5);
        grid1.add(amt4, 2, 5);
        grid1.add(price4, 4, 5);

        amt4.setDisable(true);
        menu4.setOnAction(e -> {
            amt4.setEditable(true);
            amt4.setDisable(false);
        });

        menu5 = new CheckBox("Smurfberry Juice");
        amt5 = new TextField();
        price5 = new Label("Rp. 170.000.00,-");
        menu5.setStyle("-fx-text-fill: #2fabed; -fx-mark-color: #62cdfd; -fx-outer-border: #2fabed;");
        menu5.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        amt5.setStyle(
                "-fx-focus-color: #a4e9e6; -fx-faint-focus-color: #039ed322; -fx-text-fill: #43a2e6;-fx-control-inner-background: #EEF7FB; -fx-text-box-border: #2fabed;");
        amt5.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt5.setPrefSize(1, 1);
        price5.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        price5.setTextFill(Color.web("#2fabed"));
        grid1.add(menu5, 0, 6);
        grid1.add(amt5, 2, 6);
        grid1.add(price5, 4, 6);

        amt5.setDisable(true);
        menu5.setOnAction(e -> {
            amt5.setEditable(true);
            amt5.setDisable(false);
        });

        menu6 = new CheckBox("Smurfaccino");
        amt6 = new TextField();
        price6 = new Label("Rp. 200.000.00,-");
        menu6.setStyle("-fx-text-fill: #2fabed; -fx-mark-color: #62cdfd; -fx-outer-border: #2fabed; ");
        menu6.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        amt6.setStyle(
                "-fx-focus-color: #a4e9e6; -fx-faint-focus-color: #039ed322; -fx-text-fill: #43a2e6; -fx-control-inner-background: #EEF7FB; -fx-text-box-border: #2fabed;");
        amt6.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt6.setPrefSize(1, 1);
        price6.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
        price6.setTextFill(Color.web("#2fabed"));
        grid1.add(menu6, 0, 7);
        grid1.add(amt6, 2, 7);
        grid1.add(price6, 4, 7);

        amt6.setDisable(true);
        menu6.setOnAction(e -> {
            amt6.setEditable(true);
            amt6.setDisable(false);
        });

        FileInputStream input = new FileInputStream(
                "C:\\OOP\\JavaFX Prak\\praktikum-8\\src\\main\\java\\assets\\greedy2.png");
        Image image = new Image(input);
        ImageView iv = new ImageView(image);
        iv.setFitHeight(150);
        iv.setFitWidth(110);
        iv.setTranslateX(-15);
        iv.setTranslateY(20);

        input2 = new FileInputStream("C:\\OOP\\JavaFX Prak\\praktikum-8\\src\\main\\java\\assets\\the smurfs.png");
        image2 = new Image(input2);
        iv2 = new ImageView(image2);
        iv2.setFitHeight(110);
        iv2.setFitWidth(260);
        iv2.setTranslateX(110);
        iv2.setTranslateY(110);

        submitBtn = new Button("Submit Order");
        submitBtn.setOnAction(e -> orderedItems());
        submitBtn.setFont(Font.font("Calisto MT", FontWeight.EXTRA_BOLD, 12));
        submitBtn.setStyle(
                "-fx-text-fill: #43a2e6; -fx-faint-focus-color: #a4e9e6; -fx-body-color: #ceebfd; -fx-background-color: -fx-faint-focus-color, -fx-focus-color, -fx-body-color; -fx-background-insets: -3, -1.3, 0.1, 0.3; -fx-background-radius: 7, 6, 4, 3;");
        grid1.add(submitBtn, 0, 10);

        grid1.setAlignment(Pos.BASELINE_LEFT);
        vbox.getChildren().addAll(titleBox, grid1);

        StackPane pane = new StackPane();
        pane.getChildren().addAll(iv, vbox);
        scene = new Scene(pane, 450, 340);
        pane.setStyle("-fx-background-color: #e9f6fb;");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Restaurant Menu");
        stage.show();

    }

    
    public static void main(String[] args) {
        Application.launch(args);
    }

    private void orderedItems() {

        grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10, 10, 10));
        grid2.setVgap(2);
        grid2.setHgap(20);

        VBox titleBox = new VBox();

        Label restaurantName = new Label("Smurf's Cafe");
        restaurantName.setFont(Font.font("Century Gothic", FontWeight.EXTRA_BOLD, 30));
        restaurantName.setTextFill(Color.web("#62cdfd"));
        titleBox.getChildren().add(restaurantName);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setStyle("-fx-background-color: #ceebfd;");

        Label itemsOrdered = new Label("Items Ordered:");
        itemsOrdered.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        itemsOrdered.setTextFill(Color.web("#43a2e6"));
        grid2.add(itemsOrdered, 0, 0);

        String qnt1 = amt1.getText();
        String mn1 = null;
        if (menu1.isSelected()) {
            mn1 = menu1.getText();
        }

        Text order1 = new Text();
        if (mn1 != null) {
            order1.setText(String.valueOf(String.format("\n%s %s", qnt1, mn1)));
            order1.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
            order1.setFill(Color.web("#2fabed"));
        } else {
            order1.setText("");
        }

        String qnt2 = amt2.getText();
        String mn2 = null;
        if (menu2.isSelected()) {
            mn2 = menu2.getText();
        }

        Text order2 = new Text();
        if (mn2 != null) {
            order2.setText(String.valueOf(String.format("\n%s %s", qnt2, mn2)));
            order2.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
            order2.setFill(Color.web("#2fabed"));
        } else {
            order2.setText("");
        }

        String qnt3 = amt3.getText();
        String mn3 = null;
        if (menu3.isSelected()) {
            mn3 = menu3.getText();
        }

        Text order3 = new Text();
        if (mn3 != null) {
            order3.setText(String.valueOf(String.format("\n%s %s", qnt3, mn3)));
            order3.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
            order3.setFill(Color.web("#2fabed"));
        } else {
            order3.setText("");
        }

        String qnt4 = amt4.getText();
        String mn4 = null;
        if (menu4.isSelected()) {
            mn4 = menu4.getText();
        }

        Text order4 = new Text();
        if (mn4 != null) {
            order4.setText(String.valueOf(String.format("\n%s %s", qnt4, mn4)));
            order4.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
            order4.setFill(Color.web("#2fabed"));
        } else {
            order4.setText("");
        }

        String qnt5 = amt5.getText();
        String mn5 = null;
        if (menu5.isSelected()) {
            mn5 = menu5.getText();
        }

        Text order5 = new Text();
        if (mn5 != null) {
            order5.setText(String.valueOf(String.format("\n%s %s", qnt5, mn5)));
            order5.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
            order5.setFill(Color.web("#2fabed"));
        } else {
            order5.setText("");
        }

        String qnt6 = amt6.getText();
        String mn6 = null;
        if (menu6.isSelected()) {
            mn6 = menu6.getText();
        }

        Text order6 = new Text();
        if (mn6 != null) {
            order6.setText(String.valueOf(String.format("\n%s %s", qnt6, mn6)));
            order6.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 14));
            order6.setFill(Color.web("#2fabed"));
        } else {
            order6.setText("");
        }

        TextFlow txtflow = new TextFlow();

        txtflow.getChildren().addAll(order1, order2, order3, order4, order5, order6);
        grid2.add(txtflow, 0, 1);

        proceedBtn = new Button("Proceed");
        proceedBtn.setFont(Font.font("Calisto MT", FontWeight.EXTRA_BOLD, 12));
        proceedBtn.setStyle(
                "-fx-text-fill: #43a2e6; -fx-faint-focus-color: #a4e9e6; -fx-body-color: #ceebfd; -fx-background-color: -fx-faint-focus-color, -fx-focus-color, -fx-body-color; -fx-background-insets: -3, -1.3, 0.1, 0.3; -fx-background-radius: 7, 6, 4, 3;");
        proceedBtn.setOnAction(e -> bill());
        grid2.add(proceedBtn, 0, 3);

        grid2.setAlignment(Pos.BASELINE_LEFT);
        VBox vbox2 = new VBox();
        vbox2.getChildren().addAll(titleBox, grid2);

        StackPane pane2 = new StackPane();

        Scene scene2 = new Scene(pane2, 450, 340);
        pane2.setStyle("-fx-background-color: #e9f6fb;");
        pane2.getChildren().addAll(iv2, vbox2);
        stage.setScene(scene2);

    }

    private void bill() {

        Label bill = new Label("BILL:");
        bill.setFont(Font.font("Calisto MT", FontWeight.EXTRA_BOLD, 13));
        bill.setTextFill(Color.web("#43a2e6"));
        grid2.add(bill, 0, 5);

        int bill1, bill2, bill3, bill4, bill5, bill6;

        if (amt1.getText().isEmpty()) {
            bill1 = 0;
        } else {
            bill1 = Integer.parseInt(amt1.getText());
        }

        if (amt2.getText().isEmpty()) {
            bill2 = 0;
        } else {
            bill2 = Integer.parseInt(amt2.getText());
        }

        if (amt3.getText().isEmpty()) {
            bill3 = 0;
        } else {
            bill3 = Integer.parseInt(amt3.getText());
        }

        if (amt4.getText().isEmpty()) {
            bill4 = 0;
        } else {
            bill4 = Integer.parseInt(amt4.getText());
        }

        if (amt5.getText().isEmpty()) {
            bill5 = 0;
        } else {
            bill5 = Integer.parseInt(amt5.getText());
        }

        if (amt6.getText().isEmpty()) {
            bill6 = 0;
        } else {
            bill6 = Integer.parseInt(amt6.getText());
        }

        double subtotal = (bill1 * 300000) + (bill2 * 450000) + (bill3 * 800000) + (bill4 * 250000) + (bill5 * 170000)
                + (bill6 * 200000);
        double tax = subtotal * (0.1);
        double total = subtotal + tax;

        DecimalFormat idKurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();

        rp.setCurrencySymbol("Rp. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        idKurs.setDecimalFormatSymbols(rp);

        Text stotal = new Text();
        stotal.setText(String.valueOf(String.format(" Subtotal  : %s,-", idKurs.format(subtotal))));
        stotal.setFont(Font.font("Calisto MT", FontWeight.BOLD, 14));
        stotal.setFill(Color.web("#2fabed"));
        grid2.add(stotal, 0, 6);

        Text taxx = new Text();
        taxx.setText(String.valueOf(String.format(" Tax          : %s,-", idKurs.format(tax))));
        taxx.setFont(Font.font("Calisto MT", FontWeight.BOLD, 14));
        taxx.setFill(Color.web("#2fabed"));
        grid2.add(taxx, 0, 7);

        Label totall = new Label();
        totall.setText(String.valueOf(String.format(" Total       : %s,- ", idKurs.format(total))));
        totall.setFont(Font.font("Calisto MT", FontWeight.EXTRA_BOLD, 14));
        totall.setTextFill(Color.web("#2fabed"));
        totall.setStyle("-fx-background-color: #a2d3f1");
        grid2.add(totall, 0, 8);

        clearBtn = new Button("Clear Bill");
        clearBtn.setFont(Font.font("Calisto MT", FontWeight.EXTRA_BOLD, 12));
        clearBtn.setStyle(
                "-fx-text-fill: #43a2e6; -fx-faint-focus-color: #a4e9e6; -fx-body-color: #ceebfd; -fx-background-color: -fx-faint-focus-color, -fx-focus-color, -fx-body-color; -fx-background-insets: -3, -1.3, 0.1, 0.3; -fx-background-radius: 7, 6, 4, 3;");
        clearBtn.setOnAction(e -> {
            menu1.setSelected(false);
            amt1.clear();
            amt1.setDisable(true);
            menu1.setOnAction(x -> {
                amt1.setEditable(true);
                amt1.setDisable(false);
            });
            menu2.setSelected(false);
            amt2.clear();
            amt2.setDisable(true);
            menu2.setOnAction(x -> {
                amt2.setEditable(true);
                amt2.setDisable(false);
            });
            menu3.setSelected(false);
            amt3.clear();
            amt3.setDisable(true);
            menu3.setOnAction(x -> {
                amt3.setEditable(true);
                amt3.setDisable(false);
            });
            menu4.setSelected(false);
            amt4.clear();
            amt4.setDisable(true);
            menu4.setOnAction(x -> {
                amt4.setEditable(true);
                amt4.setDisable(false);
            });
            menu5.setSelected(false);
            amt5.clear();
            amt5.setDisable(true);
            menu5.setOnAction(x -> {
                amt5.setEditable(true);
                amt5.setDisable(false);
            });
            menu6.setSelected(false);
            amt6.clear();
            amt6.setDisable(true);
            menu6.setOnAction(x -> {
                amt6.setEditable(true);
                amt6.setDisable(false);
            });
            stage.setScene(scene);

        });
        grid2.add(clearBtn, 0, 10);

    }


}