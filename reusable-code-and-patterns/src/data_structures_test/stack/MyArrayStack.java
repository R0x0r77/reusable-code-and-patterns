package data_structures_test.stack;

import data_structures_test.exceptions.MyRuntimeException;

public class MyArrayStack {
	
	private int topIndex = -1;
	private int[] tab;
	private int size;
	
	public MyArrayStack(int size) {
		this.size = size;
		tab = new int[size];
	}
	
	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	public boolean isFull() {
		return topIndex == size - 1;
	}
	
	public void push(int data) {
		if (isFull()) throw new MyRuntimeException("stack is full");
		tab[++topIndex] = data;
	}
	
	public int pop() {
		if (isEmpty()) throw new MyRuntimeException("stack is empty");
		return tab[topIndex--];
	}
	
	public int peek() {
		if (isEmpty()) throw new MyRuntimeException("stack is empty");
		return tab[topIndex];
	}
	
	public int peek(int n) {
		if (isEmpty()) throw new MyRuntimeException("stack is empty");
		if (n > topIndex + 1) throw new MyRuntimeException("You try to access " + n + " element in stack, where there is only " + (topIndex + 1));
		return tab[topIndex + 1 - n];
	}
	
}
