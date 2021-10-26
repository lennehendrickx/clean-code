package com.shapes.polymorphism;

public interface Shape {

    double area();

    record Square(double side) implements Shape {
        @Override
        public double area() {
            return side * side;
        }
    }

    record Circle(double radius) implements Shape {
        @Override
        public double area() {
            return radius * radius * Math.PI;
        }
    }

    record Rectangle(double width, double height) implements Shape {
        @Override
        public double area() {
            return width * height;
        }
    }
}
