import javax.swing.JFrame;

public class TriangulateTest {
	public static void main(String[] args) {
        JFrame frame = new Triangulate();

        frame.setSize(500, 500);
        frame.setLocation(500, 100);
        frame.setTitle("Triangulate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
