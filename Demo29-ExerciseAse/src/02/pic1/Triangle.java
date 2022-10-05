import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Path2D;

/**
 * Simple representation of a triangle.
 *
 * @author Nick Efford
 */
public class Triangle extends Shape {

  private int width, height;

  /**
   * Creates a triangle with the default fill colour.
   *
   * @param x Upper-left corner's x coordinate
   * @param y Upper-left corner's y coordinate
   * @param width Width of triangle's base
   * @param height Height of triangle
   */
  public Triangle(int x, int y, int width, int height) {
    this(x, y, width, height, Color.LIGHT_GRAY);
  }

  /**
   * Creates a triangle.
   *
   * @param x Upper-left corner's x coordinate
   * @param y Upper-left corner's y coordinate
   * @param width Width of triangle's base
   * @param height Height of triangle
   * @param fill Fill colour for triangle
   */
  public Triangle(int x, int y, int width, int height, Color fill) {
    super(x, y, fill);
    this.width = width;
    this.height = height;
  }

  /**
   * @return Width of this triangle's base
   */
  public int getWidth() {
    return width;
  }

  /**
   * @return Height of this triangle
   */
  public int getHeight() {
    return height;
  }

  /**
   * @return String representation of this triangle.
   */
  @Override
  public String toString() {
    return String.format("Triangle [x=%d,y=%d,w=%d,h=%d,%s]",
      getX(), getY(), width, height, getFill());
  }

  /**
   * Draws this triangle in the specified graphics context.
   *
   * @param context Graphics context for drawing
   */
  @Override
  public void draw(Graphics2D context) {
    Path2D path = new Path2D.Float();
    path.moveTo(getX(), getY());
    path.lineTo(getX()+width, getY());
    path.lineTo(getX()+0.5*width, getY()+height);
    path.lineTo(getX(), getY());

    Paint saved = context.getPaint();
    context.setPaint(getFill());
    context.fill(path);
    context.setPaint(Color.BLACK);
    context.draw(path);
    context.setPaint(saved);
  }
}
