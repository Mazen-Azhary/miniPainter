/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public void saveObjects() {
    FileOutputStream file = null;
    ObjectOutputStream oos = null;
    try {
        file = new FileOutputStream("shapes.dat");
        oos = new ObjectOutputStream(file);
        for (int i = 0; i < shapes.size(); i++) {
            oos.writeObject(this.shapes.get(i));
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Failed to write object");
        e.printStackTrace();
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (file != null) {
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    public void loadObjects() {
    FileInputStream file = null;
    ObjectInputStream ois = null;

    try {
        file = new FileInputStream("shapes.dat");
        ois = new ObjectInputStream(file);
        while (true) {
            try {
                Shape shape = (Shape) ois.readObject();  
                this.shapes.add(shape);  
            } catch (EOFException e) {
 
                break;
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Failed to load objects");
        e.printStackTrace();
    } finally {
        try {
            if (ois != null) {
                ois.close();
            }
            if (file != null) {
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
