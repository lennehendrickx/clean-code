package com.shapes.visitor;

public interface Shape {

    <T> T accept(Visitor<T> visitor);

    record Square(double side) implements Shape {
        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    record Circle(double radius) implements Shape {
        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    record Rectangle(double width, double height) implements Shape {

        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    interface Visitor<T> {
        T visit(Square square);
        T visit(Circle circle);
        T visit(Rectangle rectangle);
    }
}
