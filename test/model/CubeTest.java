package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubeTest<K,V>{

	private K key;
	private V value;
	
	private Cube<Integer, String> c;
	
	public void setUp1() {
		
	}
	
	@Test
	void testConstructor() {
		setUp1();
		c= new Cube<Integer, String>(4,"Iron");
		 assertNotNull("the new battle field is null", c);	   
	}

	@Test
	void testGetkey() {
		setUp1();
		c= new Cube<Integer, String>(4,"Iron");
		Integer num=4;
		assertTrue("The key has the wrong value", num==c.getKey());
	}
	
	@Test
	void testGetValue() {
		setUp1();
		c= new Cube<Integer, String>(4,"Iron");
		String valu="Iron";
		assertTrue("The value has the wrong statement", valu.equals(c.getValue()));
	}
	
	@Test
	void testSetValue() {
		setUp1();
		c= new Cube<Integer, String>(4,"Iron");
		String n= "Gold";
		c.setValue(n);
		assertTrue("The value has the wrong statement", c.getValue().equals("Gold"));
	}
	
	@Test
	void testSetKey() {
		setUp1();
		c= new Cube<Integer, String>(4,"Iron");
		Integer k=3;
		c.setKey(k);
		assertTrue("The key has the wrong value", c.getKey().equals(3));
	}
	


}
