package model;

public interface Box<K, V> {
	
	public void delete(K key);
	public void insert(K key, V value);
	public V getValue(K key);

}
