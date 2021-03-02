package com.yilouwangye.decorator;

public class RedShapeDecorator extends ShapeDecorator{
    // 创建扩展了 ShapeDecorator 类的实体装饰类
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorad(shape);
    }
    private void setRedBorad(Shape shape){
        System.out.println("Borad color:Red");
    }
}
