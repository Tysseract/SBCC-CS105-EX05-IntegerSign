package unittest.cs105;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.Main;

public class IntegerSignTester {
	public static String[] requiredMethods = new String[] { "isZero", "isPositive", "isNegative" };

	private static final int maximumScore = 6;
	private static final int maximumAssignmentScore = 8;
	private static int totalScore;

	private PrintStream oldOut;
	private InputStream oldIn;
	private ByteArrayOutputStream baos;
	private ByteArrayInputStream bais;
	
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

	public void runTest(int year) {
		this.bais = new ByteArrayInputStream((new Integer(year) + " ").toString().getBytes());
		System.setIn(this.bais);		
	}
	
	@Before
	public void setUp() {
		this.baos = new ByteArrayOutputStream();
		this.oldOut = System.out;
		this.oldIn  = System.in;
		System.setOut(new PrintStream(baos));
	}

	@After
	public void tearDown() {
		System.setOut(this.oldOut);
		System.setIn(this.oldIn);
		
		this.baos.reset();
	}

	@Test
	public void checkPositive() throws Exception {
		runTest(42);
		Main.main(null);
		
		assertEquals("Output should match!", "Enter a number: positive\n", this.baos.toString() );

		totalScore += 2;
	}

	@Test
	public void checkNegative() throws Exception {
		runTest(-42);
		Main.main(null);
		
		assertEquals("Output should match!", "Enter a number: negative\n", this.baos.toString() );

		totalScore += 2;
	}
	
	@Test
	public void checkZero() throws Exception {
		runTest(0);
		Main.main(null);
		
		assertEquals("Output should match!", "Enter a number: zero\n", this.baos.toString() );

		totalScore += 2;
	}

}
