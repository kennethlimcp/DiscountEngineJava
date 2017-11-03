import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DiscountTest extends Discount {

	@Test
	public void testEcho() {
		Discount d = new Discount();
		
		String result = d.echo("test");
		
		assertEquals("test", result);
		assertNotEquals("wrong", result);
	}
	
	@Test
	public void testAddItemToList() {
		Discount d = new Discount();
		int numberOfItems = 0;
		
		assertEquals(0, numberOfItems);

		d.addItem(1234);
		
		numberOfItems = d.getNumberOfItems();
		
		assertEquals(1, numberOfItems);
	}
	
	@Test
	public void testDeleteItemFromList() {
		Discount d = new Discount();
		int numberOfItems = 0;
		
		d.addItem(1234);
		numberOfItems = d.getNumberOfItems();
		
		assertEquals(1, numberOfItems);
		
		d.deleteItem(1234);
		numberOfItems = d.getNumberOfItems();
		
		assertEquals(0, numberOfItems);
	}
	
	@Test
	public void testDeleteItemWithoutAdd() {
		Discount d = new Discount();
		int numberOfItems = 0;
			
		d.deleteItem(1234);
		numberOfItems = d.getNumberOfItems();
		
		assertEquals(0, numberOfItems);
	}
}
