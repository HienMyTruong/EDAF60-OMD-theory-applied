public class LuxuryCar extends CarDecorator {


  public LuxuryCar(Car car) {
    super(car);
  }

  @Override
  public void install() {
    super.install();
    System.out.println(" Adding features of: Luxury Car.");
  }
}
