package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.controller.Controller;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/app.fxml"));
			Scene scene = loader.load();
			Controller controller = loader.getController();
			controller.setStage(primaryStage);
			scene.getRoot();
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setScene(scene);
			controller.setAccounts();
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}