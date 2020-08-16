package mvc.animator.model;

/**
 * The ShapeAbs class serves as the abstract superclass for the Rectangle and Oval concrete class.
 */

abstract class ShapeAbs implements Shape {
  protected int shapeIndex;
  protected String shapeName;
  protected double xCord;
  protected double yCord;
  protected ShapeColor shapeColor;
  protected double dimensionOne;
  protected double dimensionTwo;

  /**
   * The ShapeAbs constructor serves as the super constructor for all of the individual shapes
   * themselves. It will store the index, name, x-coordinate, y-coordinate, and color of the shape.
   *
   * @param shapeIndex the index of the shape (aka the position it was added)
   * @param name  the name of the shape
   * @param x     x-coordinate of the shape
   * @param y     y-coordinate of the shape
   * @param shapeColor the color of the shape
   * @throws IllegalArgumentException if the color object passed is null.
   */
  public ShapeAbs(int shapeIndex, String name, double x, double y, ShapeColor shapeColor,
                  double dimOne, double dimTwo) throws IllegalArgumentException {

    if (shapeColor == null) {
      throw new IllegalArgumentException("Please put in correct color for the shape!");
    }

    if (dimOne <= 0 || dimTwo <= 0) {
      throw new IllegalArgumentException("Dimension one and two must be larger than 0");
    }
    this.shapeIndex = shapeIndex;
    this.shapeName = name;
    this.xCord = x;
    this.yCord = y;
    this.shapeColor = shapeColor;
    this.dimensionOne = dimOne;
    this.dimensionTwo = dimTwo;
  }

  @Override
  public double getX() {
    return this.xCord;
  }

  @Override
  public double getY() {
    return this.yCord;
  }

  @Override
  public String getShapeColor() {
    return this.shapeColor.getColorCombo();
  }

  @Override
  public String getShapeName() {
    return this.shapeName;
  }

  @Override
  public int getShapeIndex() {
    return this.shapeIndex;
  }

  @Override
  public double[] getColorCode() {
    return new double[]{this.shapeColor.redCode, this.shapeColor.greenCode,
      this.shapeColor.blueCode};
  }

  @Override
  public ShapeAbs clone() {
    return null;
  }
}
