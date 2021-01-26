package test;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/26   -   19:17
 **/
public class MyDeque<E> implements Deque<E> {

    private int size = 0;
    private Node head;
    private Node tail;

    @Override
    public void addFirst(E e) {
        Node n = new Node(e);
        if (size <= 0) {
            initHead(n);
            return;
        }
        n.next = head;
        head.pre = n;
        head = n;
        size++;
    }

    private void initHead(Node n) {
        head = tail = n;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node n = new Node(e);
        if (size <= 0) {
            initHead(n);
            return;
        }
        n.pre = tail;
        tail.next = n;
        tail = n;
        size++;
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    @Override
    public E removeFirst() {
        E e = pollFirst();
        if (e == null) {
            throw new NoSuchElementException();
        }
        return e;
    }

    @Override
    public E removeLast() {
        E e = pollLast();
        if (e == null) {
            throw new NoSuchElementException();
        }
        return e;
    }

    @Override
    public E pollFirst() {
        if(size <=0){
            return null;
        }
        Node n = head;
        head = head.next;
        n.next = null;
        size--;
        return n.val;
    }

    @Override
    public E pollLast() {
        if(size <=0){
            return null;
        }
        Node n = tail;
        tail = tail.pre;
        n.pre = null;
        size--;
        return n.val;
    }

    @Override
    public E getFirst() {
        return removeFirst();
    }

    @Override
    public E getLast() {
        return removeLast();
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }


    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return pollFirst();
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return getFirst();
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    private class Node {
        E val;
        Node next;
        Node pre;

        public Node(E val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }
}
