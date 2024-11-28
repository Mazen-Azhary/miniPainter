package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Mazen
 */
public class Square extends Rectangle {
    
    public Square(Point topLeftPoint, double sideLength, Color color, float stroke) {
        super(topLeftPoint,new Point((int)(topLeftPoint.x + sideLength), (int)(topLeftPoint.y + sideLength)),color,stroke);
        setDimentions((int)sideLength);
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        super.setProperties(properties);
        double sideLength = properties.get("SideLength");
        
        this.bottomRightPoint = new Point((int)(topLeftPoint.x + sideLength),(int)(topLeftPoint.y + sideLength));
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }
    
    
    public boolean setDimentions(int len){
    if(len<0){
    return false;
    }
    this.width=this.height=len;
    getProperties().put("SideLength",len*1.0);
    getProperties().put("Width",len*1.0);
    return true;
    }
    

}