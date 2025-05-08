package WeekSwing;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Griddy extends JPanel {
    public Griddy() {
        setLayout(new GridLayout(0, 4, 10, 10)); // 0 rows (dynamic), 4 columns, 10px gaps
        setBackground(java.awt.Color.BLACK);

        //  character data
        String[] characterNames = {"Goku", "Naruto", "Aizen", "Luffy", "Rimuru", "Deku", "Zoro", "Arata Kasuga", "Gojo Satoru", "Boruto Manga","Muzan","Tanjiro","Anos","Kirito","Kaido"};
        String[] imagePaths = {
            "goku.png", // Replace with actual image paths
            "Naruto.Jpg",
            "Aizen.jpg",
            "Luffy.jpg",
            "Rimuru.jpg",
            "Deku.jpg",
            "Zoro.jpg",
            "Arata.jpg",
            "Gojo.jpg",
            "Boruto.jpg",
            "Muzan.jpg",
            "Tanjiro.jpg",
            "Anos.jpg",
            "Kirito.jpg",
            "Kaido.jpg"
        };

        // Add cards to the grid
        for (int i = 0; i < characterNames.length; i++) {
            add(new Card(characterNames[i], imagePaths[i]));
        }
    }
}
