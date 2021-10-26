package com.shapes.switchpattern;

public sealed interface Shape {

    record Square(double side) implements Shape {
    }

    record Circle(double radius) implements Shape {
    }

    record Rectangle(double width, double height) implements Shape {
    }
}
