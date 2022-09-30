public class Light implements Device { //Receiver-class

  @Override
  public void on() {
    System.out.println("Light on.");
  }

  @Override
  public void off() {
    System.out.println("Light off.");
  }

}
