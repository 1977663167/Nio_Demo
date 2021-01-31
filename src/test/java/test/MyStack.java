package test;

import java.util.Stack;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/27   -   12:01
 **/
public class MyStack<E> extends Stack<E> {


    @Override
    public E push(E item) {
        return super.push(item);
    }

    @Override
    public synchronized E pop() {
        return super.pop();
    }

    @Override
    public synchronized E peek() {
        return super.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }
}
