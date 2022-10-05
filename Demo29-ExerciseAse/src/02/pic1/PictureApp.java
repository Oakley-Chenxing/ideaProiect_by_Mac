import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 * A simple picture drawing application.
 *
 * @author Nick Efford
 */
public class PictureApp implements Runnable {
  /**
   * Creates GUI for this application.
   */
  public void run() {
    // Create a picture

    Picture picture = new Picture();

    picture.add(new Rectangle(45, 30, 30, 30, Color.DARK_GRAY));
    picture.add(new Rectangle(285, 150, 90, 65, Color.BLUE));
    picture.add(new Circle(100, 185, 50, Color.MAGENTA));
    picture.add(new Rectangle(15, 120, 25, 60, Color.GREEN));
    picture.add(new Circle(290, 110, 60));
    picture.add(new Circle(165, 320, 35, Color.YELLOW));
    picture.add(new Triangle(175, 205, 70, 55, Color.RED));

    // Display picture in a window

    JFrame frame = new JFrame("Picture App");
    Canvas canvas = new Canvas(picture);
    frame.add(new JScrollPane(canvas), BorderLayout.CENTER);

    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);    
  }

  /**
   * Application entry point.
   *
   * @param args Command-line arguments (unused)
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new PictureApp());
  }
}
