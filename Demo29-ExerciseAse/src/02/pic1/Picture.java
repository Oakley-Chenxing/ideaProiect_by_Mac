import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a picture as a collection of shapes.
 *
 * @author Nick Efford
 * @version 1.4 (2016-03-15)
 */
public class Picture {

  private List<Shape> shapes;

  /**
   * Creates an empty picture.
   */
  public Picture() {
    shapes = new ArrayList<>();
  }

  /**
   * Creates a picture containing some shapes.
   */
  public Picture(List<Shape> shapes) {
    this.shapes = shapes;
  }

  /**
   * Adds a shape to this picture.
   *
   * @param shape Shape to be added
   */
  public void add(Shape shape) {
    shapes.add(shape);
  }

  /**
   * Draws this picture in the specified graphics context.
   *
   * @param context Graphics context used for drawing
   */
  public void draw(Graphics2D context) {
    for (Shape shape: shapes) {
      shape.draw(context);
    }
  }
}
