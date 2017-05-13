package ru.stqa.pft.sandbox;

/**
 * Created by Irina on 5/12/17.
 */
public class Point {

  public double p1;
  public double p2;


  public Point(double p1, double p2) {

    this.p1 = p1;
    this.p2 = p2;

  }

  public double dot1() {

    return Math.pow((this.p2 - this.p1), 2);

  }

  public double dot2() {

    return Math.pow((this.p2 - this.p1), 2);

  }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt((Math.pow((p1.p2 - p1.p1), 2) + Math.pow((p2.p2 - p2.p1), 2)));


  }

  public static void main(String[] args) {

    Point p1 = new Point(10, 5);

    Point p2 = new Point(8, 4);

    System.out.println(distance(p1, p2));


  }


}