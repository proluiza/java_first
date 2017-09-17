package ru.stqa.pft.sandbox;

public class Homework {

    public static double distance(Point p1, Point p2) {
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        return Math.sqrt(x * x + y * y);
    }
}

       // Point pa = new Point(3,1);
       // Point pb = new Point(7,7);
      //  System.out.println("Расстояние между точками " + pa + " = " + pb + " = " + Point.distance(pa, pb));

