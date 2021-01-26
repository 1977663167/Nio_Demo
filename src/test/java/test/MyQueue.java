package test;


import java.util.AbstractQueue;
import java.util.Iterator;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/26   -   15:23
 **/
public class MyQueue<E> extends AbstractQueue<E> {
    private class Node {
        E val;
        Node next;
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
    int size =0;
    private Node head;
    private Node tail;
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean offer(E e) {
        Node n = new Node(e);
        if(tail == null){
            head = n;
            tail = n;
            head.next = tail;
        } else {
            tail.next = n;
            tail = tail.next;
        }
        size++;
        return true;
    }

    @Override
    public E poll() {
        if(size <= 0){
            throw new RuntimeException("当前队列为空");
        }
        Node n = head;
        head = head.next;
        n.next = null;
        size--;
        return n.val;
    }

    @Override
    public E peek() {
        if(size <= 0){
            throw new RuntimeException("当前队列为空");
        }
        Node n = head;
        return n.val;
    }
}
