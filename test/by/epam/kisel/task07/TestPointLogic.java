package by.epam.kisel.task07;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

import by.epam.kisel.task07.entity.Point;
import by.epam.kisel.task07.logic.PointLogic;

public class TestPointLogic {

	private Point testPoint1 = new Point(1, 3);
	private Point testPoint2 = new Point(3, 1);
	private Point testPoint3 = new Point(-4, 5);

	@Test
	public void testFindTheNearest() {
		Point expected = testPoint1;
		Point actual = PointLogic.findTheNearest(testPoint1, testPoint3);
		assertEquals(expected, actual);
	}

	@Test
	public void testFindTheNearest_SAME_DISTANCE() {
		Point object = PointLogic.findTheNearest(testPoint1, testPoint2);
		assertNull(object);
	}

	@Test(expected = InputMismatchException.class)
	public void testFindTheNearest_NULL() {
		PointLogic.findTheNearest(null, testPoint3);
	}
}
