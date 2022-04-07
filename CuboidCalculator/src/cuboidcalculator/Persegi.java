/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboidcalculator;

/**
 *
 * @author Nisa
 */
public class Persegi implements MenghitungBidang {
    private float length, width;

    public Persegi(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }
    
    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    @Override
    public float area() {
        return length * width;
    }

    @Override
    public float perimeter() {
        return 2 * (length + width);
    }
}
