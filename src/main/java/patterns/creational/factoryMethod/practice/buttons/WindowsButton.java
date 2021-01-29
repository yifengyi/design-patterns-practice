package patterns.creational.factoryMethod.practice.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.0v created by wujf on 2021-1-29
 * 具体产品：win10按钮
 */
public class WindowsButton implements Button {
  JPanel panel = new JPanel();
  JFrame frame = new JFrame();
  JButton button;
  @Override
  public void render() {
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Hello World!");
    label.setOpaque(true);
    label.setBackground(new Color(235, 233, 126));
    label.setFont(new Font("Dialog", Font.BOLD, 44));
    label.setHorizontalAlignment(SwingConstants.CENTER);
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    frame.getContentPane().add(panel);
    panel.add(label);
    onClick();
    panel.add(button);

    frame.setSize(320, 200);
    frame.setVisible(true);
    onClick();

  }

  @Override
  public void onClick() {
    button = new JButton("Exit");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        System.exit(0);
      }
    });
  }
}
