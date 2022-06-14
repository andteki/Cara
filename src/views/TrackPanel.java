package views;

import java.awt.Color;

import javax.swing.JPanel;

public class TrackPanel extends JPanel {
    Car car1;
    public TrackPanel() {
        this.car1 = new Car(Color.BLUE, 5, "test1");

        this.add(this.car1);
        this.setBounds(5, 5, 750, 150);
        this.setLayout(null);
    }
}
