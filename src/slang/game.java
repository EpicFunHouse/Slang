/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
/**
 *
 * @author chris
 */
public class game extends JPanel implements ActionListener, KeyListener {

      Timer t = new Timer (5,this);
      double x = 0,y = 0, velx = 0, vely = 0, xfruit = 40,yfruit = 40;

      
      public game() {
      t.start();
        addKeyListener(this);
        setFocusable(true);
        setOpaque(false);
        //setBackground(Color.WHITE);
        //setFocusTraversalKeyEnabled(false);
      }
      
      public void paintComponent(Graphics g) {
          super.paintComponents(g);
         // super.paint(g);
          Graphics2D g2 =(Graphics2D) g;
          g2.fill(new Ellipse2D.Double(x,y,20,60));
          
      }
    //  public void paintComponent(Graphics f) {
    //      super.paintComponents(f);
         // super.paint(g);
    //      Graphics2D g2 =(Graphics2D) f;
     //     g2.fill(new Ellipse2D.Double(xfruit,yfruit,30,30));
          
    //  }
          public void actionPerformed(ActionEvent e) {
              repaint();
              x += velx;
              y += vely;
              
          }
          public void up() {
           vely = -0.5;
           velx = 0;
          }
          public void down() {
           vely = 0.5;
           velx = 0;
          }
           public void left() {
           vely = 0;
           velx = -0.5;
          }
          public void right() {
          vely = 0;
          velx = 0.5;
          }
          public void keyPressed(KeyEvent e) {
              int code = e.getKeyCode();
              if (code == KeyEvent.VK_UP) {
                  up();
              }
              if (code == KeyEvent.VK_DOWN) {
                  down();
              }
              if (code == KeyEvent.VK_LEFT) {
                  left();
              }
              if (code == KeyEvent.VK_RIGHT) {
                  right();
              }
          }
        public void keyTyped(KeyEvent e) {
            
        }  
        public void keyReleased(KeyEvent e){
            
        }
    // * @param args the command line arguments
    // */
    //public static void main(String[] args) {
        // TODO code application logic here
    
    
}

