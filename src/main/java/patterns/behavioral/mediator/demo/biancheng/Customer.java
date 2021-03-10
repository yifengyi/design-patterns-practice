package patterns.behavioral.mediator.demo.biancheng;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.0v created by wujf on 2021-3-8
 */
public abstract class Customer extends JFrame implements ActionListener {
  protected Medium medium;

  protected String name;

  JTextField sentText;
  JTextArea  receiveArea;

  public Customer(String name)  {
    super(name);
    this.name = name;
  }

  public void setMedium(Medium medium) {
    this.medium = medium;
  }
  void clientWindow(int x, int y) {
    Container cp;
    JScrollPane sp;
    JPanel p1, p2;
    cp = this.getContentPane();
    sentText = new JTextField(18);
    receiveArea = new JTextArea(10, 18);
    receiveArea.setEditable(false);
    p1 = new JPanel();
    p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
    p1.add(receiveArea);
    sp = new JScrollPane(p1);
    cp.add(sp, BorderLayout.NORTH);
    p2 = new JPanel();
    p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
    p2.add(sentText);
    cp.add(p2, BorderLayout.SOUTH);
    sentText.addActionListener(this);
    this.setLocation(x, y);
    this.setSize(250, 330);
    this.setResizable(false); //窗口大小不可调整
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String tempInfo = sentText.getText().trim();
    sentText.setText("");
    this.send(tempInfo);
  }

  public abstract void send(String ad);

  public abstract void receive(String from, String ad);
}
