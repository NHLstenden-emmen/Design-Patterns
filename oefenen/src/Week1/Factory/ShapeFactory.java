package Week1.Factory;

import Week1.Decorator.Rectangle;
public class ShapeFactory {
    public Rectangle getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Rectangle();
        }
        return null;
    }
}