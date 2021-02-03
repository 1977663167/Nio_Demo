package test;

import java.util.Stack;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/27   -   12:01
 **/
public class MyStack<E>  {

    private  int size = 0;
    private Node top;
    private class Node{
        E element;
        Node pre;
        Node(E element){
            this.element = element;
        }
    }

    public E push(E item) {

        Node node = new Node(item);
        node.pre = top;
        top = node;
        size++;
        return item;
    }


    public synchronized E pop() {
        validateEmpty();
        Node n = top;
        top = top.pre;
        n.pre = null;
        size--;
        return n.element;
    }

    private void validateEmpty() {
        if(empty()){
            throw new RuntimeException("栈为空");
        }
    }


    public synchronized E peek() {
        validateEmpty();
        return top.element;
    }


    public boolean empty() {
        return size == 0;
    }
}
