package ModulNo1;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import java.io.FileInputStream;

public class Cafe extends Application{
	
	TextField [][] pesanan= new TextField[2][3];
	Button [] tambahPesanan= new Button[6];
	Button [] kurangiPesanan= new Button[6];
	boolean [] telahPesan= new boolean[6];
	String [] namaGambar= new String[6];
	String [] namaMakanan= new String[6];
	int [] hargaMakanan= new int[6];
	int jumlahSudahDipesan= 0, totalHarga= 0;
	Text [] totalPesanan= new Text[6];
	Text textTotalHarga= new Text("TOTAL = "+totalHarga+" (G)");
	
	
	@Override
	public void start(Stage stage) throws Exception{
		Group group= new Group();
		Scene sceneAwal= new Scene(group, 900, 620);
		
		Group group2= new Group(tampilkanGambar("Image/Background-Start.jpg"));
		Scene selamatDatang= new Scene(group2, 900, 620);;
		stage.setScene(selamatDatang);
		
		group.getChildren().add(tampilkanGambar("Image/Background1.jpg"));
		
		Button pilihMakan= new Button("PESAN MAKANAN");
		Button keluar= new Button("KELUAR DARI KAFE");
		
		pilihMakan.setPrefSize(325,80);
		pilihMakan.setLayoutX(500);
		pilihMakan.setLayoutY(330);
		
		keluar.setPrefSize(325,80);
		keluar.setLayoutX(500);
		keluar.setLayoutY(465);
		
		setButtonStyle(pilihMakan, 21);
		setButtonStyle(keluar, 21);
		
		group.getChildren().addAll(pilihMakan,keluar);
			
		pilihMakan.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event){
					try{
					stage.setScene(scenePilihMakan(stage,sceneAwal));
					}catch(Exception e){
						e.getMessage();
					}
				}
		 });
		
		keluar.setOnAction(e->{
			try{
				stage.setScene(new Scene(new Group(tampilkanGambar("Image/Background-End.jpg")), 900, 620));
				scenePemanis(stage, sceneAwal, 1800, 1);
			}catch(Exception j){
				j.getMessage();
			}
		});
		
		FileInputStream input2= new FileInputStream("Image/Iconn.jpg");
		Image image2= new Image(input2);
		ImageView imageView2= new ImageView(image2);
		
		stage.getIcons().add(image2);
		stage.setTitle("Fantasia's Cafe");
		stage.show();
		
		scenePemanis(stage, sceneAwal, 2000, 0);
	}

	public void scenePemanis(Stage stage, Scene sceneAwal, int durasi, int x){
		Task<Void> sleeper = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				try {
					Thread.sleep(durasi);
				} catch (InterruptedException e) {}
				return null;
			}
		};

		sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
			@Override
			public void handle(WorkerStateEvent event) {
				if(x==0) stage.setScene(sceneAwal);
				else stage.close();
			}
		});
		
		new Thread(sleeper).start();
	}
	
	public Scene scenePilihMakan(Stage stage, Scene sceneAwal) throws Exception{
		Group group= new Group();
		Scene scenePilihMakan= new Scene(group, 900, 620);
		group.getChildren().add(tampilkanGambar("Image/Background2.jpg"));
		
		Button back= new Button("KEMBALI");
		Button pesan= new Button("BAYAR");
		group.getChildren().addAll(back,pesan);
		
		back.setPrefSize(150,50);
		back.setLayoutX(28);
		back.setLayoutY(540);
		
		pesan.setPrefSize(150,50);
		pesan.setLayoutX(722);
		pesan.setLayoutY(540);
		
		setButtonStyle(back, 15);
		setButtonStyle(pesan, 15);
		
		namaGambar[0]= "Pancake"; namaGambar[1]= "Waffle"; namaGambar[2]= "Tea";
		namaGambar[3]= "Coffee"; namaGambar[4]= "Crepe"; namaGambar[5]= "Cake";
		
		namaMakanan[0]= "Pancake"; namaMakanan[1]= "Waffle "; namaMakanan[2]= "Tea    ";
		namaMakanan[3]= "Coffee "; namaMakanan[4]= "Crepe  "; namaMakanan[5]= "Cake   ";
		
		hargaMakanan[0]= 2; hargaMakanan[1]= 3; hargaMakanan[2]= 1;
		hargaMakanan[3]= 4; hargaMakanan[4]= 2; hargaMakanan[5]= 4;
		
		double xAwal= -47; double yAwal= 200; int indeks= 0;
		
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				xAwal+= 220;
				
				tampilkanInfoMakanan(group, xAwal-138, yAwal-55, namaGambar[indeks], hargaMakanan[indeks]);
				group.getChildren().addAll(tampilkanGambarMakanan(namaGambar[indeks], (int)xAwal-138, (int)yAwal-30));
				
				pesanan[i][j]= setTextField(xAwal, yAwal);
				tambahPesanan[indeks]= setButton(xAwal-2, yAwal-30, 1);
				kurangiPesanan[indeks]= setButton(xAwal-2, yAwal+30, 0);
				telahPesan[indeks]= false;
				totalPesanan[indeks]= new Text("");
				totalPesanan[indeks].setFont(Font.font("Lucida Handwriting",15));
				
				tambahKurangPesanan(tambahPesanan[indeks], kurangiPesanan[indeks], pesanan[i][j], indeks);
				
				group.getChildren().addAll(pesanan[i][j], tambahPesanan[indeks], kurangiPesanan[indeks], totalPesanan[indeks]);
				indeks++;
			}
			xAwal= -47;
			yAwal= 385;
		}
		
		textTotalHarga.setFont(Font.font("Lucida Handwriting",14));
		textTotalHarga.setX(710);
		textTotalHarga.setY(455);
		group.getChildren().add(textTotalHarga);
		
		back.setOnAction(e->{
			jumlahSudahDipesan= 0;
			totalHarga= 0;
			stage.setScene(sceneAwal);
		});
		
		pesan.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
				try{
                tampilkanTerimakasih(stage, sceneAwal, scenePilihMakan, group);
				}catch(Exception e){
					e.getMessage();
				}
            }
		});
		
		return scenePilihMakan;
		
	}
	
	public void tampilkanTerimakasih(Stage stage, Scene sceneAwal, Scene scenePilihMakan, Group group) throws Exception{
		jumlahSudahDipesan= 0;
		
		FileInputStream input= new FileInputStream("Image/TerimaKasih.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(300);
		imageView.setFitHeight(160);
		imageView.setLayoutX(300);
		imageView.setLayoutY(230);
		
		group.getChildren().add(imageView);
		
		scenePemanis(stage, sceneAwal, 1000, 0);
	}
	
	public ImageView tampilkanGambar(String a) throws Exception{
		FileInputStream input= new FileInputStream(a);
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(900);
		imageView.setFitHeight(620);
		return imageView;
	}
	
	public ImageView tampilkanGambarMakanan(String a, int x, int y) throws Exception{
		FileInputStream input= new FileInputStream("Image/"+a+".jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(130);
		imageView.setFitHeight(130);
		imageView.setLayoutX(x);
		imageView.setLayoutY(y);
		return imageView;
	}
	
	public void tampilkanInfoMakanan(Group group, double x, double y, String nama, int harga) throws Exception{
		FileInputStream input= new FileInputStream("Image/RectangleFill.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		
		Rectangle rect= new Rectangle(x, y, 100, 130);
		rect.setFill(new ImagePattern(image));
		
		Rectangle rect2= new Rectangle(x+5, y+5, 90, 120);
		rect2.setFill(Color.rgb(255,242,188));
		
		Text namaMakanan= new Text(nama);
		namaMakanan.setFont(Font.font("Lucida Handwriting",14));
		namaMakanan.setX(x+9);
		namaMakanan.setY(y+20);
		
		Rectangle rect3= new Rectangle(x, y+121, 190, 34);
		rect3.setFill(new ImagePattern(image));
		
		Rectangle rect4= new Rectangle(x+5, y+126, 180, 24);
		rect4.setFill(Color.rgb(255,242,188));
		
		Text hargaMakanan= new Text(harga+" (G)");
		hargaMakanan.setFont(Font.font("Lucida Handwriting",14));
		hargaMakanan.setX(x+134);
		hargaMakanan.setY(y+142);
		
		
		
		group.getChildren().addAll(rect,rect2, rect3, rect4, namaMakanan, hargaMakanan);
	}
	
	public TextField setTextField(double x, double y){
		TextField jumlahPesanan= new TextField("0");
		jumlahPesanan.setPrefWidth(34);
		jumlahPesanan.setLayoutX(x);
		jumlahPesanan.setLayoutY(y);
		jumlahPesanan.setAlignment(Pos.CENTER);
		
		return jumlahPesanan;
	}
	
	public Button setButton(double x, double y, int naik) throws Exception{
		Polygon polygon = new Polygon();
        polygon.getPoints().addAll(50.0, naik==0? 100.0 : 0.0, /* <-- Puncak */ 0.0, 50.0, /* <--Sudut Kiri, Sudut kanan--> */ 100.0, 50.0);
		
		Button bt = new Button();
		bt.setShape(polygon);
		
		bt.setLayoutX(x);
		bt.setLayoutY(y);
		bt.setPrefSize(38,14);
		bt.setStyle("-fx-base: rgb(253,233,152)");
		
		return bt;
	}

	public void setButtonStyle(Button x, int besar){
		x.setFont(Font.font("Lucida Handwriting", besar));
		x.setStyle("-fx-base: rgb(255,244,178); -fx-text-fill: rgb(55,55,55)"); 
	}

	public void tambahKurangPesanan(Button tambahPesanan, Button kurangiPesanan, TextField pesanan, int indeks){
		
		tambahPesanan.setOnMouseClicked(e->{
			if(pesanan.getText().codePointAt(0)< 48 || pesanan.getText().codePointAt(0)> 57) {
				if(totalPesanan[indeks].getText().equals(""))pesanan.setText("0");
				else {
					pesanan.setText(Integer.parseInt(totalPesanan[indeks].getText().substring(10,totalPesanan[indeks].getText().length()))+1+"");
					totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
					totalHarga+= hargaMakanan[indeks];
				}
			}
			else{
				pesanan.setText(Integer.parseInt(pesanan.getText())+1+"");
				
				if(totalPesanan[indeks].getText().equals("") && jumlahSudahDipesan<7){
					jumlahSudahDipesan++;
					totalPesanan[indeks].setX(710);
					totalPesanan[indeks].setY(150+((jumlahSudahDipesan)*40));
				}
				
				totalHarga+= hargaMakanan[indeks];
				textTotalHarga.setText("TOTAL = "+totalHarga+" (G)");
				totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
			}
		});
		
		kurangiPesanan.setOnMouseClicked(e->{
			if(pesanan.getText().codePointAt(0)< 48 || pesanan.getText().codePointAt(0)> 57) {
				if(totalPesanan[indeks].getText().equals(""))pesanan.setText("0");
				else{
					if(Integer.parseInt(totalPesanan[indeks].getText().substring(10,11))<= 0) {
						totalPesanan[indeks].setText(namaMakanan[indeks]+" X 0");
						pesanan.setText("0");
					}
					else {
						pesanan.setText(Integer.parseInt(totalPesanan[indeks].getText().substring(10,totalPesanan[indeks].getText().length()))-1+"");
						totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
						totalHarga-= hargaMakanan[indeks];
					}
				}
			}
			else if(Integer.parseInt(pesanan.getText())<=0) {
				pesanan.setText("0");
				
				if(totalPesanan[indeks].getText().equals("")){
					jumlahSudahDipesan++;
					totalPesanan[indeks].setX(710);
					totalPesanan[indeks].setY(150+((jumlahSudahDipesan)*40));
				}
				totalPesanan[indeks].setText(namaMakanan[indeks]+" X 0");
			}
			else{
				pesanan.setText(Integer.parseInt(pesanan.getText())-1+"");
				totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
				
				totalHarga-= hargaMakanan[indeks];
				textTotalHarga.setText("TOTAL = "+totalHarga+" (G)");
			}
		});
		
		pesanan.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(pesanan.getText().codePointAt(0)< 48 || pesanan.getText().codePointAt(0)> 57){
					if(totalPesanan[indeks].getText().equals(""))pesanan.setText("0");
					else pesanan.setText(totalPesanan[indeks].getText().substring(10,totalPesanan[indeks].getText().length()));
				}else if(pesanan.getText().equals("") || pesanan.getText()==null || pesanan.getText().equals("0")){
					pesanan.setText("0");
					
					if(totalPesanan[indeks].getText().equals("")){
						jumlahSudahDipesan++;
						totalPesanan[indeks].setX(710);
						totalPesanan[indeks].setY(150+((jumlahSudahDipesan)*40));
					}
						
					if(totalPesanan[indeks].getText().equals("")) totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
					totalHarga-= hargaMakanan[indeks]*Integer.parseInt(totalPesanan[indeks].getText().substring(10, totalPesanan[indeks].getText().length()));
					if(!totalPesanan[indeks].getText().equals("")) totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
					textTotalHarga.setText("TOTAL = "+totalHarga+" (G)");
			
				}
				else {
					if(totalPesanan[indeks].getText().equals("")){
						jumlahSudahDipesan++;
						totalPesanan[indeks].setX(710);
						totalPesanan[indeks].setY(150+((jumlahSudahDipesan)*40));
					}
					
					if(!totalPesanan[indeks].getText().equals("") && Integer.parseInt(totalPesanan[indeks].getText().substring(10, totalPesanan[indeks].getText().length()))<Integer.parseInt(pesanan.getText())){
						totalHarga+= hargaMakanan[indeks]*(Integer.parseInt(pesanan.getText())-Integer.parseInt(totalPesanan[indeks].getText().substring(10, totalPesanan[indeks].getText().length())));
					}else if(!totalPesanan[indeks].getText().equals("") && Integer.parseInt(totalPesanan[indeks].getText().substring(10, totalPesanan[indeks].getText().length()))>Integer.parseInt(pesanan.getText())){
						totalHarga-= hargaMakanan[indeks]*(Integer.parseInt(totalPesanan[indeks].getText().substring(10, totalPesanan[indeks].getText().length()))-Integer.parseInt(pesanan.getText()));
					}else totalHarga+= hargaMakanan[indeks]*Integer.parseInt(pesanan.getText());
					
					totalPesanan[indeks].setText(namaMakanan[indeks]+" X "+pesanan.getText());
					textTotalHarga.setText("TOTAL = "+totalHarga+" (G)");
				}
			}
		});
		
	}
	
	public static void main(String [] args){
		launch();
	}
	
}