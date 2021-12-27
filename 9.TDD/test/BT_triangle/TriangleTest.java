package BT_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void compareTriangle() {
        String result = Triangle.compareTriangle(2,2,2);
        assertEquals("A equilateral triangle", result);
    }

    @Test
    void compareTriangle1() {
        String result = Triangle.compareTriangle(2,2,4);
        assertEquals("A isosceles triangle", result);
    }

    @Test
    void compareTriangle2() {
        String result = Triangle.compareTriangle(2,4,2);
        assertEquals("A isosceles triangle", result);
    }

    @Test
    void compareTriangle3() {
        String result = Triangle.compareTriangle(4,2,2);
        assertEquals("A isosceles triangle", result);
    }

    @Test
    void compareTriangle4() {
        String result = Triangle.compareTriangle(3,4,5);
        assertEquals("A normal triangle", result);
    }

    @Test
    void compareTriangle5() {
        String result = Triangle.compareTriangle(0,4,5);
        assertEquals("Not a triangle!", result);
    }
}