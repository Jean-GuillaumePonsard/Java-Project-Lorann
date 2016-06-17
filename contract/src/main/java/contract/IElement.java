package contract;

import java.awt.Image;

public interface IElement {

	/**
	 * Gets the permeability.
	 *
	 * @return the permeability of the element
	 */

	Permeability getPermeability();

	/**
	 * Sets the permeability.
	 *
	 * @param permeability
	 *          the new permeability
	 */

	void setPermeability(Permeability permeability);

	/**
	 * Gets the element's image.
	 *
	 * @return the element's image
	 */

	Image getImage();

	/**
	 * Sets the image.
	 *
	 * @param image
	 *          the new image by image
	 */

	void setImage(Image image);

	/**
	 * Sets the image.
	 *
	 * @param url
	 *          the new image's url
	 */

	void setImage(String url);

	/**
	 * Gets the element's x position.
	 *
	 * @return the element's x position
	 */

	int getX();

	/**
	 * Sets the element's x position.
	 *
	 * @param x
	 *          the x position of the element
	 */

	void setX(int x);

	/**
	 * Gets the element's y position.
	 *
	 * @return the element's y position
	 */

	int getY();

	/**
	 * Sets the element's y position.
	 *
	 * @param y
	 *          the y position of the element
	 */

	void setY(int y);

}