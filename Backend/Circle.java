/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mazen
 */
public class Circle implements Shape {

    private Point topLeft;
    private Point bottomRight;
    private double radius;
    private Point centre;
    private Color color;
    private Map<String, Double> properties = new HashMap<>();
    private boolean fill;

    public Circle(Point centre, double radius, Map<String, Double> properties) {
        this.centre = centre;
        this.radius = radius;
        this.bottomRight = new Point((int) (centre.x + radius), (int) (centre.y + radius));
        this.topLeft = new Point((int) (centre.x - radius), (int) (centre.y - radius));
        this.properties = properties;
    }

    public void setPosition(Point startingP, Point EndingP) {
        this.topLeft = startingP;
        this.bottomRight = EndingP;

    }

    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    public Map<String, Double> getProperties() {
        return this.properties;
    }

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

        if (fill) {
            g2d.fillOval(topLeft.x, topLeft.y, (int) radius, (int) radius);
        } else
            g2d.drawOval(topLeft.x, topLeft.y, (int) radius, (int) radius);

    }

    public boolean isFilled() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
