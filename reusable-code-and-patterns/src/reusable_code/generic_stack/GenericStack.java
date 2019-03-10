package reusable_code.generic_stack;

public class GenericStack <T> {
	private Node<T> topElement = null;
	
	public GenericStack() {}
	
	public boolean isEmpty() {
		return topElement == null;
	}
	
	public T peek() {
		return topElement.getData();
	}

	public void push(T data) {
		topElement = new Node<>(data, topElement);
	}
	
	public void pop() {
		if (!isEmpty()) topElement = topElement.getNext();
	}
	
	public void clearAll() {
		while(!isEmpty()) pop();
	}
	
}
