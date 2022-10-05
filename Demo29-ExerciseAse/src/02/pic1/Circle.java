import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Ellipse2D;

/**
 * Simple representation of a circle.
 *
 * @author Nick Efford
 */
public class Circle extends Shape {

  private int radius;

  /**
   * Creates a circle with the default fill colour.
   *
   * @param x Circle origin's x coordinate
   * @param y Circle origin's y coordinate
   * @param radius Radius of circle
   */
  public Circle(int x, int y, int radius) {
    this(x, y, radius, Color.LIGHT_GRAY);
  }

  /**
   * Creates a circle.
   *
   * @param x Circle origin's x coordinate
   * @param y Circle origin's y coordinate
   * @param radius Radius of circle
   * @param fill Fill colour for circle
   */
  public Circle(int x, int y, int radius, Color fill) {
    super(x, y, fill);
    this.radius = radius;
  }

  /**
   * @return Radius of this circle
   */
  public int getRadius() {
    return radius;
  }

  /**
   * @return String representation of this circle
   */
  @Override
  public String toString() {
    return String.format("Circle [x=%d,y=%d,r=%d,%s]",
      getX(), getY(), radius, getFill());
  }

  /**
   * Draws this circle in the specified graphics context.
   *
   * @param context Graphics context for drawing
   */
  @Override
  public void draw(Graphics2D context) {
    int size = 2*radius;
    Ellipse2D shape = new Ellipse2D.Float(getX()-radius, getY()-radius, size, size);

    Paint saved = context.getPaint();
    context.setPaint(getFill());
    context.fill(shape);
    context.setPaint(Color.BLACK);
    context.draw(shape);
    context.setPaint(saved);
  }
}
