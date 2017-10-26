/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
/**
 *
 * @author chris
 */
public class Fruit extends JPanel {
    int fruitx = 10,fruity = 10;
    Map map;
    
    public Fruit(Map _map) {
        map = _map;
    }
    
    public void paintComponent(Graphics y) {
          super.paintComponents(y);
         // super.paint(g);
          Graphics2D g2 =(Graphics2D) y;
          g2.fill(new Ellipse2D.Double(fruitx,fruity,10,10));
          //Color color = Color.GREEN;
      }
}
