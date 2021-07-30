package thread;

/**
 * Created by JiaLe on 2021/7/30 19:52
 */
public class AB {
    private volatile boolean flag = false;
    private synchronized void printA() {
        try{
            while (flag) {
                wait();
            }
            System.out.println("A");
            flag = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private synchronized void printB() {
        try{
            while (!flag) {
                wait();
            }
            System.out.println("B");
            flag = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        AB printAB = new AB();
        for (int i = 0; i < 200; i++) {
            new Thread(() -> {
                printAB.printA();
            }).start();
            new Thread(() -> {
                printAB.printB();
            }).start();
        }
    }
}
