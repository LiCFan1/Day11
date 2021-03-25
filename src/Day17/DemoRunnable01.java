package Day17;

public class DemoRunnable01 {

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程任务!");
//            }
//        }).start();

        new Thread(() -> {
                System.out.println("多线程任务！");
            }
        ).start();
    }
}
