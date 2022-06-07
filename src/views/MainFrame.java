package views;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
