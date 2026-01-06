package patterns.singleton.eager;

public final class EagerSingleton {
  private static final EagerSingleton eagerSingleton = new EagerSingleton();

  public static EagerSingleton getInstance() {
    return eagerSingleton;
  }

  private EagerSingleton() {}

  public void print(String message) {
    System.out.println(message);
  }
}
