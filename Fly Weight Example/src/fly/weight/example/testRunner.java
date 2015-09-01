/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Jon
 */
public class testRunner extends JFrame {

    JButton draw;

    int windowWidth = 1500;
    int windowHeight = 1000;

	
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
        Color.blue, Color.pink, Color.cyan, Color.magenta,
        Color.black, Color.gray};

    public testRunner(RectangleGenerator current) {

        this.setSize(windowWidth, windowHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(current.toString() + " method");

        JPanel contentPane = new JPanel();

        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        draw = new JButton("Run Test");

        contentPane.add(drawingPanel, BorderLayout.CENTER);

        contentPane.add(draw, BorderLayout.SOUTH);

        draw.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                
                
                
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 100; ++i) {
    
                    Rectangle rect = current.getRectangle(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }

                long endTime = System.currentTimeMillis();

                System.out.println(current.toString() + " took " + (endTime - startTime) + " milliseconds");

            }
        });

        this.add(contentPane);

        this.setVisible(true);
    }
   
    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();

        int randInt = randomGenerator.nextInt(9);

        return shapeColor[randInt];

    }

}