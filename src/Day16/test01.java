package Day16;

public class test01 {
    public static void main(String[] args) {
        MyThread thread = new MyThread("线程1");
        thread.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main"+i);
        }
    }
}
