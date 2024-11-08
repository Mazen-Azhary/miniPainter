package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Mazen
 */
public class Square extends Rectangle {
    
    public Square(Point topLeftPoint, double sideLength, Map<String, Double> properties, Color color, float stroke) {
        super(topLeftPoint,new Point((int)(topLeftPoint.x + sideLength), (int)(topLeftPoint.y + sideLength)),properties,color,stroke);
        properties.put("SideLength", sideLength);
        this.setProperties(properties);
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        super.setProperties(properties);
        double sideLength = properties.get("SideLength");
        
        this.bottomRightPoint = new Point((int)(topLeftPoint.x + sideLength),(int)(topLeftPoint.y + sideLength));
    }

    @Override
    public Map<String, Double> getProperties() {
        Map<String, Double> properties = super.getProperties();
        properties.put("SideLength", properties.get("Width")); 
        return properties;
    }

}