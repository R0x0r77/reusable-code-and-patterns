package data_structures_test.queue;

import data_structures_test.exceptions.MyException;

public class MyQueue<T extends Double> {	// extending double (which is stupid, because no generics is needed at all) just to create method sum

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
		Node<T> oldLast = rear;
		rear = new Node<>(data, null);
		if (isEmpty())
			front = oldLast;
		else
			oldLast = rear.next;
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
	
	public T sum(int begin, int end) throws MyException {
		if (elements < end) throw new MyException("queue has only " + elements + " elements");
		if (begin < 1 || end < 1 || begin > end) throw new IllegalArgumentException("bad arguments");
		Node<T> next = front;
		Double sum = (double) 0;
		for (int i = 1; i < begin; i++)
			next = next.next;
		for (int i = begin; i < end; i++) {
			sum += next.data;
			next = next.next;
		}
		return (T) sum;
			
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public int size() {
		return elements;
	}
}
