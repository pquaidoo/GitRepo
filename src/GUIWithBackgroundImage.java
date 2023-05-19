import javax.swing.*;
import java.awt.*;

class GUIWithBackgroundImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI with Background Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Set the layout to null to allow custom positioning
        frame.setLayout(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                // Load the background image
                Image backgroundImage = new ImageIcon("src\\space.jpg").getImage();


                // Draw the background image
                g.drawImage(backgroundImage, 0, -140, null);
            }
        };
//        protected void paintComponent(Graphics g) {
//            // Load the background image
//            Image backgroundImage = new ImageIcon("src\\Planets.jpg").getImage();
//
//
//            // Draw the background image
//            g.drawImage(backgroundImage, 0, 0, null);
//        }
//    };

        // Set the panel to the size of the frame
        panel.setSize(frame.getSize());

        // Create a label for the word in the middle
        JLabel wordLabel = new JLabel("Hello");
        wordLabel.setFont(new Font("Arial", Font.BOLD, 48));
        wordLabel.setForeground(Color.WHITE);

        // Get the size of the word label
        Dimension wordSize = wordLabel.getPreferredSize();

        // Calculate the position to center the word label
        int x = (frame.getWidth() - wordSize.width) / 2;
        int y = (frame.getHeight() - wordSize.height) / 2;

        // Set the position of the word label
        wordLabel.setBounds(x, y, wordSize.width, wordSize.height);

        // Add the word label to the panel
        panel.add(wordLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);

    }
}
