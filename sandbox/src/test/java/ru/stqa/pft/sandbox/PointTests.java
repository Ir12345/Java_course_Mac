package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;


/**
 * Created by Irina on 5/12/17.
 */
public class PointTests {


  @Test
  public void testPoint() {

    Point p1 = new Point(3, 5);

    Point p2 = new Point(6, 10);

    Assert.assertEquals(p1.distanceTo(p2), 5.830951894845301);
  }

  @Test
  public void testPoint1() {

    Point p1 = new Point(2, 6);

    Point p2 = new Point(1, 8);

    Assert.assertEquals(p1.distanceTo(p2), 2.23606797749979);
  }

  @Test
  public void testPoint2() {

    Point p1 = new Point(4, 10);

    Point p2 = new Point(5, 11);

    Assert.assertEquals(p1.distanceTo(p2), 1.4142135623730951);
  }
}

