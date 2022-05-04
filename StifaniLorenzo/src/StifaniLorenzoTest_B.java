import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StifaniLorenzoTest_B {

	StifaniLorenzoClass c;
	
	@Before
	public void setUp() throws Exception {
		c = new StifaniLorenzoClass();
	}

	@Test
	public void test1() {
		int risOttenuto = c.stifaniMet(4);
		int risAtteso = 24;
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	public void test2() {
		int risOttenuto = c.stifaniMet(5);
		int risAtteso = 120;
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	public void test3() {
		int risOttenuto = c.stifaniMet(3);
		int risAtteso = 6;
		assertEquals(risAtteso, risOttenuto);
	}

}
