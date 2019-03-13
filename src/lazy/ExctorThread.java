package lazy;

public class ExctorThread implements Runnable {
    @Override
    public void run() {
        LazyObj lazy = LazyObj.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);
    }
}
