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
    
    pr double length
    pr double width
    
    

    public void setPosition(Point startingP, Point EndingP) {
        this.topLeftPoint = startingP;
        this.bottomRightPoint = EndingP;
    }

    @SuppressWarnings("RedundantStringConstructorCall")
    public void setPosition(Point startingP){
        this.topLeftPoint = startingP;
        this.bottomRightPoint = new Point((int)getProperties().get(new String("width"))+(int)topLeftPoint.x,(int)topLeftPoint.y+(int)getProperties().get(new String("length")));
    
    
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
}
