package com.shapes;

import com.shapes.visitor.Shape.Circle;
import com.shapes.visitor.Shape.Rectangle;
import com.shapes.visitor.Shape.Square;
import org.junit.jupiter.api.Test;

import static com.shapes.visitor.AreaCalculator.area;
import static org.assertj.core.api.Assertions.assertThat;

public class VisitorShapeTest {

    @Test
    void visitor() {
        assertThat(area(new Circle(12))).isEqualTo(452.3893421169302);
        assertThat(area(new Rectangle(4, 5))).isEqualTo(20);
        assertThat(area(new Square(5))).isEqualTo(25);
    }

}
