package ru.stqa.pft.sandbox;

public class Point {

 public static void main (String[] args) {
     double pa = 7 - 2;
     double pb = 9 - 3;
     double pc = pa + pb;
     System.out.println("Расстояние между точками " + pa + " = " + pb + " = " + pc);
 }

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point p1, Point p2) {
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        return Math.sqrt(x * x + y * y);
    }

    public double area() {
        return  this.x * this.y;
    }

}

