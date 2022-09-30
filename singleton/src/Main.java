public class Main {

  public static void main(String[] args) {
    System.out.println(Single.getInstance()); //Can only be called once
    System.out.println(Single.getInstance());
  }

}
