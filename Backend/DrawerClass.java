/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Mazen
 */
public class DrawerClass implements DrawingEngine {
    private ArrayList<Shape> shapes;
        

    public DrawerClass() {
        shapes = new ArrayList<>();
    }

    
    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
        
        
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);//converts list to array of Shapes
    }

    public void refresh(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        for (Shape shape : shapes) {
            shape.draw(g2d);
        }
    }
}
