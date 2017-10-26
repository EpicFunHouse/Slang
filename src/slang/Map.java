/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slang;

import java.util.ArrayList;

/**
 *
 * @author tim
 */
public class Map {
    ArrayList<ArrayList<ObjectEnum>> map;
    
    public Map() {
        map = new ArrayList<ArrayList<ObjectEnum>>();
        
        for(int x = 0; x < 30; x++)
        {
            ArrayList<ObjectEnum> row = new ArrayList<ObjectEnum>();
            for(int y = 0; y < 30; y++)
            {
                row.add(ObjectEnum.Empty);
            }
            map.add(row);
        }
    }
    
    public ArrayList<ArrayList<ObjectEnum>> getMap() {
        return map;
    }
    
    public void setSlang(int x, int y) {
        map.get(y).set(x, ObjectEnum.Slang);
    }
    
    public void setFruit(int x, int y) {
        map.get(y).set(x, ObjectEnum.Fruit);
    }
     
    public void setEmpty(int x, int y) {
        map.get(y).set(x, ObjectEnum.Empty);
    }
}
