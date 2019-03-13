package lazy;

public class LazyObj {
    private volatile static LazyObj instance;

    private  LazyObj(){
    }

    public synchronized static LazyObj getInstance(){
        if(instance == null){
            instance = new LazyObj();
        }
        return  instance;
    }
}
