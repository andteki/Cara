package views;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
    public JButton startButton;
    public JButton stopButton;
    public JButton resetButton;
    public JButton speedButton;
    public JButton aboutButton;
    public JButton exitButton;
    public ButtonPanel() {
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        speedButton = new JButton("Sebesség");
        aboutButton = new JButton("Névjegy");
        exitButton = new JButton("Kilépés");

        this.add(this.startButton);        
        this.add(this.stopButton);        
        this.add(this.resetButton);        
        this.add(this.speedButton);        
        this.add(this.aboutButton);        
        this.add(this.exitButton);
        this.setLayout(new FlowLayout());
        this.setBounds(5, 220, 750, 50);
    }
    
}
