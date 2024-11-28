/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Mazen
 */
public class Circle extends Shape {
    private double radius;
    private Point centre;
    

    public Circle(Point centre, double radius, Map<String, Double> properties,float stroke) {
        this.centre = centre;
        this.radius = radius;
        super(new Point((int) (centre.x - radius), (int) (centre.y - radius)), new Point((int) (centre.x + radius), (int) (centre.y + radius)), Color.BLACK, stroke);
        this.properties.put("radius", radius);
        Double centreX = centre.x*1.0;
       Double centreY = centre.y*1.0;
       this.properties.put("centreX",centreX);
       this.properties.put("centreY",centreY);   
       this.properties.put("stroke", stroke*1.0);
        this.setProperties(this.properties);
        
    }

    public void setPosition(Point startingP, Point EndingP) {
        this.topLeftPoint = startingP;
        this.bottomRightPoint = EndingP;

    }

    
    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        g2d.setColor(color);
        g2d.setStroke(this.stroke);
        if (fill) {
            g2d.fillOval(topLeftPoint.x, topLeftPoint.y, (int) radius, (int) radius);
        } else
            g2d.drawOval(topLeftPoint.x, topLeftPoint.y, (int) radius, (int) radius);

    }
    
    public void setRadius(double radius){
    if(radius<0){
    return;
    } 
    this.radius=radius;
    properties.put("radius", radius);
    }

    
    public void setProperties(Map<String, Double> properties) {//properties:radius,color,centre
       
        this.properties=properties;
    
    }
}
