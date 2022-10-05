import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

/**
 * Simple representation of a rectangle.
 *
 * @author Nick Efford
 */
public class Rectangle extends Shape {

  private int width, height;

  /**
   * Creates a rectangle with the default fill colour.
   *
   * @param x Upper-left corner's x coordinate
   * @param y Upper-left corner's y coordinate
   * @param width Width of rectangle
   * @param height Height of rectangle
   */
  public Rectangle(int x, int y, int width, int height) {
    this(x, y, width, height, Color.LIGHT_GRAY);
  }

  /**
   * Creates a rectangle.
   *
   * @param x Upper-left corner's x coordinate
   * @param y Upper-left corner's y coordinate
   * @param width Width of rectangle
   * @param height Height of rectangle
   * @param fill Fill colour for rectangle
   */
  public Rectangle(int x, int y, int width, int height, Color fill) {
    super(x, y, fill);
    this.width = width;
    this.height = height;
  }

  /**
   * @return Width of this rectangle
   */
  public int getWidth() {
    return width;
  }

  /**
   * @return Height of this rectangle
   */
  public int getHeight() {
    return height;
  }

  /**
   * @return String representation of this rectangle.
   */
  @Override
  public String toString() {
    return String.format("Rectangle [x=%d,y=%d,w=%d,h=%d,%s]",
      getX(), getY(), width, height, getFill());
  }

  /**
   * Draws this rectangle in the specified graphics context.
   *
   * @param context Graphics context for drawing
   */
  @Override
  public void draw(Graphics2D context) {
    Rectangle2D shape = new Rectangle2D.Float(getX(), getY(), width, height);

    Paint saved = context.getPaint();
    context.setPaint(getFill());
    context.fill(shape);
    context.setPaint(Color.BLACK);
    context.draw(shape);
    context.setPaint(saved);
  }
}
