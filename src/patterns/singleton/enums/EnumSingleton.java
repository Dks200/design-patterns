package patterns.singleton.enums;

public enum EnumSingleton {
  INSTANCE;

  public void print(String message) {
    System.out.println(message);
  }
}
