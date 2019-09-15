package model;

import java.util.LinkedList;

public class Block<K, V> implements Box<K, V>{
	
	public static final int MAX_BLOCKS = 64;
	private LinkedList<Block<K, V>>[] b;
	private K key;
	private V value;
	
	public Block(K k, V v) {
		super();
		b = new LinkedList[MAX_BLOCKS];
		for (int i = 0; i < MAX_BLOCKS; i++) {
			b[i] = null;
		}
		
		this.key = k;
		this.value = v;
	}

	@Override
	public K getKey() {
		return key;
	}
	

	public Block<K, V> getBlock(K key) {
		if(key==null) {
			return null;
		}
		
		int index = key.hashCode() % MAX_BLOCKS;
		LinkedList<Block<K, V>> items = b[index];
		
		if(items == null) {
			return null;
		}
		
		for (Block<K, V> item : items) {
			if(item.getKey().equals(key)) {
				return item;
			}
		}
		
		return null;
	}
	
	public V getValue(K key) {
		Block<K, V> item = getBlock(key);
		
		if(item == null) {
			return null;
		} else {
			return item.getValue();
		}
	}
	
	public void insert(K key, V value) {
		int index = key.hashCode() % MAX_BLOCKS;
		LinkedList<Block<K, V>> items = b[index];
		
		if(items == null) {
			items = new LinkedList<Block<K, V>>();
			
			Block<K, V> item = new Block<K, V>(key, value);
			items.add(item);
			b[index] = items;
		} else { 
			for (Block<K, V> item : items) {
				if(item.getKey().equals(key)) {
					item.setValue(value);
				}
			}
			
			Block<K, V> item = new Block<K, V>(key, value);
			item.setKey(key);
			item.setValue(value);
			
			items.add(item);
			
		}
	
	}
	
	public void delete(K key) {
		int index = key.hashCode() % MAX_BLOCKS;
		LinkedList<Block<K,V>> items = b[index];
		
		if(items == null) {
			
		}
		
		for (Block<K, V> block : items) {
			if(block.getKey().equals(key)) {
				items.remove(block);
			}
		}
		
		
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public V getValue() {
		return value;
	}
}
