package patterns.behavioral.iterator.demo.wyScenic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 1.0v created by wujf on 2021-3-5
 */
public class PictureFrame extends JFrame implements ActionListener {

  private WyViewSpotSet spotSet;

  private WyViewSpotIterator spotIterator;

  private WyViewSpot spot;

  private ClassLoader loader;

  public PictureFrame() {
    super("中国最美乡村“婺源”的部分风景图");
    loader = this.getClass().getClassLoader();
    this.setResizable(false);
    spotSet = new WyViewSpotSet();

    spotSet.add(new WyViewSpot("江湾", "江湾景区是婺源的一个国家5A级旅游景区，景区内有萧江宗祠、永思街、滕家老屋、婺源人家、乡贤园、百工坊等一大批古建筑，精美绝伦，做工精细。"));
    spotSet.add(new WyViewSpot("李坑", "李坑村是一个以李姓聚居为主的古村落，是国家4A级旅游景区，其建筑风格独特，是著名的徽派建筑，给人一种安静、祥和的感觉。"));
    spotSet.add(new WyViewSpot("思溪延村", "思溪延村位于婺源县思口镇境内，始建于南宋庆元五年（1199年），当时建村者俞氏以（鱼）思清溪水而名。"));
    spotSet.add(new WyViewSpot("晓起村", "晓起有“中国茶文化第一村”与“国家级生态示范村”之美誉，村屋多为清代建筑，风格各具特色，村中小巷均铺青石，曲曲折折，回环如棋局。"));
    spotSet.add(new WyViewSpot("菊径村", "菊径村形状为山环水绕型，小河成大半圆型，绕村庄将近一周，四周为高山环绕，符合中国的八卦“后山前水”设计，当地人称“脸盆村”。"));
    spotSet.add(new WyViewSpot("篁岭", "篁岭是著名的“晒秋”文化起源地，也是一座距今近六百历史的徽州古村；篁岭属典型山居村落，民居围绕水口呈扇形梯状错落排布。"));
    spotSet.add(new WyViewSpot("彩虹桥", "彩虹桥是婺源颇有特色的带顶的桥——廊桥，其不仅造型优美，而且它可在雨天里供行人歇脚，其名取自唐诗“两水夹明镜，双桥落彩虹”。"));
    spotSet.add(new WyViewSpot("卧龙谷", "卧龙谷是国家4A级旅游区，这里飞泉瀑流泄银吐玉、彩池幽潭碧绿清新、山峰岩石挺拔奇巧，活脱脱一幅天然泼墨山水画。"));
    spotIterator = spotSet.getIterator(); //获取婺源景点迭代器
    spot = spotIterator.first();
    this.showPicture(spot.getName(), spot.getIntroduce());

  }

  private void showPicture(String name, String introduce) {
    Container cp = this.getContentPane();
    JPanel picturePanel = new JPanel();
    JPanel controlPanel = new JPanel();
    String fileName = "behavioral/iterator/demo/wyPictures/" + name + ".jpg";
    JLabel lb = new JLabel(name, new ImageIcon(loader.getResource(fileName)), JLabel.CENTER);
    JTextArea ta = new JTextArea(introduce);
    lb.setHorizontalTextPosition(JLabel.CENTER);
    lb.setVerticalTextPosition(JLabel.TOP);
    lb.setFont(new Font("宋体", Font.BOLD, 20));
    ta.setLineWrap(true);
    ta.setEditable(false);
    //ta.setBackground(Color.orange);
    picturePanel.setLayout(new BorderLayout(5, 5));
    picturePanel.add("Center", lb);
    picturePanel.add("South", ta);
    JButton first, last, next, previous;
    first = new JButton("第一张");
    next = new JButton("下一张");
    previous = new JButton("上一张");
    last = new JButton("最末张");
    first.addActionListener(this);
    next.addActionListener(this);
    previous.addActionListener(this);
    last.addActionListener(this);
    controlPanel.add(first);
    controlPanel.add(next);
    controlPanel.add(previous);
    controlPanel.add(last);
    cp.add("Center", picturePanel);
    cp.add("South", controlPanel);
    this.setSize(630, 550);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if (command.equals("第一张")) {
      spot = spotIterator.first();
      this.showPicture(spot.getName(), spot.getIntroduce());
    } else if (command.equals("下一张")) {
      spot = spotIterator.next();
      this.showPicture(spot.getName(), spot.getIntroduce());
    } else if (command.equals("上一张")) {
      spot = spotIterator.previous();
      this.showPicture(spot.getName(), spot.getIntroduce());
    } else if (command.equals("最末张")) {
      spot = spotIterator.last();
      this.showPicture(spot.getName(), spot.getIntroduce());
    }
  }
}
