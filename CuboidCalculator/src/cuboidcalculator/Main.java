/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboidcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Nisa
 */
public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        
        gui.btncount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    float length, width, height;                 
                    length = Float.valueOf(gui.getFlength());
                    width = Float.valueOf(gui.getFwidth());
                    height = Float.valueOf(gui.getFheight());
                    
                    Balok balok = new Balok(length, width, height);
                    gui.larea.setText("Square Area : " + balok.area());
                    gui.lperimeter.setText("Square Circumference : " + balok.perimeter());
                    gui.lvolume.setText("Cuboid Volume : " + balok.volume());
                    gui.lsurface.setText("Cuboid Surface Area : " + balok.surface());
                }
                
                catch (NumberFormatException nfe) {
                    if(nfe.getMessage() == "empty String"){
                        JOptionPane.showMessageDialog(null, "Cannot be empty");             
                    }
                    
                    else {
                        JOptionPane.showMessageDialog(null, nfe.getMessage());
                    }
                }
            }
        });
        
        gui.btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                gui.larea.setText("");
                gui.lperimeter.setText("");
                gui.lvolume.setText("");
                gui.lsurface.setText("");
                gui.fheight.setText("");
                gui.flength.setText("");
                gui.fwidth.setText("");
            }
        });
    }
    
}
