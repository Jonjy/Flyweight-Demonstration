/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.example;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jon
 */
public class Rectangle {
    
    private Color color;   
    
    public Rectangle (Color color){
        this.color = color;
    }
    
    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY){
        g.setColor(color);
	g.fillRect(upperX, upperY, lowerX, lowerY);
        
    }   
}
