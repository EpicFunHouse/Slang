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
import java.awt.Color;
/**
 *
 * @author chris
 */
public class fruit extends JPanel {
    double fruitx = 40,fruity = 40;
    
    public void paintComponent(Graphics y) {
          super.paintComponents(y);
         // super.paint(g);
          Graphics2D g2 =(Graphics2D) y;
          y2.fill(new Ellipse2D.Double(fruitx,fruity,20,20));
          //Color color = Color.GREEN;
      }
}
