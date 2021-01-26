import test.MyQueue;

/**
 * @author GaoCai  电商交易平台，财务结算组
 * @date 2021/1/26   -   15:22
 **/
public class Main {
    public static void main(String[] args) {
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
        while (queue.size()>0){
            System.out.println("queue = " + queue.poll());
        }

    }
}
