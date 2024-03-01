package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch(input){
            //we are returning object on bass of some conditions...
            
            case "CIRCLE":
            return new Circle();
            case "Rectangle":
            return new Rectangle();
            default:
            return null;
        }
    }
    
}
