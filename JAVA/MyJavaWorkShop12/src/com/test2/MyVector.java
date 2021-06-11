package com.test2;
import java.util.*;
public class MyVector implements List{
	Object[] data = null;
	int capacity = 0;
	int size = 0;
	public MyVector(int capacity) {
		if(capacity < 0)
			throw new IllegalArgumentException("유효허자 않은 값이다. :"+capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}
	public MyVector() {
		this(10); //크기를 지정하지 않으면 크기를 10으로 한다. 
	}
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0) 
			setCapacity(minCapacity);
	}
	public int capacity() {
		return capacity;
	}
	private void setCapacity(int minCapacity) {
		if(this.capacity==capacity) return;
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity =capacity;
	}
	public void trimToSize() {
		setCapacity(size);
	}
	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	@Override
	public Object[] toArray(Object[] a) {	return null;	}
	@Override
	public boolean add(Object e) {
		ensureCapacity(size+1);
		data[size++] = e;
		return true;
	}
	@Override
	public boolean remove(Object o) {
		for(int i = 0; i < size; i++) {
			if(o.equals(data[i])) {
				remove(i);				
			}
		}
		return false;
	}
	@Override
	public Object remove(int index) {
		Object oldObj = null;
		if(index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		oldObj = data[index];		
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		data[size-1] =null;
		size--;		
		return oldObj;
	}
	@Override
	public void clear() {
		for(int i = 0; i<size; i++) 
			data[i]	= null;
		size = 0;
	}
	@Override
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	@Override
	public boolean containsAll(Collection c) {	return false;	}
	@Override
	public boolean addAll(Collection c) {	return false;	}
	@Override
	public boolean addAll(int index, Collection c) {	return false;	}
	@Override
	public boolean removeAll(Collection c) {	return false;	}
	@Override
	public boolean retainAll(Collection c) {	return false;	}
	@Override
	public int size() {	return size;	}
	@Override
	public boolean isEmpty() {	return size == 0;	}
	@Override
	public boolean contains(Object o) {	return false;	}
	@Override
	public Iterator iterator() { return null;	}
	@Override
	public Object set(int index, Object element) {	return null; }
	@Override
	public void add(int index, Object element) {}
	@Override
	public int indexOf(Object o) {	return 0;	}
	@Override
	public int lastIndexOf(Object o) {	return 0;	}
	@Override
	public ListIterator listIterator() {	return null;	}
	@Override
	public ListIterator listIterator(int index) {	return null;	}
	@Override
	public List subList(int fromIndex, int toIndex) {	return null;	}}