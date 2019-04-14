package data_structures_test;

import java.util.ArrayList;
import java.util.LinkedList;

import data_structures_test.list.MyLinkedList;
import data_structures_test.queue.DoubleEndedArrayQueue;
import data_structures_test.queue.MyArrayQueue;
import data_structures_test.stack.MyArrayStack;
import data_structures_test.stack.MyStack;


public class MainExam {

	public static void main(String[] args) {
		String s = "";
		MyStack<String> stack = new MyStack<>();
		stack.push("Kamil"); stack.push("Smiech"); stack.push("hehe"); stack.push(null);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek(4));
		
		MyArrayStack stack1 = new MyArrayStack(100);
		stack1.push(1); stack1.push(2); stack1.push(3); stack1.push(4);
		System.out.println(stack1.isEmpty());
		System.out.println(stack1.peek(4));
		System.out.println(stack1.pop());
		System.out.println(stack1.peek(1));
		
		System.out.println(convertToBinary(1027));
		LinkedList<String> list1 = new LinkedList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		DoubleEndedArrayQueue deque = new DoubleEndedArrayQueue(100);
		deque.addFirst(1); deque.addLast(0);
		deque.addFirst(2); deque.addLast(-1); deque.addLast(-2); deque.addFirst(3);
		System.out.println(deque.getLast() + " " + deque.getFirst() + " " +  deque.removeFirst() + " " + deque.removeLast() 
			+ " " + deque.removeLast() + " " + deque.removeFirst() + " " + deque.removeFirst() + " " + deque.removeLast());
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.addFirst(1); list.addLast(0);
		list.addFirst(2); list.addLast(-1); list.addLast(-2); list.addFirst(3);
		System.out.println(list.getLast() + " " + list.getFirst() + " " +  list.removeFirst() + " " + list.removeLast() 
			+ " " + list.removeLast() + " " + list.removeFirst() + " " + list.removeFirst() + " " + list.removeLast());
		
		MyArrayQueue q = new MyArrayQueue(100);
		q.enqueue(1); q.enqueue(2); q.enqueue(3); q.dequeue(); q.enqueue(4); q.enqueue(5);
		System.out.println(q.dequeue() + " " + q.dequeue() + " " + q.dequeue() + " " + q.dequeue());
	}

	
	public static String convertToBinary(int n) {
		MyStack<Integer> stack = new MyStack<>();
		while(n != 0) {
			stack.push(n % 2);
			n /= 2;
		}
		
		String bin = "";
		while(!stack.isEmpty())
			bin += stack.pop();
		
		return bin;
	}
}
