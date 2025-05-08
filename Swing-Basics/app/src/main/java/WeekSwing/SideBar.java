package WeekSwing;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SideBar extends JPanel {

    public SideBar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.DARK_GRAY);

        add(Box.createVerticalStrut(10));
        //Home
        add (new MenuItem("Home"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 0
        add (new MenuItem("Tier 0"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 1
        add (new MenuItem("Tier 1"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 2
        add (new MenuItem("Tier 2"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 3
        add (new MenuItem("Tier 3"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 4
        add (new MenuItem("Tier 4"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 5
        add (new MenuItem("Tier 5"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tier 6
        add (new MenuItem("Tier 6"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

    
        
}
}