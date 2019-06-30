package data_structures_test.queue;

import data_structures_test.exceptions.MyException;


public class MyQueue<T> {

	private Node<T> front = null;
	private Node<T> rear = null;
	private int elements = 0;
	
	private static class Node<T> {
		T data;
		Node<T> next;
		
		private Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public MyQueue() {}
	
	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data, null);
		if (isEmpty()) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		elements++;
	}
	
	public T dequeue() throws MyException {
		if (isEmpty()) throw new MyException("queue is empty");
		T data = front.data;
		front = front.next;
		elements--;
		if (isEmpty())
			rear = null;
		return data;
	}
	
	public T peek() throws MyException {
		if (isEmpty()) throw new MyException("queue is empty");
		return front.data;
	}
	
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public int size() {
		return elements;
	}
}
