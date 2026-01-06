package patterns.singleton.lazy;

public final class LazySingleton {
  private static LazySingleton lazySingleton;

  public static LazySingleton getInstance() {
    if (lazySingleton == null) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }

  private LazySingleton() {}

  public void print(String message) {
    System.out.println(message);
  }
}
