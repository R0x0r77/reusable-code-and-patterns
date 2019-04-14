package data_structures_test.queue;

import data_structures_test.exceptions.MyRuntimeException;

public class DoubleEndedArrayQueue {

	private int[] queue;
	private int capacity;
	private int elements;
	private int front = -1;
	private int rear = 0;
	
	public DoubleEndedArrayQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
	}
	
	public void addFirst(int data) {
		if (isFull()) throw new MyRuntimeException("queue is full");
		if (front == -1) { 
            front = 0; 
            rear = 0; 
        } else if (front == 0) {
            front = capacity - 1 ;
        } else {
        	front--;
        }
		queue[front] = data;
		elements++;
	}
	
	public void addLast(int data) {
		if (isFull()) throw new MyRuntimeException("queue is full");
		if (front == -1) { 
            front = 0; 
            rear = 0; 
		} else {
            rear = (rear + 1) % capacity; 
		}
		queue[rear] = data;
		elements++;
	}
	
	public int removeFirst() {
		if (isEmpty()) throw new MyRuntimeException("queue is empty");
		int deleted = queue[front];
        front = (front + 1) % capacity;
		elements--;
		return deleted;
	}
	
	public int removeLast() {
		if (isEmpty()) throw new MyRuntimeException("queue is empty");
		int deleted = queue[rear];
		if (rear == 0) {
			rear = capacity - 1;
        } else {
        	rear--;
        }
		elements--;
		return deleted;
	}
	
	public int getFirst() {
		if (isEmpty()) throw new MyRuntimeException("deque is emtpy");
		return queue[front];
	}
	
	public int getLast() {
		if (isEmpty()) throw new MyRuntimeException("deque is emtpy");
		return queue[rear];
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
