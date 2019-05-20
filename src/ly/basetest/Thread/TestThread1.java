package ly.basetest.Thread;

/**
 * @author liyang
 */
public class TestThread1 {
    public static void main(String[] args) {
        Runner run = new Runner();
        Thread thread = new Thread(run);
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("main"+i);
        }
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("run"+i);
        }
    }
}