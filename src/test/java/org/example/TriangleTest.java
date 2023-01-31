package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TriangleTest {
    private final Triangle triangle = new Triangle();
    @Test
    void addition() {
        assertEquals(6, triangle.calculate(3, 4,5));
           }

    @Test
    void notTriangle() {
        assertEquals(0, triangle.calculate(1, 1,5));
    }

    @Test
    void minus() {
        assertEquals(0, triangle.calculate(1, -1,5));
    }

}