package controllers;

import javax.swing.JButton;
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
        System.out.println("működik");
        this.mainFrame.trackPanel.car1.go();
        this.mainFrame.trackPanel.car2.go();
        this.mainFrame.trackPanel.car3.go();
    }
    private void setEvents() {
        JButton startButton = this.mainFrame.buttonPanel.startButton;
        startButton.addActionListener(e -> onClickStartButton());
    }
    private void onClickStartButton() {
        this.timer.start();
    }
}
