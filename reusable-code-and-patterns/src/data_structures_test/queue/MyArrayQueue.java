package data_structures_test.queue;

import data_structures_test.exceptions.MyRuntimeException;


public class MyArrayQueue {

	private static int[] queue;
	private int capacity;
	private int elements = 0;
	private int front = 0;
	private int rear = 0;
	
	public MyArrayQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
	}
	
	public void enqueue(int data) {
		if (isFull()) throw new MyRuntimeException("queue is full");
		queue[rear] = data;
		rear = (rear + 1) % capacity;
		elements++;
	}
	
	public int dequeue() {
		if (isEmpty()) throw new MyRuntimeException("queue is empty");
		int deleted = queue[front];
		front = (front + 1) % capacity;
		elements--;
		return deleted;
	}
	
	public int peek() {
		return queue[front];
	}
	
	public boolean isFull() {
		return elements == capacity;
	}
	
	public boolean isEmpty() {
		return elements == 0;
	}
	
	public int size() {
		return elements;
	}
}
