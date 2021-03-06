package patterns.structural.composite.practice.editor;

import patterns.structural.composite.practice.shapes.CompoundShape;
import patterns.structural.composite.practice.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * // 客户端代码会通过基础接口与所有组件进行交互。这样一来，客户端代码便可同
 * // 时支持简单叶节点组件和复杂组件。
 * 1.0v created by wujf on 2021-2-2
 */
public class ImageEditor {
  private EditorCanvas  canvas;
  private CompoundShape allShapes = new CompoundShape();

  public ImageEditor() {
    canvas = new EditorCanvas();
  }
  public void loadShapes(Shape... shapes){
    allShapes.clear();
    allShapes.add(shapes);
    canvas.refresh();
  }

  private class EditorCanvas extends Canvas {
    JFrame frame;
    private static final int PADDING  = 10;

    EditorCanvas(){
      createFrame();
      refresh();
      addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          allShapes.unSelect();
          allShapes.selectChildAt(e.getX(), e.getY());
          e.getComponent().repaint();
        }
      });
    }
    void createFrame(){
      frame = new JFrame();
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);

      JPanel contentPanel = new JPanel();
      Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
      contentPanel.setBorder(padding);
      frame.setContentPane(contentPanel);

      frame.add(this);
      frame.setVisible(true);
      frame.getContentPane().setBackground(Color.LIGHT_GRAY);

    }
    public int getWidth(){
      return allShapes.getX() + allShapes.getWidth() + PADDING;
    }
    public int getHeight(){
      return allShapes.getY() + allShapes.getHeight() + PADDING;
    }
    void refresh() {
      this.setSize(getWidth(), getHeight());
      frame.pack();
    }

    public void paint(Graphics graphics) {
      allShapes.paint(graphics);
    }
  }
}
