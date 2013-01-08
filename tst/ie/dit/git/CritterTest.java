package ie.dit.git;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CritterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Critter c = new Critter();
		c.setEyes(5);
		assertEquals(5, c.getEyes());
	}
	
	@Test
	public void helloTest() {
		Critter c = new Critter();
		assertEquals("Hello John", c.sayHello("John"));
	}

}
