package patterns.behavioral.strategy.demo.crabCooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 1.0v created by wujf on 2021-3-10
 */
public class CrabsClient implements ItemListener {
  private JFrame       f;
  private JRadioButton qz, hs;
  private JPanel centerJP, southJP;
  private Kitchen cf;    //厨房
  private CrabCooking qzx, hsx;    //大闸蟹加工者
  public CrabsClient() {
    f = new JFrame("策略模式在大闸蟹做菜中的应用");
    f.setBounds(100, 100, 500, 400);
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    southJP = new JPanel();
    centerJP = new JPanel();
    f.add("South", southJP);
    f.add("Center", centerJP);
    qz = new JRadioButton("清蒸大闸蟹");
    hs = new JRadioButton("红烧大闸蟹");
    qz.addItemListener(this);
    hs.addItemListener(this);
    ButtonGroup group = new ButtonGroup();
    group.add(qz);
    group.add(hs);
    southJP.add(qz);
    southJP.add(hs);
    //---------------------------------
    cf = new Kitchen();    //厨房
    qzx = new SteamedCrabs();    //清蒸大闸蟹类
    hsx = new BraisedCrabs();    //红烧大闸蟹类
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    JRadioButton jc = (JRadioButton) e.getSource();
    if (jc == qz) {
      cf.setStrategy(qzx);
      cf.cooking(); //清蒸
    } else if (jc == hs) {
      cf.setStrategy(hsx);
      cf.cooking(); //红烧
    }
    centerJP.removeAll();
    centerJP.repaint();
    centerJP.add((Component) cf.getStrategy());
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new CrabsClient();
  }
}
