import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Irina on 5/12/17.
 */
public class PointTests {


  @Test
  public void testPoint() {

    Point p1 = new Point(3, 5);

    Point p2 = new Point(6, 10);

    Assert.assertEquals(Math.sqrt((Math.pow((p1.p2 - p1.p1), 2) + Math.pow((p2.p2 - p2.p1), 2))), 4.47213595499958);
  }

  @Test
  public void testPoint1() {

    Point p1 = new Point(2, 6);

    Point p2 = new Point(1, 8);

    Assert.assertEquals(Math.sqrt((Math.pow((p1.p2 - p1.p1), 2) + Math.pow((p2.p2 - p2.p1), 2))), 8.06225774829855);
  }

  @Test
  public void testPoint2() {

    Point p1 = new Point(4, 10);

    Point p2 = new Point(5, 11);

    Assert.assertEquals(Math.sqrt((Math.pow((p1.p2 - p1.p1), 2) + Math.pow((p2.p2 - p2.p1), 2))), 8.48528137423857);
  }

}

