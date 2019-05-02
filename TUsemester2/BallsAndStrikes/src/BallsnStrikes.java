
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author James Joyce
 */
public class BallsnStrikes extends JFrame {

    private final JPanel PanelC;
    private final JPanel PanelS;
    private JButton[] b = new JButton[12];
    private final JLabel LabelN;

    int x, y, z;
    int balls;
    int strikes;

    /**
     * Constructor for the GridLayout
     */
    public BallsnStrikes() {

        // Group elements in a panel
        PanelS = new JPanel();
        PanelS.setLayout(new java.awt.GridLayout(3, 4)); // 3 x 4 grid
        ButtonObserver observer = new ButtonObserver();

        //Buttons for PanelS
        for (int i = 0; i < b.length; i++) {
            if (i == 10) {
                b[i] = new JButton("New Game");
            } else if (i == 11) {
                b[i] = new JButton("Clear"); // clear button
                b[i].setEnabled(false);
            } else {
                b[i] = new JButton("" + i);
                b[i].setEnabled(false);
            }

            PanelS.add(b[i]);
            b[i].addActionListener(observer);
        }

        LabelN = new JLabel("PLAY BALL!!!");

        PanelC = new JPanel();

        // ContentPane's default layout manager: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(LabelN, "North");
        contentPane.add(PanelC, "Center");
        contentPane.add(PanelS, "South");

    }

    // Adding an event to the button pressed
    private class ButtonObserver implements ActionListener {

        /**
         * Button listener
         *
         * @param e trigger
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == b[10]) {
                for (int i = 0; i < 10; i++) {
                    b[i].setEnabled(true);
                }

                do {
                    x = (int) (Math.random() * 10);
                    y = (int) (Math.random() * 10);
                    z = (int) (Math.random() * 10);
                } while (x == y || y == z || x == z);

                LabelN.setText("Key = " + x + +y + +z);
            }
            
            if(source == b[1]){
                if(LabelN.getText().length() == 9){
                    LabelN.setText(LabelN.getText() + " | Guess " + b[0].getText());
                }
                else
                    LabelN.setText(LabelN.getText() + b[0].getText());
                
                b[0].setEnabled(false);
            }
        }
    }

    // Draw Panel responsible for drawing balls and strikes
    public class DrawPanel extends JPanel {

        private final int BALL_WIDTH = 50;
        private final int BALL_HEIGHT = 50;

        /**
         * Drawing Method
         *
         * @param g stores the graphics state-the current color, font, and so on
         */
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(Color.BLUE);
            g2.drawString("Ball(s)", 20, 70);
            int x = 0;
            for (int i = 0; i < balls; i++) {
                g2.fill(new Ellipse2D.Double(100 + x, 50, BALL_WIDTH, BALL_HEIGHT));
                x = x + BALL_WIDTH;
            }

            g2.setColor(Color.RED);
            g2.drawString("Strikes(s)", 20, 170);
            int y = 0;
            for (int i = 0; i < strikes; i++) {
                g2.fill(new Ellipse2D.Double(100 + y, 150, BALL_WIDTH, BALL_HEIGHT));
                y = y + BALL_WIDTH;
            }

            PanelC.repaint();

        }
    }
}
