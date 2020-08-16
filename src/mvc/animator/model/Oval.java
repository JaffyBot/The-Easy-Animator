package mvc.animator.model;

/**
 * This concrete Oval class represents an oval that will be created in the animation. It extends the
 * ShapeAbs class and inherits all of the properties from the class.
 */
public class Oval extends ShapeAbs {

  /**
   * The oval constructor calls the super constructor from the ShapeAbs class, but also stores the
   * xRadius and yRadius information that will be important in knowing for the creation of the
   * oval.
   *
   * @param shapeIndex the index of the shape
   * @param name    the name of the shape.
   * @param x       x-coordinate of the oval
   * @param y       y-coordinate of the oval
   * @param color   the color of the oval
   * @param xRadius the length of the x radius (horizontal radius) of the oval
   * @param yRadius the length of the y radius (vertical radius) of the oval
   * @throws IllegalArgumentException when the xRadius or yRadius is less than or equal to 0.
   */

  protected Oval(int shapeIndex, String name, double x, double y, ShapeColor color, double xRadius,
                 double yRadius) throws IllegalArgumentException {
    super(shapeIndex, name, x, y, color, xRadius, yRadius);
  }

  @Override
  public double getArea() {
    return this.dimensionOne * this.dimensionTwo * Math.PI;
  }

  /**
   * Returns the length of the x radius (horizontal radius) of the oval.
   *
   * @return the x radius of the oval
   */
  public double getXRadius() {
    return this.dimensionOne;
  }

  /**
   * Returns the length of the y radius (vertical radius) of the oval.
   *
   * @return the y radius of the oval
   */
  public double getYRadius() {
    return this.dimensionTwo;
  }

  @Override
  public String toString() {
    return String.format("Type: %s\n"
                    + "Center: (%.2f,%.2f), X radius: %.2f, Y radius: %.2f, %s\n",
            "Oval", getX(), getY(), getXRadius(), getYRadius(), getShapeColor());
  }

  @Override
  public Oval clone() {
    return new Oval(this.shapeIndex, this.shapeName, this.xCord,this.yCord,
            new ShapeColor(this.shapeColor.redCode, this.shapeColor.greenCode,
                    this.shapeColor.blueCode),this.dimensionOne,this.dimensionTwo);
  }
}