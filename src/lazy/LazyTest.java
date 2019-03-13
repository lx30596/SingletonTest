package lazy;

public class LazyTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExctorThread());
        Thread t2 = new Thread(new ExctorThread());
        t1.start();
        t2.start();
    }
}
