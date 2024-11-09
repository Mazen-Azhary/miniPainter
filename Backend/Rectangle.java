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
public class Rectangle implements Shape{
    protected Point topLeftPoint;
    protected Point bottomRightPoint;
    protected int width;
    protected int height;
    protected Color color;
    protected Map<String, Double> properties;
    protected Stroke stroke;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint, Map<String, Double> properties, Color color, float stroke) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        this.properties = properties;
        this.color = color;
        this.stroke = new BasicStroke(stroke);

        // Extract width and height from properties
        try{
        this.width = properties.get("Width").intValue();
        this.height = properties.get("Height").intValue();
        }catch(Exception e){
        
        }
        }

    public void setPosition(Point startingP, Point endingP) {
        this.topLeftPoint = startingP;
        this.bottomRightPoint = endingP;

        // Update width and height
        this.width = Math.abs(endingP.x - startingP.x);
        this.height = Math.abs(endingP.y - startingP.y);
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
        try{
        this.width = properties.get("Width").intValue();
        this.height = properties.get("Height").intValue();
        }
        catch(Exception e){
        this.width=this.height=properties.get("Side Length").intValue();
        
        }
        }

    @Override
    public Map<String, Double> getProperties() {
        return this.properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void draw(Graphics canvas) {
        Graphics g2d = (Graphics2D) canvas;
        g2d.setColor(color);
            g2d.drawRect(topLeftPoint.x, topLeftPoint.y, width, height);
        
    }
    
}
