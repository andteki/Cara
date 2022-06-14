package views;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;

public class Car extends JButton{
    public Integer actSpeed;
    int maxSpeed;
    public boolean speedVisible;
    String name;

    public Car(Color color, int initSpeed, String name) {
        this.setBackground(color);
        // this.setText(name);
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
    public void setNewSpeed() {
        boolean direction = getSpeedDirection();
        int level = getChangeLevel();
        if(direction) {
            setUpSpeed(level);
        }else {
            setDownSpeed(level);
        }
    }
    private boolean getSpeedDirection() {
        Random random = new Random();
        boolean direction = random.nextBoolean();
        return direction;
    }
    private int getChangeLevel() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
    private void setUpSpeed(int speed) {
        int newSpeed = this.actSpeed += speed;
        if(newSpeed < this.maxSpeed) {
            this.actSpeed = newSpeed;
        }
    }
    private void setDownSpeed(int speed) {        
        int newSpeed = this.actSpeed = speed;
        if(newSpeed > 0) {
            this.actSpeed = newSpeed;
        }
    }
    public void toggleSpeedVisible() {
        if(this.speedVisible) 
            this.speedVisible = false;
        else 
            this.speedVisible = true;
    }

}
