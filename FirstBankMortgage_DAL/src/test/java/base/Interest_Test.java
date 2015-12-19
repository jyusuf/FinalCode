package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Interest_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		double testInterestRate = RateDAL.getRate(500);
		assertFalse(testInterestRate == 1);
		
		double testInterestRate1 = RateDAL.getRate(600);
		assertFalse(testInterestRate1 == 1);
	}

}
