package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test

  public void testDistance() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(3, 3);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);

  }

  //В этом случае distance возвращает 4.47213595499958, тест должен упасть
  @Test
  public void testDistance2() {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(6, 4);
    Assert.assertEquals(p1.distance(p2), 4.472);
  }
}
