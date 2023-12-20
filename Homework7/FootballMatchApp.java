package Mirea.Homework7;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;

public class FootballMatchApp extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    private int milanScore = 0;
    private int madridScore = 0;

    public FootballMatchApp() {
        super("Milan vs Madrid"); 
        setLayout(new FlowLayout());
        setSize(960, 480);
        setVisible(true);
        initials();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initials() {
        milanButton = new JButton("Milan");
        madridButton = new JButton("Madrid");
        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorerLabel.setText("Last Scorer: Milan");
                updates();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorerLabel.setText("Last Scorer: Madrid");
                updates();
            }
        });
        
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }
        
    private void updates() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
     
    public static void main(String[] args) {
        new FootballMatchApp();
    }
}