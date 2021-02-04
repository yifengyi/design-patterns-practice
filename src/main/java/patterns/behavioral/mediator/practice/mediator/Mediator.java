package patterns.behavioral.mediator.practice.mediator;

import patterns.behavioral.mediator.practice.components.Component;

import javax.swing.*;

/**
 * 1.0v created by wujf on 2021-2-3
 */
public interface Mediator {
  void addNewNote(Note note);
  void deleteNote();
  void getInfoFromList(Note note);
  void saveChanges();
  void markNote();
  void clear();
  void sendToFilter(ListModel listModel);
  void setElementsList(ListModel list);
  void registerComponent(Component component);
  void hideElements(boolean flag);
  void createGUI();
}
