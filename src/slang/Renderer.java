/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tim
 */
public class Renderer extends JFrame {
    Map map;
    JPanel slangPanel;
    
    public Renderer(JPanel panel) {
        setBounds(0,0,330,330);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        map = new Map();
        
        slangPanel = panel;
        
        this.add(slangPanel);
    }
    
    public Map getMap() {
        return map;
    }
}
