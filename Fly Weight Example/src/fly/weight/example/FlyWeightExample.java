/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.example;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;



/**
 * This design is heavily based on the work of Derek Banas and his 
 * youtube video at https://www.youtube.com/watch?v=0vV-R2926ss
 * @author Jon
 */
public class FlyWeightExample extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectangleGenerator fly= new FlyWeightGenerator();
        RectangleGenerator traditional = new StandardGenerator();
       
        
 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 testRunner flyer = new testRunner(fly);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                testRunner tradition = new testRunner(traditional);
            }
        });

    }

}
