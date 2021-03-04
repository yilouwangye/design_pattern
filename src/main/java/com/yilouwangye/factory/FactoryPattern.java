package com.yilouwangye.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        /**
         * 工厂模式可以理解为，要什么生产什么
         */
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
