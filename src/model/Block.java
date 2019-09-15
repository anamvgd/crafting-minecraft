package model;

public class Block<K, V> implements Box<K, V>{
	
	public static final int MAX_BLOCKS = 64;
	private Block<K, V>[] blocks;
	
	public Block(K k, V v) {
		super();
		blocks = (Block<K, V>[]) new Block[MAX_BLOCKS];
		for (int i = 0; i < MAX_BLOCKS; i++) {
			blocks[i] = null;
		}
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public V getValue(K key) {
		if(key==null) {
			return null;
		}
		
		int index = key.hashCode() % MAX_BLOCKS;
		Block<K, V> items = blocks[index];
		
		if(items == null) {
			return null;
		}
		
		while(items != null) {
			int i = 0;
			if(items.getKey().equals(key)) {
				return items.getValue(key);
			}
			items = items.getNext();
		}
	}
	
	public V search(K key) {
		V item = getValue(key);
		
		if(item == null) {
			return null;
		} else {
			return item;
		}
	}
	
	public void insert(K key, V value) {
		int index = key.hashCode() % MAX_BLOCKS;
		Block<K, V> items = blocks[index];
		
		if(items == null) {
			items = new Block<>(key, value);
			blocks[index] = items;
		} else { 
			while(items != null) {
				if(items.getKey().equals(key)) {
					items.setValue(value);
					return;
				}
				items = items.getNext();
			}
		}
		
		items = blocks[index];
		Block<K, V> item = new Block<>(key,value);
		item.setNext(items);
		items.setPrevious(item);
		blocks[index] = item;
		
	}
	
	
	

}
