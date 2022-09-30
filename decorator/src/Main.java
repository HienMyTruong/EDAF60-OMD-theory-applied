public class Main {

  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.install();

    System.out.println("-----");

    Car luxuryCar = new LuxuryCar(new BasicCar());
    luxuryCar.install();

    System.out.println("-----");

    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.install();
  }
}
