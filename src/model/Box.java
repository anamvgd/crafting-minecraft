package model;

public interface Box<K, V> {
	
	public K getKey();
	public V getValue(K key);

}
