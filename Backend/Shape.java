package Backend;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;
import java.awt.Stroke;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class Shape implements ShapeInterface,Serializable{
    protected static final long serialVersionUID = 1L;
    protected Point topLeftPoint;
    protected Point bottomRightPoint;
    protected Map<String, Double> properties = new HashMap<>();
    protected Color color;
    protected boolean fill;
    protected float stroke; 

    
    
    
    public Shape(Point topLeftPoint, Point bottomRightPoint, Color color,float stroke) {
        setPosition(topLeftPoint, bottomRightPoint);
        this.color = color;
        this.stroke=stroke;        
        getProperties().put("Borderwidth", Math.abs(bottomRightPoint.x-topLeftPoint.x)*1.0);
        getProperties().put("Borderlength", Math.abs(bottomRightPoint.y-topLeftPoint.y)*1.0);
        getProperties().put("stroke",stroke*1.0);
        printProperties();
        
    }
    
    
    

    public void setPosition(Point startingP, Point EndingP) {
        
        this.topLeftPoint = startingP;
       // getProperties().put("Borderwidth", Math.abs(bottomRightPoint.x-topLeftPoint.x)*1.0);
       // getProperties().put("Borderlength", Math.abs(bottomRightPoint.y-topLeftPoint.y)*1.0);
       // double width = getProperties().get("Borderwidth");   
       // double length = getProperties().get("Borderlength");
        this.bottomRightPoint = EndingP;
    }

    public void setPosition(Point startingP) {
    this.topLeftPoint = startingP;
    
    
    
    double width = getProperties().get("Borderwidth");   
    double length = getProperties().get("Borderlength");   
    this.bottomRightPoint = new Point((int)(topLeftPoint.x + width),(int) (topLeftPoint.y + length));
}

    
    public void printProperties() {
    getProperties().forEach((key, value) -> 
        System.out.println("Key: " + key + ", Value: " + value)
    );
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
    
    public Point[] getPosition(){
        Point[] p = {this.topLeftPoint,this.bottomRightPoint};
        return p;        
    }
    
    
}
