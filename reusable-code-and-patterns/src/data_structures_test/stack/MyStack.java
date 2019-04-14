package data_structures_test.stack;

import data_structures_test.exceptions.MyRuntimeException;
import data_structures_test.node.Node;

public class MyStack <T> {
	
	private Node<T> top = null;
	private int elements = 0;
	
	public MyStack() {}
	
	public void push(T data) {
		top = new Node<>(data, top);
		elements++;
	}
	
	public T pop() {
		if (isEmpty()) throw new MyRuntimeException("stack is empty");
		T result = top.getData();
		top = top.getNext();
		elements--;
		return result;
	}
	
	public T peek() {
		if (isEmpty()) throw new MyRuntimeException("stack is empty");
		return top.getData();
	}
	
	public T peek(int n) {
		if (isEmpty()) throw new MyRuntimeException("stack is empty");
		if (n > elements) throw new MyRuntimeException("You try to access " + n + " element in stack, where there is only " + elements);
		Node<T> next = top;
		for (int i = 1; i < n; i++)
			next = next.getNext();
		
		return next.getData();
	}
	
	public boolean isEmpty() {
		return elements == 0;
	}
	
	public void clear() {
		while(!isEmpty()) pop();
	}
}
