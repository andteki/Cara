package views;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ResultPanel extends JPanel {
    JLabel resultLabel;
    JTextField resultField;

    public ResultPanel() {
        this.resultLabel = new JLabel("Első");
        this.resultField = new JTextField();

        this.setBounds(5, 160, 750, 50);
        this.setLayout(new FlowLayout());
        this.add(this.resultLabel);
        this.add(this.resultField);        
    }
    
}
