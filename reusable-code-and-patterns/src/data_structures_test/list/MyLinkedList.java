package data_structures_test.list;

import java.util.NoSuchElementException;


public class MyLinkedList<E> {
	
	private int size = 0;
	private Node<E> first;
	private Node<E> last;	
	
	public MyLinkedList() {}
	
	
	private static class Node<E> {
	    E item;
	    Node<E> next;
	    Node<E> prev;
	
	    Node(Node<E> prev, E element, Node<E> next) {
	        this.item = element;
	        this.next = next;
	        this.prev = prev;
	    }
	}
	
	
	private void linkFirst(E e) {
	    final Node<E> f = first;
	    final Node<E> newNode = new Node<>(null, e, f);
	    first = newNode;
	    if (f == null)
	        last = newNode;
	    else
	        f.prev = newNode;
	    size++;
	}
	
	
	private void linkLast(E e) {
	    final Node<E> l = last;
	    final Node<E> newNode = new Node<>(l, e, null);
	    last = newNode;
	    if (l == null)
	        first = newNode;
	    else
	        l.next = newNode;
	    size++;
	}
	
	
//	void linkBefore(E e, Node<E> succ) {
//	    final Node<E> pred = succ.prev;
//	    final Node<E> newNode = new Node<>(pred, e, succ);
//	    succ.prev = newNode;
//	    if (pred == null)
//	        first = newNode;
//	    else
//	        pred.next = newNode;
//	    size++;
//	}
	
	
	private E unlinkFirst(Node<E> f) {
	    final E element = f.item;
	    final Node<E> next = f.next;
	    f.item = null;
	    f.next = null;
	    first = next;
	    if (next == null)
	        last = null;
	    else
	        next.prev = null;
	    size--;
	    return element;
	}
	
	
	private E unlinkLast(Node<E> l) {
	    final E element = l.item;
	    final Node<E> prev = l.prev;
	    l.item = null;
	    l.prev = null;
	    last = prev;
	    if (prev == null)
	        first = null;
	    else
	        prev.next = null;
	    size--;
	    return element;
	}
	
	
//	private E unlink(Node<E> x) {
//	    final E element = x.item;
//	    final Node<E> next = x.next;
//	    final Node<E> prev = x.prev;
//	
//	    if (prev == null) {
//	        first = next;
//	    } else {
//	        prev.next = next;
//	        x.prev = null;
//	    }
//	
//	    if (next == null) {
//	        last = prev;
//	    } else {
//	        next.prev = prev;
//	        x.next = null;
//	    }
//	
//	    x.item = null;
//	    size--;
//	    return element;
//	}
	
	public E getFirst() {
	    final Node<E> f = first;
	    if (f == null)
	        throw new NoSuchElementException();
	    return f.item;
	}
	
	public E getLast() {
	    final Node<E> l = last;
	    if (l == null)
	        throw new NoSuchElementException();
	    return l.item;
	}
	
	public E removeFirst() {
	    final Node<E> f = first;
	    if (f == null)
	        throw new NoSuchElementException();
	    return unlinkFirst(f);
	}
	
	public E removeLast() {
	    final Node<E> l = last;
	    if (l == null)
	        throw new NoSuchElementException();
	    return unlinkLast(l);
	}
	
	public void addFirst(E e) {
	    linkFirst(e);
	}
	
	public void addLast(E e) {
	    linkLast(e);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}