package ly.basetest.Thread;

import java.util.Date;

public class TestThread2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            MyThread.sleep(10000);
            System.out.println("主线程睡眠了10秒种后再次启动了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        thread.flag = false;
    }
}

class MyThread extends Thread{
    boolean flag = true;
    @Override
    public void run() {
        super.run();
        while(true){
            System.out.println("================"+ new Date().toLocaleString()+ "===========================");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}