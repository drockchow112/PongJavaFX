import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wall implements Item {
	private Image image;
	private ImageView imageView;
	
	public Wall(double w) {
		image = new Image("images//wall.png");
		setImageView(new ImageView(image));
		imageView.setFitWidth(w);
        imageView.setFitHeight(w);
	}

	/**
	 * @return the imageView
	 */
	public ImageView getImageView() {
		return imageView;
	}

	/**
	 * @param imageView the imageView to set
	 */
	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
	}

}
