package WeekSwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Discord extends JButton {
    public Discord(String text) {
        super(text); 
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(100, 40));
        setBackground(Color.decode("#7289da"));
        
    }
}
