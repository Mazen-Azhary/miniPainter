/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Mazen
 */
public class LineSegment extends Shape {

    public void setPosition(Point startingP, Point EndingP) {
        this.topLeftPoint = startingP;
        this.bottomRightPoint = EndingP;
    }

    public void setProperties(Map<String, Double> properties) {//slope,length,angle
        this.properties = properties;
    }

    public LineSegment(Point startingP, Point EndingP, Map<String, Double> properties, Color color, float stroke) {
        super(startingP, EndingP, color, stroke);
    }

    public void draw(java.awt.Graphics canvas) {
        Graphics2D g2d = (Graphics2D) canvas;
        g2d.setColor(color);
        g2d.drawLine(topLeftPoint.x, topLeftPoint.y, bottomRightPoint.x, bottomRightPoint.x);
    }

    public boolean isFilled() {//it's always filled
        return true;
    }

}
