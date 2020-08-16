package mvc.animator.model;

/**
 * The concrete color class represents the color of the shape. The color is comprised of varying
 * units of red, green, and blue.
 */
public class ShapeColor {
  protected int redCode;
  protected int greenCode;
  protected int blueCode;

  /**
   * The color constructor takes in the red, green, and blue codes that create the color wanted as
   * well as the opaqueness of the color.
   *
   * @param red   the red code used to create the color
   * @param green the green code use to create the color
   * @param blue  the blue code use to create the color
   * @throws IllegalArgumentException when the red, blue, green color code is less than 0 or larger
   *                                  than 255. Also throws an exception when the opaqueness is less
   *                                  than 0 or greater than one.
   */
  public ShapeColor(int red, int green, int blue) throws IllegalArgumentException {
    if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
      throw new IllegalArgumentException("Please enter in create color codes for red, blue, "
              + "and green. Each code must be between 0 and 255 "
              + "(inclusive).");
    }
    this.redCode = red;
    this.greenCode = green;
    this.blueCode = blue;
  }

  /**
   * Returns the color code in a string format to the user.
   *
   * @return the red, green, and blue codes in a string format
   */
  String getColorCombo() {
    return "Color: (" + this.redCode + ", " + this.greenCode
            + ", " + this.blueCode + ")";
  }
}
