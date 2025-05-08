package WeekSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Card extends JPanel {
    public Card(String characterName, String imagePath) {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(150, 200));

        // Add character image
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Load image using getResource
        ImageIcon icon = new ImageIcon(getClass().getResource("/" + imagePath));
        imageLabel.setIcon(icon);
        add(imageLabel, BorderLayout.CENTER);

        // Add character name
        JLabel nameLabel = new JLabel(characterName, JLabel.CENTER);
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setBackground(Color.WHITE);
        nameLabel.setOpaque(true);
        add(nameLabel, BorderLayout.SOUTH);
    }
}
