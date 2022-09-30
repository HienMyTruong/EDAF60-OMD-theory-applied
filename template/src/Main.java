public class Main {

  public static void main(String[] args) {
    HouseTemplate house = new WoodenHouse(); //Superclass calls on subclass methods - Hollywood Principle
    house.buildHouse();

    System.out.println("-----");

    house = new GlassHouse();
    house.buildHouse();
  }
}
