package main.model;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;


public class HboxC {

	public static VBox createProfile(String imagePath, String fullName) {
		Image image = new Image(imagePath);
		if (image.isError()) {
			throw new IllegalArgumentException("Error loading the image: " + image.getException().getMessage());
		}

		Circle circle = new Circle();
		circle.setRadius(30);
		circle.setFill(new ImagePattern(image));

		VBox profileBox = new VBox();
		profileBox.setAlignment(Pos.CENTER);
		profileBox.setMinWidth(178);
		profileBox.setMinHeight(69);
		profileBox.setSpacing(3);

		Label profileName = new Label();
		profileName.setText(fullName);
		profileName.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");

		profileBox.getChildren().addAll(circle, profileName);
		profileBox.setPadding(new Insets(20, 30, 20, 0));
		profileBox.setOnMouseEntered(event -> {
			profileBox.setEffect(new DropShadow());
		});

		profileBox.setOnMouseExited(event -> {
			profileBox.setEffect(null);
		});
		return profileBox;
	}
}
