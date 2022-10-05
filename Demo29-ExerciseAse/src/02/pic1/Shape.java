import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Abstract superclass for different kinds of shape.
 *
 * @author Nick Efford
 */
public abstract class Shape {

  private int x, y;
  private Color fill;

  /**
   * Creates a Shape with a default fill colour.
   *
   * @param x Shape's x coordinate
   * @param y Shape's y coordinate
   */
  public Shape(int x, int y) {
    this(x, y, Color.LIGHT_GRAY);
  }

  /**
   * Creates a Shape.
   *
   * @param x Shape's x coordinate
   * @param y Shape's y coordinate
   * @param fill Fill colour for the shape
   */
  public Shape(int x, int y, Color fill) {
    this.x = x;
    this.y = y;
    this.fill = fill;
  }

  /**
   * @return x coordinate of this shape
   */
  public int getX() {
    return x;
  }

  /**
   * @return y coordinate of this shape
   */
  public int getY() {
    return y;
  }

  /**
   * @return fill colour of this shape
   */
  public Color getFill() {
    return fill;
  }

  /**
   * @return String representation of this shape
   */
  @Override
  public String toString() {
    return String.format("Shape [x=%d,y=%d,%s]", x, y, fill);
  }

  /**
   * Draws this shape into the given graphics context.
   *
   * <p>Note: no implementation provided, as this is an abstract method.
   * The implementation will be provided by concrete subclasses of
   * Shape that override this method.</p>
   *
   * @param context Graphics context into which shape will be drawn
   */
  public abstract void draw(Graphics2D context);
}
