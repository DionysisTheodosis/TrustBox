package application;


public class Account {
	private final String name;
	private final String lastName;
	private final String afm;
	private final String amka;
	private  String email;
	private  String tel;
	private final String id;
	private String imageSPath;
	private String imageLPath;
	private String imageFIdPath;
	private String imageBIdPath;
	
	public String getImageFIdPath() {
		return imageFIdPath;
	}
	public void setImageFIdPath(String imageFIdPath) {
		this.imageFIdPath = imageFIdPath;
	}
	public String getImageBIdPath() {
		return imageBIdPath;
	}
	public void setImageBIdPath(String imageBIdPath) {
		this.imageBIdPath = imageBIdPath;
	}
	public Account(String name, String lastName, String afm, String amka, String email, String tel, String id) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.afm = afm;
		this.amka = amka;
		this.email = email;
		this.tel = tel;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAfm() {
		return afm;
	}
	public String getAmka() {
		return amka;
	}
	public String getEmail() {
		return email;
	}
	public String getTel() {
		return tel;
	}
	public String getId() {
		return id;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public void setImageL(String image) {
		this.imageLPath=image;
	}
	public String getImageLPath() {
		return imageLPath;
	}
	public void setImageS(String image) {
		this.imageSPath=image;
	}
	public String getImageSPath() {
		return imageSPath;
	}
	
	
}
