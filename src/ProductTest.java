import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testGetName() {
		Product p = new Product(1111, "P1", 88.88);
		
		String name = p.getName();
		
		assertEquals("P1", name);
	}
	
	@Test
	public void testSetName() {
		Product p = new Product(1111, "P1", 88.88);
		
		String name = p.getName();
		
		assertEquals("P1", name);
		
		p.setName("P2");
		
		name = p.getName();
		
		assertEquals("P2", name);
	}

	@Test
	public void testGetSku() {
		Product p = new Product(1111, "P1", 88.88);
		
		int name = p.getSku();
		
		assertEquals(1111, name);
	}

	@Test
	public void testSetSku() {
		Product p = new Product(1111, "P1", 88.88);
		
		int name = p.getSku();
		
		assertEquals(1111, name);
			
		p.setSku(2222);
		name = p.getSku();
		
		assertEquals(2222, name);
	}

	@Test
	public void testGetPrice() {
		Product p = new Product(1111, "P1", 88.88);
		
		double name = p.getPrice();
		
		assertEquals(88.88, name, 0.01);
	}

	@Test
	public void testSetPrice() {
		Product p = new Product(1111, "P1", 88.88);
		
		double name = p.getPrice();
		
		assertEquals(88.88, name, 0.01);
		
		p.setPrice(99.99);
		 name = p.getPrice();
			
		assertEquals(99.99, name, 0.01);
	}

}
