/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.example;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author Jon
 */
public class FlyWeightGenerator implements RectangleGenerator {

    private static final HashMap<Color, Rectangle> rectangleColors = new HashMap<Color, Rectangle>();
    String type = "Flyweight";
    
    public String toString(){
        return type;
    }


    public Rectangle getRectangle(Color color) {
        Rectangle rect = (Rectangle) rectangleColors.get(color);

        if (rect == null) {
            rect = new Rectangle(color);

            rectangleColors.put(color, rect);
        }
        return rect;
    }
}