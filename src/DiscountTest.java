import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTest extends Discount {

	@Test
	public void testEcho() {
		Discount d = new Discount();
		
		String result = d.echo("test");
		
		assertEquals("test", result);
		assertNotEquals("wrong", result);
	}

}
