package data_structures_test.other;

import data_structures_test.node.Node;

public class TaskStack {

	private Node<Task> top = null;
	
	public TaskStack() {}
	
	public void push(Task task) {
		if (task.priority >= top.getData().priority) {
			top = new Node<>(task, top);
			return;
		}
		Task higher = pop();
		top = new Node<>(higher, new Node<>(task, top));
	}
	
	public Task pop() {
		Task result = top.getData();
		top = top.getNext();
		return result;
	}
	
	public Task peek() {
		return top.getData();
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void clear() {
		while(!isEmpty()) pop();
	}
	
}
