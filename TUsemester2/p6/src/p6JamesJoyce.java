import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Tic Tac Toe games
 * 
 * @author James Joyce
 */
public class p6JamesJoyce extends JFrame{

    
    
    private JPanel panel;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b21;
    private JButton b22;
    private JButton b23;
    private JButton b31;
    private JButton b32;
    private JButton b33;    
    
    private final JButton panel2;
    private final JButton 
    
    /**
     * Constructor for the GridLayout
     */
    p6JamesJoyce() {
        // Creating GUI
        b11 = new JButton("");
        b12 = new JButton("");
        b13 = new JButton("");
        b21 = new JButton("");
        b22 = new JButton("");
        b23 = new JButton("");
        b31 = new JButton("");
        b32 = new JButton("");
        b33 = new JButton("");

        // Group elements in a panel
        panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(2, 3)); // 2 x 3 grid
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b21);
        panel.add(b22);
        panel.add(b23);
        panel.add(b31);
        panel.add(b32);
        panel.add(b33);

        // ContentPane's default layout manager: BorderLayout
        Container contentPane = getContentPane();
        contentPane.add(panel, "Center");

        // Adding action listeners
        ButtonObserver observer = new ButtonObserver();
        b11.addActionListener(observer);
        b12.addActionListener(observer);
        b13.addActionListener(observer);
        b21.addActionListener(observer);
        b22.addActionListener(observer);
        b23.addActionListener(observer);
        b31.addActionListener(observer);
        b32.addActionListener(observer);
        b33.addActionListener(observer);
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
            if (source == b11) {
                System.out.println("My First Name is James");
            } else if (source == b12) {
                System.out.println("1 pressed");
            } else if (source == b13) {
                System.out.println("2 pressed");
            } else if (source == b21) {
                System.out.println("3 pressed");
            } else if (source == b22) {
                System.out.println("4 pressed");
            } else if (source == b23) {
                System.out.println("5 pressed");
            } else {
                System.out.println("It's time to buy a new computer!");
            }
        }
    }
}

