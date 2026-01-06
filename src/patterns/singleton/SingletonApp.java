package patterns.singleton;

import patterns.singleton.eager.EagerSingleton;
import patterns.singleton.enums.EnumSingleton;
import patterns.singleton.lazy.LazySingleton;

public class SingletonApp {

  public static void main(String[] args) {
    EagerSingleton eagerSingleton = EagerSingleton.getInstance();
    System.out.println(eagerSingleton);
    eagerSingleton.print("Eagerly initialized singleton class");
    EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
    System.out.println(eagerSingleton1);
    System.out.println("======================================");

    LazySingleton lazySingleton = LazySingleton.getInstance();
    System.out.println(lazySingleton);
    lazySingleton.print("Lazily initialized singleton class");
    LazySingleton lazySingleton1 = LazySingleton.getInstance();
    System.out.println(lazySingleton1);
    System.out.println("======================================");

    EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    enumSingleton.print("Enum initialized singleton class");
  }
}
