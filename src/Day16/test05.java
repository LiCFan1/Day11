package Day16;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test05 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyRunnable my = new MyRunnable();
        service.submit(my); //pool-1-thread-1
        service.submit(my); //pool-1-thread-2
        service.submit(my); //pool-1-thread-1
    }
}
