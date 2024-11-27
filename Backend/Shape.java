package Backend;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;
import java.awt.Stroke;
import java.util.HashMap;
import java.util.Map;

public abstract class Shape implements ShapeInterface {

    protected Point topLeftPoint;
    protected Point bottomRightPoint;
    protected Map<String, Double> properties = new HashMap<>();
    protected Color color;
    protected boolean fill;
    protected Stroke stroke;

    public Shape(Point topLeftPoint, Point bottomRightPoint, Color color,float stroke) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
        this.color = color;
        this.stroke=new BasicStroke(stroke);
    }
    
    
    

    public void setPosition(Point startingP, Point EndingP) {
        this.topLeftPoint = startingP;
        this.bottomRightPoint = EndingP;
    }

    public void setPosition(Point startingP) {
    this.topLeftPoint = startingP;
    double width = getProperties().get("width");   
    double length = getProperties().get("length"); 
    this.bottomRightPoint = new Point((int)(topLeftPoint.x + width),(int) (topLeftPoint.y + length));
}

    
    public Map<String, Double> getProperties() {

        return this.properties;

    }
    public abstract void setProperties(Map<String, Double> properties);


    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract void draw(java.awt.Graphics canvas);

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public boolean isFilled() {
        return this.fill;
    }
    
    public Point[] getPosition(Point start,Point end){
        Point[] p = {this.topLeftPoint,this.bottomRightPoint};
        return p;        
    }
    
}
