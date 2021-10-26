package com.shapes.switchpattern;

import com.shapes.switchpattern.Shape.Circle;
import com.shapes.switchpattern.Shape.Rectangle;
import com.shapes.switchpattern.Shape.Square;

public class AreaCalculator {

    public static double area(Shape shape) {
        return switch (shape) {
            case Circle c -> c.radius() * c.radius() * Math.PI;
            case Rectangle r -> r.width() * r.height();
            case Square s -> s.side() * s.side();
        };

    }

}
