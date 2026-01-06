package patterns.singleton.threadsafe;

public class InnerStaticClassSingleton {

    private static class SingletonHolder {
        private static final InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private InnerStaticClassSingleton() {}

    public void print(String message) {
        System.out.println(message);
    }
}