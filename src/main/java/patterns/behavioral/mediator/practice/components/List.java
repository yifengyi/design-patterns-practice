package patterns.behavioral.mediator.practice.components;

import patterns.behavioral.mediator.practice.mediator.Mediator;
import patterns.behavioral.mediator.practice.mediator.Note;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public class List extends JList implements Component {
  private       Mediator         mediator;
  private final DefaultListModel LIST_MODEL;

  public List(DefaultListModel listModel) {
    super(listModel);
    this.LIST_MODEL = listModel;
    setModel(listModel);
    this.setLayoutOrientation(JList.VERTICAL);
    Thread thread = new Thread(new Hide(this));
    thread.start();
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void addElement(Note note) {
    LIST_MODEL.addElement(note);
    int index = LIST_MODEL.size() - 1;
    setSelectedIndex(index);
    ensureIndexIsVisible(index);
    mediator.sendToFilter(LIST_MODEL);
  }

  public void deleteElement() {
    int index = this.getSelectedIndex();
    try {
      LIST_MODEL.remove(index);
      mediator.sendToFilter(LIST_MODEL);
    } catch (ArrayIndexOutOfBoundsException ignored) {}
  }

  public Note getCurrentElement() {
    return (Note)getSelectedValue();
  }

  @Override
  public String getName() {
    return "List";
  }

  private class Hide implements Runnable {
    private List list;

    Hide(List list) {
      this.list = list;
    }

    @Override
    public void run() {
      while (true) {
        try {
          Thread.sleep(300);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        if (list.isSelectionEmpty()) {
          mediator.hideElements(true);
        } else {
          mediator.hideElements(false);
        }
      }
    }
  }
}
