package model;

import java.util.LinkedList;

public class Block<K, V> {
	
	public static final int MAX_BLOCKS = 64;
	private LinkedList<Cube<K, V>>[] b;
	
	
	
	public Block() {
		super();
		b = new LinkedList[MAX_BLOCKS];
		for (int i = 0; i < MAX_BLOCKS; i++) {
			b[i] = null;
		}
		
	}

	public Cube<K, V> getCube(K key) {
		if(key==null) {
			return null;
		}
		
		int index = key.hashCode() % MAX_BLOCKS;
		LinkedList<Cube<K, V>> items = b[index];
		
		if(items == null) {
			return null;
		}
		
		for (Cube<K, V> item : items) {
			if(item.getKey().equals(key)) {
				return item;
			}
		}
		
		return null;
	}
	
	
	public V getValue(K key) {
		Cube<K, V> item = getCube(key);
		
		if(item == null) {
			return null;
		} else {
			return item.getValue();
		}
	}
	
	public void insert(K key, V value) {
		int index = key.hashCode() % MAX_BLOCKS;
		LinkedList<Cube<K, V>> items = b[index];
		
		if(items == null) {
			items = new LinkedList<Cube<K, V>>();
			
			Cube<K, V> item = new Cube<K, V>(key, value);
			items.add(item);
			b[index] = items;
		} else { 
			for (Cube<K, V> item : items) {
				if(item.getKey().equals(key)) {
					item.setValue(value);
				}
			}
			
			Cube<K, V> item = new Cube<K, V>(key, value);
			item.setKey(key);
			item.setValue(value);
			
			items.add(item);
			
		}
	
	}
	
	public void delete(K key) {
		int index = key.hashCode() % MAX_BLOCKS;
		LinkedList<Cube<K,V>> items = b[index];
		
		if(items == null) {
			
		}
		
		for (Cube<K, V> block : items) {
			if(block.getKey().equals(key)) {
				items.remove(block);
			}
		}
		
		
	}
	
	
}
