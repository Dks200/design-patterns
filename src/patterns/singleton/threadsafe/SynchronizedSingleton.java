package patterns.singleton.threadsafe;

public final class SynchronizedSingleton {
  private static SynchronizedSingleton synchronizedSingleton;

  public static synchronized SynchronizedSingleton getInstance() {
    if (synchronizedSingleton == null) {
      synchronizedSingleton = new SynchronizedSingleton();
    }
    return synchronizedSingleton;
  }

  private SynchronizedSingleton() {}

  public void print(String message) {
    System.out.println(message);
  }
}
