package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointClass {
    //позитивный
    @Test
    public void testPointTrue(){
        Point pa = new Point(12,1);
        Point pb = new Point (12,12);
        Assert.assertEquals (Point.distance(pa, pb), 11.0);
    }
    //негативные
    @Test
    public void testPointFalse(){
        Point pa = new Point(12,1);
        Point pb = new Point (6,6);
        Assert.assertEquals (Point.distance(pa, pb), 6.0);
    }
    @Test
    public void testPointFalse2(){
        Point pa = new Point(9,9);
        Point pb = new Point (7,7);
        Assert.assertEquals (Point.distance(pa, pb), 32);
    }
}