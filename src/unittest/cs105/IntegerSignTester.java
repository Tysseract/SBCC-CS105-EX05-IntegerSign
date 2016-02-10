package unittest.cs105;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.IntegerSign;

public class IntegerSignTester {
	public static String[] requiredMethods = new String[] { "isZero", "isPositive", "isNegative" };

	private static final int maximumScore = 4;
	private static final int maximumAssignmentScore = 8;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testMethodPresence() throws Exception {
		IntegerSign integerSign = new IntegerSign(100);
		Method[] methods = integerSign.getClass().getMethods();
		ArrayList<String> methodList = new ArrayList<String>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}

		for (String method : requiredMethods) {
			assertTrue("\"" + method + "\"" + " not implemented.", methodList.contains(method));
		}

		totalScore += 2;
	}

	@Test
	public void testIntegerSignSigns() throws Exception {
		IntegerSign integerSign = new IntegerSign(42);
		assertFalse("42 is not zero", integerSign.isZero());
		assertTrue("42 is positive", integerSign.isPositive());
		assertFalse("42 is not negative", integerSign.isNegative());

		integerSign = new IntegerSign(-42);
		assertFalse("-42 is not zero", integerSign.isZero());
		assertFalse("-42 is positive", integerSign.isPositive());
		assertTrue("-42 is not negative", integerSign.isNegative());

		integerSign = new IntegerSign(0);
		assertTrue("0 is zero", integerSign.isZero());
		assertTrue("0 is positive", integerSign.isPositive());
		assertFalse("0 is not negative", integerSign.isNegative());

		totalScore += 2;
	}

}
