package AppsProject;

import java.io.*;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Nomor3 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FileChooser fileChooser = new FileChooser();

        TextArea textArea = new TextArea();
        textArea.setMinHeight(70);

        Button btn = new Button("Select First Files");
        btn.setOnAction(e -> {
            fileChooser.setTitle("Select File");
            fileChooser.setInitialDirectory(new File("E:/"));
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
            
            File file = fileChooser.showOpenDialog(stage);
            StringBuilder sb = readFile(file);
            textArea.setText(sb.toString());
        });

        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);

        root.getChildren().addAll(btn,textArea);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Tugas Praktikum 3");
        stage.setScene(scene);
        stage.show();
    }

    private StringBuilder readFile(File file2) {
        StringBuilder sb = new StringBuilder();
        String s = " ";
        try {
            FileReader fileReader = new FileReader(file2);
            BufferedReader reader = new BufferedReader(fileReader);
            while((s=reader.readLine()) != null){
                sb.append(s).append("\n");
            }
        } catch (Exception e) {
            e.getMessage();
        } 
        return sb;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}