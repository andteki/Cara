package views;

import java.awt.Color;

import javax.swing.JButton;

public class Car extends JButton{
    Color color;
    Integer actSpeed;
    int maxSpeed;
    boolean speedVisible;
    String name;

    public Car(Color color, int initSpeed, String name) {
        this.color = color;
        this.actSpeed = initSpeed;
        this.maxSpeed = 20;
        this.speedVisible = true;
        this.name = name;
    }
    public Integer getActSpeed() {
        return this.actSpeed;
    }
    public void go() {
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        x = x + this.actSpeed;
        this.setLocation(x, y);
        
    }
}
