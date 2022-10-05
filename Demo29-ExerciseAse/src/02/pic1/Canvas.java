import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

/**
 * A GUI component within which a Picture can be drawn.
 *
 * @author Nick Efford
 */
public class Canvas extends JComponent {

  private static final long serialVersionUID = 1L;
  private static final int CANVAS_WIDTH = 400;
  private static final int CANVAS_HEIGHT = 400;

  private Picture picture;

  /**
   * Creates a Canvas.
   */
  public Canvas(Picture picture) {
    setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    this.picture = picture;
  }

  @Override public void paintComponent(Graphics context) {
    super.paintComponent(context);

    Graphics2D graphics = (Graphics2D) context;
    graphics.setRenderingHint(
      RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON);
    graphics.setRenderingHint(
      RenderingHints.KEY_INTERPOLATION,
      RenderingHints.VALUE_INTERPOLATION_BILINEAR);

    picture.draw(graphics);
  }
}
