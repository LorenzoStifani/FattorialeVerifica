import static org.junit.Assert.*;

import org.junit.Test;

public class StifaniLorenzoTest_A {

	@Test
	public void test1() {
		StifaniLorenzoClass c = new StifaniLorenzoClass();
		int risOttenuto = c.stifaniMet(4);
		int risAtteso = 24;
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	public void test2() {
		StifaniLorenzoClass c = new StifaniLorenzoClass();
		int risOttenuto = c.stifaniMet(5);
		int risAtteso = 120;
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	public void test3() {
		StifaniLorenzoClass c = new StifaniLorenzoClass();
		int risOttenuto = c.stifaniMet(3);
		int risAtteso = 6;
		assertEquals(risAtteso, risOttenuto);
	}

}
