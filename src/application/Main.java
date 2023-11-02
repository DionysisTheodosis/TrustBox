package application;
	
import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			File fxmlFile = new File("C:\\Users\\dionysis\\eclipse-workspace\\MyProject\\src\\app.fxml");
            URL url = fxmlFile.toURI().toURL();

            FXMLLoader loader = new FXMLLoader(url);
            Scene scene = loader.load();

           
            Controller controller = loader.getController();
            controller.setStage(primaryStage);

            scene.getRoot();

            primaryStage.initStyle(StageStyle.UNDECORATED);

          
            primaryStage.setScene(scene);
            controller.setAccounts();

            primaryStage.show();
	          
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
