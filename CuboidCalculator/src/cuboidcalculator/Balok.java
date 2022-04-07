/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboidcalculator;

/**
 *
 * @author Nisa
 */
public class Balok extends Persegi implements MenghitungRuang {
    private float height;

    public Balok(float length, float width, float height) {
        super(length, width);
        this.height = height;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setHeight(int Height) {
        height = Height;
    }
    
    @Override
    public float surface() {
        return 2 * ((super.getLength() * height) + (super.getWidth() * height) + super.area());
    }

    @Override
    public float volume() {
        return super.area() * height;
    }
}
