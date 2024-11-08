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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mazen
 */
public class Rectangle implements Shape{
    private Point topLeftPoint;
    private Point bottomRightPoint;
    private int width;
    private int height;
    private Color color;
    private Map<String, Double> properties;
    private Stroke stroke;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint, Map<String, Double> properties, Color color, float stroke) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        this.properties = properties;
        this.color = color;
        this.stroke = new BasicStroke(stroke);

        // Extract width and height from properties
        this.width = properties.get("Width").intValue();
        this.height = properties.get("Height").intValue();
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
        this.width = properties.get("Width").intValue();
        this.height = properties.get("Height").intValue();
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

    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        g2d.setStroke(stroke);
        g2d.setColor(color);
        g2d.drawRect(topLeftPoint.x, topLeftPoint.y, width, height);
    }
    
}
