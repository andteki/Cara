package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    TrackPanel trackPanel;
    ResultPanel resultPanel;
    public ButtonPanel buttonPanel;

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.trackPanel = new TrackPanel();
        this.resultPanel = new ResultPanel();
        this.buttonPanel = new ButtonPanel();
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setSize(100, 100);
        this.mainPanel.add(this.trackPanel);
        this.mainPanel.add(this.resultPanel);
        this.mainPanel.add(this.buttonPanel);
        this.mainPanel.setLayout(null);
    }
    private void setMainFrame() {
        this.setLayout(new BorderLayout());
        this.add(this.mainPanel, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);
        this.setVisible(true);
    }
}
