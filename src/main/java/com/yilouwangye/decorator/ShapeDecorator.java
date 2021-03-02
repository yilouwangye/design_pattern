package com.yilouwangye.decorator;

public abstract class ShapeDecorator implements Shape {
    // 创建实现了 Shape 接口的抽象装饰类
    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}
