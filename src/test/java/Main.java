import test.MyDeque;
import test.MyQueue;
import test.MyStack;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/26   -   15:22
 **/
public class Main {
    public static void main(String[] args) {
//        testQueue();

//        testDeque();

        MyStack myStack = new MyStack();
        myStack.add(0, 5);
        myStack.add(1, 5);
        myStack.add(2, 5);
        myStack.add(3, 5);
        myStack.add(0, 0);
        System.out.println("myStack = " + myStack);
    }

    private static void testDeque() {
        MyDeque myDeque = new MyDeque();

        for (int i = 0; i < 10; i++) {
            myDeque.addFirst(i);
            myDeque.addLast(i);
        }
        while (myDeque.size() > 0) {
            System.out.println("myDeque = " + myDeque.pop());
        }
    }

    private static void testQueue() {
        MyQueue<Integer> queue = new MyQueue<>();
        try {
            Integer poll = queue.poll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Integer peek = queue.peek();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        while (queue.size() > 0) {
            System.out.println("queue = " + queue.poll());
        }
    }
}
