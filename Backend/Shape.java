package Backend;


import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Mazen
 */
public interface Shape  {
    public void setPosition(Point startingP,Point EndingP);
    public void setProperties(Map<String,Double> properties);
    public Map<String,Double> getProperties();
    public void setColor(Color color);
    public Color getColor();
    public void draw(java.awt.Graphics canvas);
    public void setFill(boolean fill);
    public boolean isFilled();
}
