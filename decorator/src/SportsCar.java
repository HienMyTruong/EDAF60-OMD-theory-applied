public class SportsCar extends CarDecorator {

  public SportsCar(Car car) {
    super(car);
  }

  @Override
  public void install() {
    super.install();
    System.out.println(" Adding features of: Sports Car.");
  }
}
