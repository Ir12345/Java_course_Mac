package ru.stqa.pft.sandbox;

/**
 * Created by Irina on 5/12/17.
 */
public class Point {

  public double x;
  public double y;


  public Point(double x, double y) {

    this.x = x;
    this.y = y;
  }

    public double distanceTo(Point p2) {

    double dx = p2.x - this.x;
    double dy = p2.y - this.y;

    double distance = Math.sqrt(dx * dx + dy * dy);
      return distance;

  }

  public static void main(String[] args) {

    Point p1 = new Point(10, 5);

    Point p2 = new Point(8, 4);

    System.out.println(p1.distanceTo(p2));

  }

}