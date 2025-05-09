package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Character {
    String name;
    ImageIcon image;

    public Character(String name, String imagePath) {
        this.name = name;
        this.image = new ImageIcon(imagePath);
    }
}

public class CharacterListUI extends JFrame {

    public CharacterListUI() {
        setTitle("Character List");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLayout(new BorderLayout());

        add(createNavbar(), BorderLayout.NORTH);
        add(createSidebar(), BorderLayout.WEST);
        add(createCharacterGrid(), BorderLayout.CENTER);

        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

    private JPanel createNavbar() {
        JPanel navbar = new JPanel(new BorderLayout());
        navbar.setBackground(Color.DARK_GRAY);
        navbar.setPreferredSize(new Dimension(100, 40));

        JLabel title = new JLabel("Power Scale Character Anime");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("SansSerif", Font.BOLD, 16));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setOpaque(false);

        JButton discordButton = createNavbarButton("Join Discord", new Color(59, 89, 152));
        JButton koFiButton = createNavbarButton("Buy us a Ko-Fi", new Color(255, 85, 85));

        buttonPanel.add(discordButton);
        buttonPanel.add(koFiButton);

        navbar.add(title, BorderLayout.WEST);
        navbar.add(buttonPanel, BorderLayout.EAST);

        return navbar;
    }

    private JButton createNavbarButton(String text, Color bg) {
        JButton button = new JButton(text);
        button.setBackground(bg);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        return button;
    }

    private JPanel createSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(new Color(50, 50, 50));
        sidebar.setPreferredSize(new Dimension(150, getHeight()));

        String[] buttons = {
            "Home", "Tier 1", "Tier 2", "Tier 3",
            "Tier 4", "Tier 5", "Tier 6", "Tier 7"
        };

        for (String btnText : buttons) {
            JButton button = new JButton(btnText);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.setMaximumSize(new Dimension(140, 40));
            button.setBackground(new Color(70, 70, 70));
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            button.setBorderPainted(false);
            button.setMargin(new Insets(10, 20, 10, 20));
            sidebar.add(Box.createVerticalStrut(10));
            sidebar.add(button);
        }

        return sidebar;
    }

    private JScrollPane createCharacterGrid() {
        int columnCount = 4;

        JPanel gridPanel = new JPanel(new GridLayout(0, columnCount, 10, 10));
        gridPanel.setBackground(Color.DARK_GRAY);
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        List<Character> characters = generateCharacters();

        for (Character character : characters) {
            JPanel card = new JPanel();
            card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
            card.setBackground(Color.WHITE);
            card.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            card.setPreferredSize(new Dimension(200, 200)); // Total size

            // Gambar karakter
            JLabel imageLabel = new JLabel();
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            imageLabel.setPreferredSize(new Dimension(200, 160)); // Ukuran gambar isi kotak
            Image scaledImage = character.image.getImage().getScaledInstance(200, 160, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));

            // Nama karakter
            JLabel nameLabel = new JLabel(character.name, SwingConstants.CENTER);
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            nameLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
            nameLabel.setMaximumSize(new Dimension(200, 40));
            nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Klik event
            card.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            card.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    JOptionPane.showMessageDialog(null, character.name + " selected!", "Character Info", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            card.add(imageLabel);
            card.add(nameLabel);
            gridPanel.add(card);
        }

        JScrollPane scrollPane = new JScrollPane(gridPanel,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        return scrollPane;
    }

    private List<Character> generateCharacters() {
        List<Character> characters = new ArrayList<>();

        String[] names = {
            "Aizen", "Anos", "Arata", "Boruto", "Deku",
            "Kaido", "Gojo", "Goku", "Kirito", "Luffy",
            "Muzan", "Naruto", "Rimuru", "Tanjiro", "Zoro"
        };

        for (int i = 0; i < names.length; i++) {
            String imagePath = "src/images/character" + (i + 1) + ".jpg";
            characters.add(new Character(names[i], imagePath));
        }

        return characters;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CharacterListUI::new);
    }
}
