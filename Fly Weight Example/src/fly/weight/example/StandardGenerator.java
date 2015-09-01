/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.example;

import java.awt.Color;

/**
 *
 * @author Jon
 */
public class StandardGenerator implements RectangleGenerator {
    
    String type = "Traditional";
    
    @Override
    public String toString(){
        return type;
    }

    @Override
    public Rectangle getRectangle(Color color) {
        
        return new Rectangle(color);
    }
    
}
