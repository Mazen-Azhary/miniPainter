/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.util.Map;
import javax.swing.text.Position;

/**
 *
 * @author Mazen
 */
public class LineSegment implements Shape{
    Point startingP;
    Point EndingP;
    Map<String,Double> properties;
    Color color;
    Stroke stroke;
 public void setPosition(Point startingP,Point EndingP){
 this.startingP=startingP;
 this.EndingP=EndingP;
 }
 public void setProperties(Map<String,Double> properties){
 this.properties=properties;
 }
 
    public Map<String,Double> getProperties(){
    return this.properties;
    
    }
    public void setColor(Color color){
    this.color=color;
    }
    public Color getColor(){    
    return this.color;
    }
    public void draw(java.awt.Graphics canvas){
    Graphics2D g2d= (Graphics2D) canvas;
   g2d.drawLine(startingP.x,startingP.y,EndingP.x,EndingP.x);
    }

    public LineSegment(Point startingP, Point EndingP, Map<String, Double> properties, Color color,float stroke) {
        this.startingP = startingP;
        this.EndingP = EndingP;
        this.properties = properties;
        this.color = color;
        this.stroke=new BasicStroke(stroke);
    }
    
    
    
}
