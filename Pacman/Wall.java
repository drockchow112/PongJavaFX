import java.io.Serializable;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

@SuppressWarnings("serial")
public class Wall implements Item, Serializable{
	private transient Image image;		// image of the wall
	private transient ImageView imageView;
	
	public Wall(double w) {
		image = new Image("images//wall.png");
		setImageView(new ImageView(image));
		imageView.setFitWidth(w);
        imageView.setFitHeight(w);
	}

	/**
	 * accessor method to get the ImageView object
	 * @param none
	 * @return imageView an ImageView object
	 */
	public ImageView getImageView() {
		return imageView;
	}

	/**
	 * mutator to set the ImageView object
	 * @param imageView an ImageView object
	 * @return void
	 */
	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
	}

}
