package com.finn.juenger;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{

    private final ImageIcon ICON = new ImageIcon(this.getClass().getResource("/appIcon.png"));
    private final ImageIcon BURGER_BUTTON = new ImageIcon(this.getClass().getResource("/burgerButton.png"));
    private ImageIcon scaledIcon;
    private JPanel headPanel;
    private JButton menuButton;
    private final int headerSize = 30;
    private CardLayout cardLayout;
    private JLayeredPane layeredPane;


    public App() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 450);
        this.setLocationRelativeTo(null);
        this.setTitle("Students Planner");
        this.setLayout(new BorderLayout());
        this.setIconImage(ICON.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        layeredPane = new JLayeredPane();
        this.setContentPane(layeredPane);

        Image scaledImage = ICON.getImage().getScaledInstance(headerSize, headerSize, Image.SCALE_SMOOTH);
        this.scaledIcon = new ImageIcon(scaledImage);

        initHedPanel();
        this.add(headPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }

    private void initHedPanel() {
        // Use BorderLayout to have full control over component placement.
        headPanel = new JPanel(new BorderLayout(30, 0)); // 15px horizontal gap, 0px vertical
        // Add some padding around the panel (top, left, bottom, right)
        headPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        JLabel header = new JLabel("Students Planner");
        header.setFont(new Font("Arial", Font.BOLD, headerSize));
        header.setIcon(scaledIcon);

        menuButton = new JButton("☰");
        //menuButton = new JButton();
        menuButton.setFocusPainted(false);
        menuButton.setPreferredSize(new Dimension(40, 40));
        //menuButton.setIcon(BURGER_BUTTON);


        headPanel.add(menuButton, BorderLayout.WEST);
        headPanel.add(header, BorderLayout.CENTER);
    }
}
