/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mazen
 */
public class DrawerClass implements DrawingEngine {

    private ArrayList<Shape> shapes;
    File f;
    public DrawerClass() {
    shapes = new ArrayList<>();

    JFileChooser FC = new JFileChooser();

    // Add a file filter to only allow .dat files
    FC.setFileFilter(new FileNameExtensionFilter("DAT Files (*.dat)", "dat"));

    // Allow user to choose whether to open or create a new file
    int choice = JOptionPane.showOptionDialog(
        null,"Would you like to open or create a new .dat file?", 
        "File Selection",JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        new Object[] { "Open File", "Create New File" }, 
        "Open File"
    );

    if (choice == 0) { 
        
        int result = FC.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            f = FC.getSelectedFile();
            if (!f.getName().endsWith(".dat")) {JOptionPane.showMessageDialog(null,"Invalid file , reverting to default file shaopes.dat","Error", JOptionPane.ERROR_MESSAGE);
                f = new File("src/shapes.dat"); 
            }
        } else {
            f = new File("src/shapes.dat"); 
        }
    } else if (choice == 1) { 
        
        FC.setDialogTitle("Save As");
        int result = FC.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            f = FC.getSelectedFile();
            if (!f.getName().endsWith(".dat")) {
                f = new File(f.getAbsolutePath() + ".dat");
            }

            try {
                if (f.createNewFile()) {
                    JOptionPane.showMessageDialog(null,
                        "File created successfully: " + f.getAbsolutePath(),
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "File already exists or cannot be created.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                    "Error creating file: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
                f = new File("src/shapes.dat"); // Default file
            }
        } else {
            f = new File("src/shapes.dat"); // Default file
        }
    } else {
        f = new File("src/shapes.dat"); 
    }
}


    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }

    }

    public void saveObjects() {
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {
        fos = new FileOutputStream(f);
        oos = new ObjectOutputStream(fos);
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
            if (fos != null) {
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    public void loadObjects() {
    FileInputStream file = null;
    ObjectInputStream ois = null;
    
    
    
    
    
    if(!f.exists() || f.length()==0){
    JOptionPane.showMessageDialog(null, "empty or non existing,starting with no shapes");    
    return;
    }
    try {
        file = new FileInputStream(f);
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

    public File getFile(){
    return this.f;
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
