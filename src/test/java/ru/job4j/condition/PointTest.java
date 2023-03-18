package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to30then2() {
        double expected = 2;
        Point a = new Point(1, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus20to30then5() {
        double expected = 5;
        Point a = new Point(-2, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus30to30then6() {
        double expected = 6;
        Point a = new Point(-3, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when102to305then3dot606() {
        double expected = 3.606;
        Point a = new Point(1, 0, 2);
        Point b = new Point(3, 0, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when534to845then3dot742() {
        double expected = 3.742;
        Point a = new Point(5, 3, 4);
        Point b = new Point(8, 4, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}