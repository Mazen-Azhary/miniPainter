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

/**
 *
 * @author Mazen
 */
public class Rectangle extends Shape {

    protected int width;
    protected int height;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint,Color color, float stroke) {
        super(topLeftPoint, bottomRightPoint, color, stroke);

        try {
            this.width = properties.get("Width").intValue();
            this.height = properties.get("Height").intValue();
            
        } catch (Exception e) {
            
            this.width=this.height=50;
            
        }
    }

    public void setPosition(Point startingP, Point endingP) {
        this.topLeftPoint = startingP;
        this.bottomRightPoint = endingP;
        this.width = Math.abs(endingP.x - startingP.x);
        this.height = Math.abs(endingP.y - startingP.y);
    }

    @Override
    public void setProperties(Map<String, Double> properties) { 
        this.properties = properties;
        try {
            this.width = properties.get("Width").intValue();
            this.height = properties.get("Height").intValue();
        } catch (Exception e) {
            this.width = this.height = properties.get("Side Length").intValue();

        }
    }
    
    public boolean setDimentions(int width,int length){
    if(width<0 || length<0){
    return false;
    }
    this.width=width;
    this.height=length;
    properties.put("Width",width*1.0);
    properties.put("Length",width*1.0);
    return true;
    }

    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(this.stroke));
        if (fill) {
            g2d.fillRect(topLeftPoint.x, topLeftPoint.y, width, height);
        } else {
            g2d.drawRect(topLeftPoint.x, topLeftPoint.y, width, height);
        }

    }


}
