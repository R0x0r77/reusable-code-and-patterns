package data_structures_test.queue;

import data_structures_test.node.Node;

public class MyQueue <T> {

	private Node<T> front = null;
	private Node<T> rear = null;
	private int elements = 0;
	
	public MyQueue() {}
	
	public void enqueue(T data) {
		Node<T> last = new Node<>(data, null);
		if (isEmpty()) {
			rear = last;
			front = last;
		} else {
//			rear = 
		}
	}
	
	public boolean isEmpty() {
		return elements == 0;
	}
}
