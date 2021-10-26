package com.shapes.visitor;


import com.shapes.visitor.Shape.Circle;
import com.shapes.visitor.Shape.Rectangle;
import com.shapes.visitor.Shape.Square;

public class AreaCalculator implements Shape.Visitor<Double> {


    public static Double area(Shape shape) {
        return shape.accept(new AreaCalculator());
    }

    @Override
    public Double visit(Square square) {
        return square.side() * square.side();
    }

    @Override
    public Double visit(Circle circle) {
        return circle.radius() * circle.radius() * Math.PI;
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return rectangle.width() * rectangle.height();
    }
}
