
import javax.swing.JFrame;

/**
 * @author James Joyce
 */
public class GameTest {
        public static void main(String[] args) {
        JFrame frame = new BallnStrikes();

        frame.setSize(500, 500);
        frame.setLocation(500, 100);
        frame.setTitle("Grid Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
