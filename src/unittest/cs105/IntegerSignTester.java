package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.IntegerSign;

public class IntegerSignTester {
	private static final int maximumScore = 6;
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
	public void checkPositive() throws Exception {
		assertEquals("Output should match!", "positive", IntegerSign.determineSign(42));

		totalScore += 2;
	}

	@Test
	public void checkNegative() throws Exception {
		assertEquals("Output should match!", "negative", IntegerSign.determineSign(-42));

		totalScore += 2;
	}
	
	@Test
	public void checkZero() throws Exception {
		assertEquals("Output should match!", "zero", IntegerSign.determineSign(0));

		totalScore += 2;
	}

}
