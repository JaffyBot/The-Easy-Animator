package mvc.animator.model;

/**
 * This concrete Rectangle class represents an rectangle that will be created in the animation.
 * It extends the ShapeAbs class and inherits all of the properties from the class.
 */
public class Rectangle extends ShapeAbs {

  /**
   * The rectangle constructor calls the super constructor from the ShapeAbs class, but also stores
   * the height and width information that will be important in knowing for the creation of
   * the rectangle.
   *
   * @param shapeIndex the index of the shape
   * @param name the name of the shape
   * @param x x-coordinate of the rectangle
   * @param y y-coordinate of the rectangle
   * @param shapeColor the color of the rectangle
   * @param height the height of the rectangle
   * @param width the width of the rectangle
   * @throws IllegalArgumentException when the height or width is less than or equal to 0.
   */
  protected Rectangle(int shapeIndex, String name, double x, double y, ShapeColor shapeColor,
                      double height, double width) throws IllegalArgumentException {
    super(shapeIndex, name, x, y, shapeColor, height, width);
  }

  @Override
  public double getArea() {
    return this.dimensionOne * this.dimensionTwo;
  }

  /**
   * Returns the height of the rectangle.
   *
   * @return the height of the rectangle
   */
  public double getHeight() {
    return this.dimensionTwo;
  }

  /**
   * Returns the width of the rectangle.
   *
   * @return the width of the rectangle
   */
  public double getWidth() {
    return this.dimensionOne;
  }

  @Override
  public String toString() {
    return String.format("Type: %s\n"
                    + "Min Corner: (%.0f,%.0f), Width: %.0f, Height: %.0f, %s\n",
            "Rectangle", getX(), getY(), getWidth(), getHeight(), getShapeColor());
  }

  @Override
  public Rectangle clone() {
    return new Rectangle(this.shapeIndex, this.shapeName, this.xCord,this.yCord,
            new ShapeColor(this.shapeColor.redCode, this.shapeColor.greenCode,
                    this.shapeColor.blueCode),this.dimensionOne,this.dimensionTwo);
  }
}