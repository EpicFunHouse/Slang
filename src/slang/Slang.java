/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang;
import javax.swing.JFrame;

public class Slang {
    
    public static void main(String args[]) {
        JFrame f = new JFrame();
        game g   = new game();
        fruit y = new fruit();
        
        f.add(g);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
    }
}