package patterns.singleton.threadsafe;

public class DoubleCheckLockSingleton {
    private static volatile DoubleCheckLockSingleton instance;

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }

    private DoubleCheckLockSingleton() {}

    public void print(String message) {
        System.out.println(message);
    }
}