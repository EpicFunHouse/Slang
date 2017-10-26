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
public class Slang extends JPanel implements ActionListener, KeyListener {

      Timer t = new Timer (100,this);
      int currentXPosition = 0,currentYPosition = 0, velx = 0, vely = 0, xfruit = 25,yfruit = 25;
      Map map;
      
      public Slang(Map _map) {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setOpaque(false);
        
        map = _map;
        
        map.setSlang(currentXPosition, currentYPosition);
      }
      
      public void paintComponent(Graphics g) {
          super.paintComponents(g);
         // super.paint(g);
          Graphics2D g2 =(Graphics2D) g;
          g2.fill(new Ellipse2D.Double( currentXPosition * 10, currentYPosition * 10, 10, 10));
          
      }
    //  public void paintComponent(Graphics f) {
    //      super.paintComponents(f);
         // super.paint(g);
    //      Graphics2D g2 =(Graphics2D) f;
     //     g2.fill(new Ellipse2D.Double(xfruit,yfruit,30,30));
          
    //  }
          public void actionPerformed(ActionEvent e) {
              currentXPosition += velx;
              currentYPosition += vely;
              
              if(currentXPosition > 30) 
              {
                  currentXPosition = 0;
              }
              if(currentYPosition > 30)
              {
                  currentYPosition = 0;
              }
              
              if(currentXPosition < 0) 
              {
                  currentXPosition = 30;
              }
              if(currentYPosition < 0)
              {
                  currentYPosition = 30;
              }
              
              repaint();

          }
          public void up() {
           vely = -1;
           velx = 0;
          }
          public void down() {
           vely = 1;
           velx = 0;
          }
           public void left() {
           vely = 0;
           velx = -1;
          }
          public void right() {
          vely = 0;
          velx = 1;
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
