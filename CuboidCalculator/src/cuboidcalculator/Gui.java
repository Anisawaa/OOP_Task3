/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboidcalculator;
import javax.swing.*;

/**
 *
 * @author Nisa
 */
public class Gui extends JFrame {
    JLabel ltitle = new JLabel("Cuboid Calculator");
    
    JLabel llength = new JLabel("Length");
    JTextField flength = new JTextField();
    
    JLabel lwidth = new JLabel("Width");
    JTextField fwidth = new JTextField();
    
    JLabel lheight = new JLabel("Heigth");
    JTextField fheight = new JTextField();
    
    JLabel lresult = new JLabel("Result :");
    
    JButton btncount = new JButton("Count");
    JButton btnreset = new JButton("Reset");
    
    JLabel larea = new JLabel("");
    JLabel lperimeter = new JLabel("");
    JLabel lvolume = new JLabel("");
    JLabel lsurface = new JLabel("");
    
    public Gui() {
        setTitle("Cuboid Calculator");
        setSize(450, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(ltitle);
        ltitle.setBounds(150, 20, 150, 20);
        
        add(llength);
        llength.setBounds(50, 80, 100, 20);
        
        add(flength);
        flength.setBounds(125, 80, 250, 20);
        
        add(lwidth);
        lwidth.setBounds(50, 120, 100, 20);
        
        add(fwidth);
        fwidth.setBounds(125, 120, 250, 20);
        
        add(lheight);
        lheight.setBounds(50, 160, 100, 20);
        
        add(fheight);
        fheight.setBounds(125, 160, 250, 20);
        
        add(lresult);
        lresult.setBounds(125, 190, 100, 20);
        
        add(btncount);
        btncount.setBounds(100, 380, 100, 20);
        
        add(btnreset);
        btnreset.setBounds(250, 380, 100, 20);
        
        add(larea);
        larea.setBounds(40, 220, 400, 20);
        
        add(lperimeter);
        lperimeter.setBounds(40, 255, 400, 20);
        
        add(lvolume);
        lvolume.setBounds(40, 290, 400, 20);
        
        add(lsurface);
        lsurface.setBounds(40, 325, 400, 20);   
    }

    public String getFlength() {
        return flength.getText();
    }

    public String getFwidth() {
        return fwidth.getText();
    }

    public String getFheight() {
        return fheight.getText();
    }
}
