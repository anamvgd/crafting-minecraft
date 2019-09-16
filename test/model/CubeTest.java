package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubeTest<K,V> implements Box<K,V>{

	private K key;
	private V value;
	
	private Cube<K,V> c;
	
	public void setUp1() {
		
	}
	
	@Test
	void testConstructor() {
		setUp1();
		c= new Cube(4,"Iron");
		 assertNotNull("the new battle field is null", c);	   
	}

	@Test
	void testGetkey() {
		setUp1();
		c= new Cube(4,"Iron");
		Integer num=4;
		assertTrue("The key has the wrong value", num==c.getKey());
	}
	
	@Test
	void testGetValue() {
		setUp1();
		c= new Cube(4,"Iron");
		String valu="Iron";
		assertTrue("The value has the wrong statement", valu.equals(c.getValue()));
	}
	
	@Test
	void testSetValue() {
		setUp1();
		c= new Cube(4,"Iron");
		V n=(V) "Gold";
		c.setValue(n);
		assertTrue("The value has the wrong statement", c.getValue().equals("Gold"));
	}
	
	@Test
	void testSetKey() {
		setUp1();
		c= new Cube(4,"Iron");
		Integer k=3;
		c.setKey((K) k);
		assertTrue("The key has the wrong value", c.getKey().equals(3));
	}
	
	@Override
	public K getKey() {
		return null;
	}

	@Override
	public V getValue() {
		return null;
	}

}
