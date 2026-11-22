package me.hatkid.app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application {

  public Application() {
    JFrame frame = new JFrame("ChessNok");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    JPanel panel = new JPanel();

    panel.setLayout(new BorderLayout());
    JButton button = new JButton("ChessNok");
    panel.add(button);

    frame.add(panel);
    frame.setVisible(true);

  }

}
