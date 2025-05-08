package WeekSwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MenuItem extends JButton {
    public MenuItem(String text) {
        
        setText(text);
        setHorizontalAlignment(CENTER);
        setHorizontalTextPosition(CENTER);
        setVerticalAlignment(CENTER);
        setForeground(Color.WHITE);
        setBackground(Color.GRAY);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
        setOpaque(true); 
        setAlignmentX(CENTER_ALIGNMENT); 
        setMaximumSize(new Dimension(Integer.MAX_VALUE, getPreferredSize().height));
    }
}