import test.MyDeque;
import test.MyQueue;
import test.MyStack;

import java.util.*;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/26   -   15:22
 **/
public class Main {
    public static void main(String[] args) {
//        testQueue();

//        testDeque();

//        testMystack();
    }

    private static void testMystack() {
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println("myStack.empty() = " + myStack.empty());
//        System.out.println("myStack.pop() = " + myStack.pop());
//        System.out.println("myStack.peek() = " + myStack.peek());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        while (!myStack.empty()){
            System.out.println("myStack.peek() = " + myStack.peek());
            System.out.println("myStack.pop() = " + myStack.pop());
        }
    }

    public static String longestPalindrome(String s) {
        if(s == "") return "";
        char[] arr = s.toCharArray();
        int len = arr.length;
        int index =0,max =0,begin = 0;
        while(index <len){
            int left =index,right=index;
            while(right <(len-1 ) && arr[index] == arr[right+1]){
                right++;
            }
            while(left>0&&right<len-1&&arr[left-1]==arr[right+1]){
                left--;
                right++;
            }

            if(right-left+1 >max){
                max = right-left+1;
                begin = left;
            }
            index++;
        }
        return new String(Arrays.copyOfRange(arr,begin,max));
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
