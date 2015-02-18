package testing;

import junit.framework.TestCase;

public class CounterTest extends TestCase {
	 
	public void testCounter() {
		Counter c = new Counter(10);
		assertEquals(c.getCount(), 0);
		assertEquals(c.isMax(), false);
	}
	
	public void testGetCount() {
		Counter c = new Counter(10);
		int i;
		for  (i = 0; i < 10; i++) {
			assertEquals(c.getCount(), i);
			c.count();
		}
		i++;
		c.count();
		assertFalse(c.getCount() == i);
	}
	
}
