package com.shapes;

import com.shapes.polymorphism.Shape.Circle;
import com.shapes.polymorphism.Shape.Rectangle;
import com.shapes.polymorphism.Shape.Square;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PolymorphicShapeTest {

    @Test
    void polymorphism() {
        assertThat(new Circle(12).area()).isEqualTo(452.3893421169302);
        assertThat(new Rectangle(4, 5).area()).isEqualTo(20);
        assertThat(new Square(5).area()).isEqualTo(25);
    }

}
