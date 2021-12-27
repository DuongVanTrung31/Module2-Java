package BT_nextdaycalculator;

import absolutenumbercalculator.AbsoluteNumberCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculator3Test {

    @Test
    void display() {
        int[] number = new int[]{2,1,2018};
        int[] expected = new int[]{2,1,2018};

        int[] result = NextDayCalculator3.display(1,1,2018);
        assertArrayEquals(expected, number);
    }

    @Test
    void display1() {
        int[] number = new int[]{29, 2, 2000};
        int[] expected = new int[]{29, 2, 2000};

        int[] result = NextDayCalculator3.display(28,2,2000);
        assertArrayEquals(expected, number);
    }

    @Test
    void display2() {
        int[] number = new int[]{1,5,2005};
        int[] expected = new int[]{1,5,2005};

        int[] result = NextDayCalculator3.display(30,4,2005);
        assertArrayEquals(expected, number);
    }

    @Test
    void display3() {
        int[] number = new int[]{0,0,0};
        int[] expected = new int[]{0,0,0};

        int[] result = NextDayCalculator3.display1(29,2,2000);
        assertArrayEquals(expected, number);
    }

    @Test
    void display4() {
        int[] number = new int[]{1,3,2000};
        int[] expected = new int[]{1,3,2000};

        int[] result = NextDayCalculator3.display1(28,2,2000);
        assertArrayEquals(expected, number);
    }

    @Test
    void display5() {
        int[] number = new int[]{15,6,2006};
        int[] expected = new int[]{15,6,2006};

        int[] result = NextDayCalculator3.display1(14,6,2006);
        assertArrayEquals(expected, number);
    }
}