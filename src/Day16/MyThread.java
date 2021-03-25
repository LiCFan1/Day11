package Day16;

public class MyThread extends Thread {

    public MyThread() {
    }

    // 可以对线程起名字
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 这里出现异常是因为sleep方法不讲究，自己没有处理异常，而是使用throws方法抛出给我们解决
            System.out.println("MyThread"+Thread.currentThread().getName() + i);
        }
    }
}
