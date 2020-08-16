package mvc.animator.view;

import java.awt.*;

import mvc.animator.model.Oval;
import mvc.animator.model.Rectangle;

public interface VisualViews {

  void display() throws InterruptedException;

  void drawOval(Oval shape, Graphics g);
  void drawRect(Rectangle shape, Graphics g);



}
