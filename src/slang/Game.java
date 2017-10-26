/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang;
import javax.swing.JFrame;

public class Game {
    static Renderer renderer;
    static Map map;
    
    public static void main(String args[]) {
        Slang slang = new Slang(new Map());
        renderer = new Renderer(slang);
        map = renderer.getMap();
        renderer.add(slang);

        /*frame.add(slang);
        
        frame.setVisible(true);
        frame.setSize(800, 600);*/
    }
}