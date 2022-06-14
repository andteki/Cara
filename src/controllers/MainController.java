package controllers;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    Timer timer;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.timer = new Timer(400, e -> onTime());
        this.setEvents();
    }
    private void onTime() {
        this.mainFrame.trackPanel.car1.go();
        this.mainFrame.trackPanel.car1.setNewSpeed();        

        this.mainFrame.trackPanel.car2.go();
        this.mainFrame.trackPanel.car3.go();

        if(this.mainFrame.trackPanel.car1.speedVisible) {
            Integer actSpeed = this.mainFrame.trackPanel.car1.actSpeed;
            this.mainFrame.trackPanel.car1.setText(actSpeed.toString());
            this.mainFrame.trackPanel.car1.setForeground(Color.WHITE);
        }else {
            this.mainFrame.trackPanel.car1.setText("");
        }

    }
    private void setEvents() {
        JButton startButton = this.mainFrame.buttonPanel.startButton;
        startButton.addActionListener(e -> onClickStartButton());

        JButton stopButton = this.mainFrame.buttonPanel.stopButton;
        stopButton.addActionListener(e -> onClickStopButton());

        JButton resetButton = this.mainFrame.buttonPanel.resetButton;
        resetButton.addActionListener(e -> onClickResetButton());

        JButton speedButton = this.mainFrame.buttonPanel.speedButton;
        speedButton.addActionListener(e -> onClickSpeedButton());

        JButton aboutButton = this.mainFrame.buttonPanel.aboutButton;
        aboutButton.addActionListener(e -> onClickAboutButton());

        JButton exitButton = this.mainFrame.buttonPanel.exitButton;
        exitButton.addActionListener(e -> onClickExitButton());
    }
    private void onClickStartButton() {
        this.timer.start();
    }
    private void onClickStopButton() {
        this.timer.stop();
    }
    private void onClickResetButton() {
        this.timer.stop();
        this.mainFrame.trackPanel.car1.setLocation(5, 10);
        this.mainFrame.trackPanel.car2.setLocation(5, 60);
        this.mainFrame.trackPanel.car3.setLocation(5, 110);
    }
    private void onClickSpeedButton() {
        this.mainFrame.trackPanel.car1.toggleSpeedVisible();
    }
    private void onClickAboutButton() {        
        JOptionPane.showMessageDialog(this.mainFrame, "Nagy János, 2022-06-14");
    }
    private void onClickExitButton() {
        System.exit(0);
    }
}
