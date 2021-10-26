package com.shapes;

import com.shapes.switchpattern.Shape.Circle;
import com.shapes.switchpattern.Shape.Rectangle;
import com.shapes.switchpattern.Shape.Square;
import org.junit.jupiter.api.Test;

import static com.shapes.switchpattern.AreaCalculator.area;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchPatternShapeTest {

    @Test
    void switchPattern() {
        assertThat(area(new Circle(12))).isEqualTo(452.3893421169302);
        assertThat(area(new Rectangle(4, 5))).isEqualTo(20);
        assertThat(area(new Square(5))).isEqualTo(25);
    }

}
