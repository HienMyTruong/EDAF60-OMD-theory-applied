public class Single {

  private static Single instance;
  private String name;

  public static Single getInstance() {
    if (instance == null) {
      instance = new Single("Test");
      return instance;
    }
    throw new RuntimeException("Object already accessed.");
  }

  private Single(String name) {
    this.name = name;
  }

}
