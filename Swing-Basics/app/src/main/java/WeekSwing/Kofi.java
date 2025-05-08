package WeekSwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Kofi extends JButton {
    public Kofi(String text) {
        super(text); 
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(140, 40));
        setBackground(Color.decode("#fc4c60"));
        
    }
}