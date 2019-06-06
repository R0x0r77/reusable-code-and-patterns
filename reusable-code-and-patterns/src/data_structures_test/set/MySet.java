package data_structures_test.set;

import data_structures_test.exceptions.MyException;

@SuppressWarnings("unchecked")
public class MySet<T> {
	
	private int size = 0;
	private int capacity = 1000;
	private T[] set;
	
	public MySet() {
		set = (T[]) new Object[capacity];
	}
	
	public MySet(int capacity) throws IllegalArgumentException{
		if (capacity < 1) 
			throw new IllegalArgumentException("Capacity must be bigger than 0");
		this.capacity = capacity;
		set = (T[]) new Object[capacity];
	}
	
	public T[] getArrayOfElements() {
		T[] array = (T[]) new Object[size];
		for (int i = 0; i < size; i++)
			array[i] = set[i];
		return array;
	}

	public void setArrayOfElements(T[] array) {
		int index = 0;
		for (T t : array)
			if (!isInSet(t))
				set[index++] = t;
		size = index;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isInSet(T obj) {
		for (T t : set)
			if (obj.equals(t))
				return true;
		return false;
	}
	
	public void add(T element) throws MyException {
		if (isFull())
			throw new MyException("set is full");
		if (isInSet(element))
			return;
		set[size++] = element;
	}
	
	public void remove(T element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(set[i])) {
				for (int j = i + 1; j < size; j++) {
					set[j - 1] = set[j];
				}
				set[--size] = null;
				break;
			}
		}	
	}
	
	public void addSet(MySet<T> set) throws MyException {
		for (T t : set.getArrayOfElements())
			add(t);
	}
	
	public void removeSet(MySet<T> set) {
		for (T t : set.getArrayOfElements())
			remove(t);
	}
	
	public boolean isFull() {
		return capacity == size;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (T t : getArrayOfElements())
			sb.append(t.toString() + ", ");
		sb.delete(sb.length() - 2, sb.length() - 1);
		return sb.toString();
	}
}
