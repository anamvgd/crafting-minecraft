package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class BlockTest {

	Block<Integer, String> hashTable = new Block<Integer, String>();
	
	public void setUp1() {
		
		for(int i=0;i<70;i++) {
			Random r = new Random();
	    	int value = r.nextInt(2000)+1;
			
	    	if(i>=0 && i<10) {
	    		hashTable.insert(1, "Wood "+value);
	    	}else if(i>=10 && i<20) {
	    		hashTable.insert(2, "Glass "+value);
	    	}else if(i>=20 && i<30) {
	    		hashTable.insert(3, "Gold "+value);
	    	}else if(i>=30 && i<40) {
	    		hashTable.insert(4, "Magma "+value);
	    	}else if(i>=40 && i<50) {
	    		hashTable.insert(5, "Obsidian "+value);
	    	}else if(i>=50 && i<60) {
	    		hashTable.insert(6, "SouldSand "+value);
	    	}else if(i>=60 && i<70) {
	    		hashTable.insert(7, "StoneBricks "+value);
	    	}
		}	
	}
	
	@Test
	void testInsert() {
		setUp1();
		Random r = new Random();
		int key = r.nextInt(6)+1;
		Cube<Integer, String> c= hashTable.getCube(key);
		assertTrue("The hash table do not save items", c!=null);
	}

	@Test
	void testGetCube() {
		setUp1();
		hashTable.insert(8, "Iron");
		Cube<Integer, String> c= hashTable.getCube(8);
		assertTrue("The hash table do not save items", c!=null);
		assertTrue("The hash table do not return the correct object", c.getKey()==8);
		assertTrue("The hash table do not return the correct object", c.getValue().equals("Iron"));
	}
	
	@Test
	void testGetValue() {
		setUp1();
		hashTable.insert(8, "Iron");
		Cube<Integer, String> c= hashTable.getCube(8);
		assertTrue("The hash table do not return the correct object", c.getValue().equals("Iron"));
	}
	
	@Test
	void testDelete() {
		setUp1();
		hashTable.insert(8, "Iron");
		hashTable.delete(8);
		Cube<Integer, String> c= hashTable.getCube(8);
		assertTrue("The hash table do not deleted the item", c==null);
	}
}
