package application;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
//me lene
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button addButton;

	@FXML
	private AnchorPane bankPane;

	@FXML
	private Tab bankTab;

	@FXML
	private AnchorPane generalPane;

	@FXML
	private Tab generalTab;

	@FXML
	private HBox hbox;

	@FXML
	private AnchorPane leftPane;

	@FXML
	private ImageView logOutButton;

	@FXML
	private AnchorPane logedPane;

	@FXML
	private Scene scene;

	@FXML
	private ScrollPane scrollPanel;

	@FXML
	private TabPane tabPane;

	@FXML
	private AnchorPane taxisnetPane;

	@FXML
	private Tab taxisnetTab;

	@FXML
	private Label title;

	@FXML
	private VBox vBox;
	@FXML
	private Label name1;
	@FXML
	private Circle circle;
	@FXML
	private VBox vbox1;
	@FXML
	private TextField phone;
	@FXML
	private TextField afm;
	@FXML
	private TextField amka;
	@FXML
	private TextField email;
	@FXML
	private TextField id;
	@FXML
	private ImageView idImage;
	@FXML
	private TextField lastname;
	@FXML
	private TextField surname;
	@FXML
	private ImageView flip_id;
	@FXML
	private ImageView idImage1;
	@FXML
	private Circle profilePick;
	@FXML
	private StackPane stackPane;
	@FXML
	private Button saveProfile;
	@FXML
	private ImageView newUserButton;

	private Stage primaryStage;
	private double xOffset = 0;
	private double yOffset = 0;
	private int counter = 0;
	private boolean flipBool;
	private List<Image> idImages;
	private ContextMenu contextMenu;

	public void setStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}


	@FXML
	void initialize() {

		  assert afm != null : "fx:id=\"afm\" was not injected: check your FXML file 'app.fxml'.";
	        assert amka != null : "fx:id=\"amka\" was not injected: check your FXML file 'app.fxml'.";
	        assert bankPane != null : "fx:id=\"bankPane\" was not injected: check your FXML file 'app.fxml'.";
	        assert bankTab != null : "fx:id=\"bankTab\" was not injected: check your FXML file 'app.fxml'.";
	        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'app.fxml'.";
	        assert flip_id != null : "fx:id=\"flip_id\" was not injected: check your FXML file 'app.fxml'.";
	        assert generalPane != null : "fx:id=\"generalPane\" was not injected: check your FXML file 'app.fxml'.";
	        assert generalTab != null : "fx:id=\"generalTab\" was not injected: check your FXML file 'app.fxml'.";
	        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'app.fxml'.";
	        assert idImage != null : "fx:id=\"idImage\" was not injected: check your FXML file 'app.fxml'.";
	        assert idImage1 != null : "fx:id=\"idImage1\" was not injected: check your FXML file 'app.fxml'.";
	        assert lastname != null : "fx:id=\"lastname\" was not injected: check your FXML file 'app.fxml'.";
	        assert leftPane != null : "fx:id=\"leftPane\" was not injected: check your FXML file 'app.fxml'.";
	        assert logOutButton != null : "fx:id=\"logOutButton\" was not injected: check your FXML file 'app.fxml'.";
	        assert logedPane != null : "fx:id=\"logedPane\" was not injected: check your FXML file 'app.fxml'.";
	        assert newUserButton != null : "fx:id=\"newUserButton\" was not injected: check your FXML file 'app.fxml'.";
	        assert phone != null : "fx:id=\"phone\" was not injected: check your FXML file 'app.fxml'.";
	        assert profilePick != null : "fx:id=\"profilePick\" was not injected: check your FXML file 'app.fxml'.";
	        assert scene != null : "fx:id=\"scene\" was not injected: check your FXML file 'app.fxml'.";
	        assert scrollPanel != null : "fx:id=\"scrollPanel\" was not injected: check your FXML file 'app.fxml'.";
	        assert surname != null : "fx:id=\"surname\" was not injected: check your FXML file 'app.fxml'.";
	        assert tabPane != null : "fx:id=\"tabPane\" was not injected: check your FXML file 'app.fxml'.";
	        assert taxisnetPane != null : "fx:id=\"taxisnetPane\" was not injected: check your FXML file 'app.fxml'.";
	        assert taxisnetTab != null : "fx:id=\"taxisnetTab\" was not injected: check your FXML file 'app.fxml'.";
	        assert vBox != null : "fx:id=\"vBox\" was not injected: check your FXML file 'app.fxml'.";
//		scrollPanel.setHmax(0); // Set horizontal maximum value to 0
//		scrollPanel.setHmin(0);
		// cssStyleSheet = getClass().getResource("application.css").toExternalForm();

		Image image1 = new Image(getClass().getResource("/resources/images/logoutS.png").toExternalForm());
		if (image1.isError()) {
			System.err.println("Error loading the image: " + image1.getException().getMessage());
		}
		Image newUserImage = new Image(getClass().getResource("/resources/images/newUserIcon32.png").toExternalForm());
		if (newUserImage.isError()) {
			System.err.println("Error loading the image: " + newUserImage.getException().getMessage());
		}
		newUserButton.setImage(newUserImage);
		// Add a custom style class if needed

		logOutButton.setImage(image1);
		logOutButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-weight: bold;");
		Image flip = new Image(getClass().getResource("/resources/images/flipId_32.png").toExternalForm());
		if (flip.isError()) {
			System.err.println("Error loading the image: " + flip.getException().getMessage());
		}
		flip_id.setImage(flip);


		// scrollPanel.getStyleClass().add(cssStyleSheet);

		vBox.setStyle("-fx-background-color:#b4592a;");
		Platform.runLater(() -> {
			TabPane tabPane = (TabPane) scene.lookup("#tabPane");
			Region headerBackground = (Region) tabPane.lookup(".tab-header-background");

			if (headerBackground != null) {
				headerBackground.setOnMousePressed(event -> {
					xOffset = event.getSceneX();
					yOffset = event.getSceneY();
				});

				headerBackground.setOnMouseDragged(event -> {
					primaryStage.setX(event.getScreenX() - xOffset);
					primaryStage.setY(event.getScreenY() - yOffset);
				});
			}
		});
		flipBool=false;
		idImages = new LinkedList<>();
		contextMenu = new ContextMenu();

        // Create a "Copy" MenuItem
        MenuItem copyItem = new MenuItem("Copy");
        copyItem.setOnAction(e -> {
            // Perform copy action here
        	copyImage();
            System.out.println("Copy action executed");
        });

        // Create a "Save As" MenuItem
        MenuItem saveAsItem = new MenuItem("Save As");
        saveAsItem.setOnAction(e -> {
            saveImage();
            System.out.println("Save As action executed");
        });

        // Add items to the ContextMenu
        contextMenu.getItems().addAll(copyItem, saveAsItem);
        idImage.addEventHandler(MouseEvent.DRAG_DETECTED, mouseEvent -> {
        	  Dragboard db = idImage.startDragAndDrop(TransferMode.COPY);
        	  ClipboardContent content = new ClipboardContent();
        	  content.putImage(idImage.getImage());
        	  db.setContent(content);
        	  mouseEvent.consume();
        	});

        // Attach the ContextMenu to the ImageView when the context menu is requested
      
	}

	@FXML
	public void logout(MouseEvent event) {
		if (event.getButton() == MouseButton.PRIMARY) {
			System.exit(0);
		}
	}
	@FXML
	public void flip_image(MouseEvent event) {
		if (event.getButton() == MouseButton.PRIMARY) {
			if (flipBool) {
				idImage.setImage(idImages.get(0));
//				idImage.setFitHeight(199);
//				idImage.setFitWidth(377);
				flipBool = false;
			} else {
				idImage.setImage(idImages.get(1));
				flipBool = true;
			}
		}
	}
	@FXML
	public void newProfile(MouseEvent event) {
		System.out.println("make profile");
	}

	public void setAccounts() {
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account("Διονύσιος", "Θεοδόσης", "δσαδασ", "αδασασδ", "αδασδδ", "δασδασδ", "σδασδα"));
		accounts.add(new Account("Νικόλαος", "Θεοδόσης", "δσαδασ", "αδασασδ", "αδασδδ", "δασδασδ", "σδασδα"));
		accounts.add(new Account("Γιαννούλα", "Κουρή", "δσαδασ", "αδασασδ", "αδασδδ", "δασδασδ", "σδασδα"));
		accounts.add(new Account("Παραδεισένια", "Θεοδόση", "δσαδασ", "αδασασδ", "αδασδδ", "δασδασδ", "σδασδα"));
		accounts.add(new Account("Κατερίνα", "Θεοδόση", "δσαδασ", "αδασασδ", "αδασδδ", "δασδασδ", "σδασδα"));
		accounts.add(new Account("Παρέδεισος", "Θεοδόση", "δσαδασ", "αδασασδ", "αδασδδ", "δασδασδ", "σδασδα"));
		// HashMap<VBox, Account> profileMap = new HashMap<>();
		boolean first = true;
		List<VBox> profiles = new ArrayList<>();
		for (Account ac : accounts) {
			if (first) {
				ac.setImageS(getClass().getResource("/resources/images/myImage (Custom).png").toExternalForm());
				ac.setImageL(getClass().getResource("/resources/images/myImage.png").toExternalForm());
				ac.setImageFIdPath("file:/C:/Users/dionysis/Videos/walpapers/tautothta.png");
				ac.setImageBIdPath("file:/C:/Users/dionysis/Videos/walpapers/tautpisw.jpg");
				first = false;
			} else {
				ac.setImageS(getClass().getResource("/resources/images/users64_icon.png").toExternalForm());
				ac.setImageL(getClass().getResource("/resources/images/users_icon.png").toExternalForm());
				ac.setImageFIdPath(getClass().getResource("/resources/images/imageNotAvailable.png").toExternalForm());
				ac.setImageBIdPath(getClass().getResource("/resources/images/imageNotAvailable.png").toExternalForm());
			}
		}

		for (Account ac : accounts) {

			profiles.add(HboxC.createProfile(ac.getImageSPath(), ac.getName() + " " + ac.getLastName()));
			profiles.get(counter).setOnMouseClicked(event -> {
				if (event.getButton() == MouseButton.PRIMARY) {
					idImages.clear();
					phone.setText(ac.getTel());
					afm.setText(ac.getAfm());
					amka.setText(ac.getAmka());
					email.setText(ac.getEmail());
					id.setText(ac.getId());
					Image image = new Image(ac.getImageLPath());
					if (image.isError()) {
						System.err.println("Error loading the image: " + image.getException().getMessage());
					} 
					profilePick.setRadius(71);
					profilePick.setFill(new ImagePattern(image));
					// profilePick.setEffect(new DropShadow());
					lastname.setText(ac.getLastName());
					surname.setText(ac.getName());
					
					idImages.add(new Image(ac.getImageFIdPath()));
					idImages.add(new Image(ac.getImageBIdPath()));
					for(Image im:idImages) {
						if (im.isError()) {
							System.err.println("Error loading the image: " + im.getException().getMessage());
						}
					}
					idImage.setImage(idImages.get(0));
					
				}
			});

			counter++;
		}
		vBox.getChildren().addAll(profiles);
		vBox.setSpacing(30);
		phone.setText(accounts.get(0).getTel());
		afm.setText(accounts.get(0).getAfm());
		amka.setText(accounts.get(0).getAmka());
		email.setText(accounts.get(0).getEmail());
		id.setText(accounts.get(0).getId());
		idImages.add(new Image(accounts.get(0).getImageFIdPath()));
		idImages.add(new Image(accounts.get(0).getImageBIdPath()));
		for(Image im:idImages) {
			if (im.isError()) {
				System.err.println("Error loading the image: " + im.getException().getMessage());
			} 
		}
		
		Image image = new Image(accounts.get(0).getImageLPath());
		if (image.isError()) {
			System.err.println("Error loading the image: " + image.getException().getMessage());
		} 
		profilePick.setRadius(71);
		profilePick.setFill(new ImagePattern(image));
		lastname.setText(accounts.get(0).getLastName());
		surname.setText(accounts.get(0).getName());
		idImage.setImage(idImages.get(0));
		counter = 0;
		
	}
	@FXML
	public void imageMenu(ContextMenuEvent event) {
	     contextMenu.show(idImage, event.getScreenX(), event.getScreenY());
	}
	public void saveImage() {
		System.out.println("Apo");
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.jpg"));
		File file = fileChooser.showSaveDialog(primaryStage);
		if (file != null) {
		    try {
		        ImageIO.write(SwingFXUtils.fromFXImage(idImage.getImage(), null), "jpg", file);
		    } catch (IOException ex) {
		        System.out.println(ex.getMessage());
		    }
		}
	}
	public void copyImage() {
		 Clipboard clipboard = Clipboard.getSystemClipboard();
		 ClipboardContent content = new ClipboardContent();
		 // for paste as image, e.g. in GIMP
		 content.putImage(idImage.getImage()); // the image you want, as javafx.scene.image.Image
		 // for paste as file, e.g. in Windows Explorer
		 content.putFiles(java.util.Collections.singletonList(new File("C:\\Users\\Admin\\Desktop\\my\\id.png")));
		 clipboard.setContent(content);
	}
	@FXML
	public void newProfileClicked(MouseEvent event) {
		if(event.getButton()==MouseButton.PRIMARY) {
			tabPane.setVisible(false);
			stackPane.setVisible(true);
		}
	}
	@FXML
	public void saveProfileClicked() {
		
			stackPane.setVisible(false);
			tabPane.setVisible(true);
			
		}}